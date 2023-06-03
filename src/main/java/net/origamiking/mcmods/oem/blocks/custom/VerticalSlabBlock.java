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


public class VerticalSlabBlock extends HorizontalFacingBlock /*implements Waterloggable*/{
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

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {

        // changes hitbox depending on block state

        Direction dir = state.get(FACING);
        if(!state.get(SINGLE)){
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
    private ActionResult combineSlab(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){

        if (player.getAbilities().allowModifyWorld && player.getStackInHand(hand).isItemEqual(new ItemStack(this)) && state.get(SINGLE)) {

            ActionResult RESULT = ActionResult.FAIL;
            player.getBlockX();

            if(state.get(SINGLE)){
                Direction HITSIDE = hit.getSide();

                if(state.get(FACING) == Direction.NORTH){
                    if(HITSIDE == Direction.SOUTH){
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                }
                else if(state.get(FACING) == Direction.EAST){
                    if(HITSIDE == Direction.WEST){
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                }
                else if(state.get(FACING) == Direction.SOUTH){
                    if(HITSIDE == Direction.NORTH){
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                }
                else if(state.get(FACING) == Direction.WEST){
                    if(HITSIDE == Direction.EAST){
                        world.setBlockState(pos, state.with(SINGLE, false));
                        RESULT = sucessfulPlace(player, hand, world, pos);
                    }
                }

                else{

                }

            }

            return RESULT;
        } else {
            return ActionResult.PASS;
        }

    }

    private ActionResult sucessfulPlace(PlayerEntity player, Hand hand, World world, BlockPos pos) {
        boolean isInCreative = player.getAbilities().creativeMode;
        if (!isInCreative) {
            player.getStackInHand(hand).setCount(player.getStackInHand(hand).getCount() - 1);
        }
        return ActionResult.success(world.isClient);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing());
    }
}
