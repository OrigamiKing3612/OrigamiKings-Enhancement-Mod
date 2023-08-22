package net.origamiking.mcmods.oem.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class VerticalSlabBlock extends HorizontalFacingBlock /*implements Waterloggable*/ {
    public static final BooleanProperty SINGLE = BooleanProperty.of("single_slab");
    public static Boolean CAN_COMBINE = true;

    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(SINGLE);
        stateManager.add(Properties.HORIZONTAL_FACING);
//        stateManager.add(Properties.WATERLOGGED);
    }


    public VerticalSlabBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(SINGLE, true));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        //this.setDefaultState((BlockState)((BlockState)this.getDefaultState()/*.with(Properties.WATERLOGGED, false)*/));

    }

//    public void playPlaceSound(World world, BlockPos pos){
//        world.playSound(
//                null, pos, blockSoundGroup, SoundCategory.BLOCKS, 1f, 1f
//        );
//    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {

        // changes hitbox depending on block state

        Direction dir = state.get(FACING);
        if (!state.get(SINGLE)) {
            return VoxelShapes.fullCube();
        } else if (dir == Direction.NORTH) {
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

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        ActionResult ACTION;

        ACTION = combineSlab(state, world, pos, player, hand, hit);

        return ACTION;
    }

    Boolean PLACED_SUCESSFULLY = false;

    private ActionResult combineSlab(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (player.getAbilities().allowModifyWorld && player.getStackInHand(hand).equals(new ItemStack(this)) && state.get(SINGLE)) {

            ActionResult RESULT = ActionResult.FAIL;
            player.getBlockX();
            /*LOGGER.info("VERTICAL SLAB");
            LOGGER.info(player.getBlockX());
            LOGGER.info(player.getBlockY());
            LOGGER.info(player.getBlockZ());
            LOGGER.info(hit.getSide());*/

            if (state.get(SINGLE)) {
                Direction HITSIDE = hit.getSide();

                // is facing north and hit from south
                if (state.get(FACING) == Direction.NORTH) {
                    if (HITSIDE == Direction.SOUTH) {
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                }
                // is facing east and hit from west
                else if (state.get(FACING) == Direction.EAST) {
                    if (HITSIDE == Direction.WEST) {
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                }
                // is facing south and hit from north
                else if (state.get(FACING) == Direction.SOUTH) {
                    if (HITSIDE == Direction.NORTH) {
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                }
                // is facing west and hit from east
                else if (state.get(FACING) == Direction.WEST) {
                    if (HITSIDE == Direction.EAST) {
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                } else {

                }

            }

            return RESULT;
        } else {
            return ActionResult.PASS;
        }

    }

    private ActionResult sucessfulPlace(PlayerEntity player, Hand hand, World world, BlockPos pos) {
        // checks if player is in creative and removes 1 item if not
        boolean isInCreative = player.getAbilities().creativeMode;
        if (!isInCreative) {
            player.getStackInHand(hand).setCount(player.getStackInHand(hand).getCount() - 1);
        }
//        playPlaceSound(world, pos);

        // makes arm swing
        return ActionResult.success(world.isClient);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing());
    }


//    @Override
//    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
//        if (state.get(SINGLE) != false) {
//            return Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
//        }
//        return false;
//    }

//    @Override
//    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
//        if (state.get(SINGLE) != false) {
//            return Waterloggable.super.canFillWithFluid(world, pos, state, fluid);
//        }
//        return false;
//    }

//    @Override
//    public FluidState getFluidState(BlockState state) {
//        if (state.get(Properties.WATERLOGGED).booleanValue()) {
//            return Fluids.WATER.getStill(false);
//        }
//        // return state.getFluidState();
//        return state.getFluidState();
//    }

}
