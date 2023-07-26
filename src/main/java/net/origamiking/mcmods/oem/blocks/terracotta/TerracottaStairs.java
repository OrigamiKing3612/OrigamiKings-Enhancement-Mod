package net.origamiking.mcmods.oem.blocks.terracotta;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class TerracottaStairs {
    public static final Block WHITE_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.WHITE)));
    public static final Block BLACK_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block GRAY_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.GRAY)));
    public static final Block BROWN_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BROWN)));
    public static final Block RED_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.RED)));
    public static final Block ORANGE_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.ORANGE)));
    public static final Block YELLOW_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.YELLOW)));
    public static final Block LIME_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIME)));
    public static final Block GREEN_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.GREEN)));
    public static final Block CYAN_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.CYAN)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block BLUE_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "blue_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLUE)));
    public static final Block PURPLE_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.PURPLE)));
    public static final Block MAGENTA_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.MAGENTA)));
    public static final Block PINK_TERRACOTTA_STAIR = registerBlock(OemMain.MOD_ID, "pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.PINK)));
    public static void get() {
        
    }
}
