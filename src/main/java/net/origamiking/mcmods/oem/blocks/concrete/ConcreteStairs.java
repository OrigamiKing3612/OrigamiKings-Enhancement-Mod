package net.origamiking.mcmods.oem.blocks.concrete;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class ConcreteStairs {
    public static String id = OemMain.MOD_ID;
    public static final Block WHITE_CONCRETE_STAIR = registerBlock(id, "white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.WHITE)));
    public static final Block BLACK_CONCRETE_STAIR = registerBlock(id, "black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIR = registerBlock(id, "light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block GRAY_CONCRETE_STAIR = registerBlock(id, "gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.GRAY)));
    public static final Block BROWN_CONCRETE_STAIR = registerBlock(id, "brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BROWN)));
    public static final Block RED_CONCRETE_STAIR = registerBlock(id, "red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.RED)));
    public static final Block ORANGE_CONCRETE_STAIR = registerBlock(id, "orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.ORANGE)));
    public static final Block YELLOW_CONCRETE_STAIR = registerBlock(id, "yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.YELLOW)));
    public static final Block LIME_CONCRETE_STAIR = registerBlock(id, "lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIME)));
    public static final Block GREEN_CONCRETE_STAIR = registerBlock(id, "green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.GREEN)));
    public static final Block CYAN_CONCRETE_STAIR = registerBlock(id, "cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.CYAN)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIR = registerBlock(id, "light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block BLUE_CONCRETE_STAIR = registerBlock(id, "blue_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLUE)));
    public static final Block PURPLE_CONCRETE_STAIR = registerBlock(id, "purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.PURPLE)));
    public static final Block MAGENTA_CONCRETE_STAIR = registerBlock(id, "magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.MAGENTA)));
    public static final Block PINK_CONCRETE_STAIR = registerBlock(id, "pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.PINK)));

    public static void getConcreteStairs() {}
}
