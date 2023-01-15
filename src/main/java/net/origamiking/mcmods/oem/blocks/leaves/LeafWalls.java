package net.origamiking.mcmods.oem.blocks.leaves;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class LeafWalls extends ModBlocks {

    public static final Block OAK_LEAVES_WALL = registerBlock("oak_leaves_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block SPRUCE_LEAVES_WALL = registerBlock("spruce_leaves_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block BIRCH_LEAVES_WALL = registerBlock("birch_leaves_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block JUNGLE_LEAVES_WALL = registerBlock("jungle_leaves_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block ACACIA_LEAVES_WALL = registerBlock("acacia_leaves_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block DARK_OAK_LEAVES_WALL = registerBlock("dark_oak_leaves_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block MANGROVE_LEAVES_WALL = registerBlock("mangrove_leaves_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));


    public static void getLeafWalls() {}

}
