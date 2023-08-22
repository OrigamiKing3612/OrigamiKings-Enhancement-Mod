package net.origamiking.mcmods.oem.blocks.custom;

import com.google.common.collect.Lists;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Queue;

public class LavaSpongeBlock extends Block {

    private final int range;
    private final int absorbAmount;
    private Block wetSponge;

    public LavaSpongeBlock(Settings settings, int range, int absorbAmount) {
        super(settings);
        this.range = range;
        this.absorbAmount = absorbAmount;
    }

    public void setWetSponge(Block wetSponge) {
        this.wetSponge = wetSponge;
    }

    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!oldState.isOf(state.getBlock())) {
            this.update(world, pos);
        }
    }

    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, block, fromPos, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbLava(world, pos)) {
            world.setBlockState(pos, wetSponge.getDefaultState(), 2);
            world.syncWorldEvent(2001, pos, Block.getRawIdFromState(Blocks.LAVA.getDefaultState()));
        }

    }

    private boolean absorbLava(World world, BlockPos pos) {
        Queue<Pair<BlockPos, Integer>> queue = Lists.newLinkedList();
        queue.add(new Pair<>(pos, 0));
        int i = 0;

        while (!queue.isEmpty()) {
            Pair<BlockPos, Integer> pair = queue.poll();
            BlockPos blockPos = pair.getLeft();
            int j = pair.getRight();
            Direction[] directions = Direction.values();

            for (Direction direction : directions) {
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                FluidState fluidState = world.getFluidState(blockPos2);
                if (fluidState.isIn(FluidTags.LAVA)) {
                    if (blockState.getBlock() instanceof FluidDrainable && !((FluidDrainable) blockState.getBlock()).tryDrainFluid(world, blockPos2, blockState).isEmpty()) {
                        ++i;
                        if (j < range) {
                            queue.add(new Pair<>(blockPos2, j + 1));
                        }
                    } else if (blockState.getBlock() instanceof FluidBlock) {
                        world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), 3);
                        ++i;
                        if (j < range) {
                            queue.add(new Pair<>(blockPos2, j + 1));
                        }
                    }
                }
            }

            if (i > absorbAmount) {
                break;
            }
        }
        return i > 0;
    }

}