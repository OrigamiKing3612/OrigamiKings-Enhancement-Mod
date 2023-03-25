package net.origamiking.mcmods.oem.blocks.mineral;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class MineralStairs extends BlocksUtils {
    public static final Block COAL_BLOCK_STAIRS = registerBlock(OemMain.MOD_ID, "coal_block_stairs", new StairsBlock(Blocks.COAL_BLOCK.getDefaultState(), OrigamiBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    public static final Block GOLD_BLOCK_STAIRS = registerBlock(OemMain.MOD_ID, "gold_block_stairs", new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(),OrigamiBlockSettings .copyOf(Blocks.GOLD_BLOCK)));
    public static final Block IRON_BLOCK_STAIRS = registerBlock(OemMain.MOD_ID, "iron_block_stairs", new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(),OrigamiBlockSettings .copyOf(Blocks.IRON_BLOCK)));
    public static final Block EMERALD_BLOCK_STAIRS = registerBlock(OemMain.MOD_ID, "emerald_block_stairs", new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(),OrigamiBlockSettings .copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block LAPIS_BLOCK_STAIRS = registerBlock(OemMain.MOD_ID, "lapis_block_stairs", new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(),OrigamiBlockSettings .copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block DIAMOND_BLOCK_STAIRS = registerBlock(OemMain.MOD_ID, "diamond_block_stairs", new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(),OrigamiBlockSettings .copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block NETHERITE_BLOCK_STAIRS = registerBlock(OemMain.MOD_ID, "netherite_block_stairs", new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(),OrigamiBlockSettings .copyOf(Blocks.NETHERITE_BLOCK)));
    public static void getMineralStairs() {}
}
