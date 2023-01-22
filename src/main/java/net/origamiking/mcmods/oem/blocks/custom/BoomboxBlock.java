package net.origamiking.mcmods.oem.blocks.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class BoomboxBlock extends HorizontalFacingBlock {
    public BoomboxBlock(Settings settings) {
        super(settings);
    }
    public static final BooleanProperty HAS_RECORD;
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        NbtCompound nbtCompound = BlockItem.getBlockEntityNbt(itemStack);
        if (nbtCompound != null && nbtCompound.contains("RecordItem")) {
            world.setBlockState(pos, (BlockState)state.with(HAS_RECORD, true), 2);
        }

    }
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {

        // changes hitbox depending on block state

        Direction dir = state.get(FACING);
        if (dir == Direction.NORTH) {
            return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
        } else if (dir == Direction.SOUTH) {
            return VoxelShapes.cuboid(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
        } else if (dir == Direction.EAST) {
            return VoxelShapes.cuboid(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (dir == Direction.WEST) {
            return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
        }
        return VoxelShapes.fullCube();

    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if ((Boolean)state.get(HAS_RECORD)) {
            this.removeRecord(world, pos);
            state = (BlockState)state.with(HAS_RECORD, false);
            world.emitGameEvent(GameEvent.JUKEBOX_STOP_PLAY, pos, GameEvent.Emitter.of(state));
            world.setBlockState(pos, state, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, state));
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    public void setRecord(@Nullable Entity user, WorldAccess world, BlockPos pos, BlockState state, ItemStack stack) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof JukeboxBlockEntity jukeboxBlockEntity) {
            jukeboxBlockEntity.setRecord(stack.copy());
            jukeboxBlockEntity.startPlaying();
            world.setBlockState(pos, (BlockState)state.with(HAS_RECORD, true), 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(user, state));
        }

    }

    private void removeRecord(World world, BlockPos pos) {
        if (!world.isClient) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof JukeboxBlockEntity) {
                JukeboxBlockEntity jukeboxBlockEntity = (JukeboxBlockEntity)blockEntity;
                ItemStack itemStack = jukeboxBlockEntity.getRecord();
                if (!itemStack.isEmpty()) {
                    world.syncWorldEvent(1010, pos, 0);
                    jukeboxBlockEntity.clear();
                    float f = 0.7F;
                    double d = (double)(world.random.nextFloat() * 0.7F) + 0.15000000596046448;
                    double e = (double)(world.random.nextFloat() * 0.7F) + 0.06000000238418579 + 0.6;
                    double g = (double)(world.random.nextFloat() * 0.7F) + 0.15000000596046448;
                    ItemStack itemStack2 = itemStack.copy();
                    ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + g, itemStack2);
                    itemEntity.setToDefaultPickupDelay();
                    world.spawnEntity(itemEntity);
                }
            }
        }
    }

    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            this.removeRecord(world, pos);
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new JukeboxBlockEntity(pos, state);
    }

    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof JukeboxBlockEntity) {
            Item item = ((JukeboxBlockEntity)blockEntity).getRecord().getItem();
            if (item instanceof MusicDiscItem) {
                return ((MusicDiscItem)item).getComparatorOutput();
            }
        }

        return 0;
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HAS_RECORD});
    }

//    @Nullable
//    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
//        return (Boolean)state.get(HAS_RECORD) ? checkType(type, BlockEntityType.JUKEBOX, JukeboxBlockEntity::tick) : null;
//    }

    static {
        HAS_RECORD = Properties.HAS_RECORD;
    }
}
