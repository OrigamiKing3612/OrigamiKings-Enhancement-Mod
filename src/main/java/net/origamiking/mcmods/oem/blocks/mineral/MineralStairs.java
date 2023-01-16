package net.origamiking.mcmods.oem.blocks.mineral;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class MineralStairs extends ModBlocks {
    public static final Block COAL_BLOCK_STAIRS = registerBlock("coal_block_stairs", new StairsBlock(Blocks.COAL_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    public static final Block GOLD_BLOCK_STAIRS = registerBlock("gold_block_stairs", new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block IRON_BLOCK_STAIRS = registerBlock("iron_block_stairs", new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EMERALD_BLOCK_STAIRS = registerBlock("emerald_block_stairs", new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block LAPIS_BLOCK_STAIRS = registerBlock("lapis_block_stairs", new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block DIAMOND_BLOCK_STAIRS = registerBlock("diamond_block_stairs", new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block NETHERITE_BLOCK_STAIRS = registerBlock("netherite_block_stairs", new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static void getMineralStairs() {}
}
