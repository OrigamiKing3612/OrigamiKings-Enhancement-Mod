package net.origamiking.mcmods.oem.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class PrimBlock extends HorizontalFacingBlock /*implements Waterloggable*/{

    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
//        stateManager.add(Properties.WATERLOGGED);
    }


    public PrimBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        //this.setDefaultState((BlockState)((BlockState)this.getDefaultState()/*.with(Properties.WATERLOGGED, false)*/));

    }

//    public void playPlaceSound(World world, BlockPos pos){
//        world.playSound(
//                null, pos, blockSoundGroup, SoundCategory.BLOCKS, 1f, 1f
//        );
//    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH, SOUTH, EAST, WEST:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
//            case SOUTH:
//                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
//            case EAST:
//                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
//            case WEST:
//                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            default:
                return VoxelShapes.fullCube();
        }
    }
//    private ActionResult sucessfulPlace(PlayerEntity player, Hand hand, World world, BlockPos pos) {
//        // checks if player is in creative and removes 1 item if not
//        boolean isInCreative = player.getAbilities().creativeMode;
//        if (!isInCreative) {
//            player.getStackInHand(hand).setCount(player.getStackInHand(hand).getCount() - 1);
//        }
////        playPlaceSound(world, pos);
//
//        // makes arm swing
//        return ActionResult.success(world.isClient);
//    }

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
