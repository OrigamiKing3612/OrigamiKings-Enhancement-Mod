package net.origamiking.mcmods.oem.blocks.vercticalslabs.stone;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;

public class StoneVSlabs extends BlocksUtils {
    public static final Block STONE_VERTICAL_SLAB = registerBlock(OemMain.MOD_ID, "vertical_stone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerBlock(OemMain.MOD_ID, "vertical_cobblestone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_smooth_stone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.SMOOTH_STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_SANDSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_sandstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_cut_sandstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.CUT_SANDSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_STONE_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_stone_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_NETHER_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_nether_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block VERTICAL_QUARTZ_SLAB = registerBlock(OemMain.MOD_ID, "vertical_quartz_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = registerBlock(OemMain.MOD_ID, "vertical_smooth_quartz_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_RED_SANDSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_red_sandstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.RED_SANDSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_cut_red_sandstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_PRISMARINE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_prismarine_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.PRISMARINE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_PRISMARINE_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_prismarine_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_dark_prismarine_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.DARK_PRISMARINE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_polished_granite_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.POLISHED_GRANITE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_smooth_red_sandstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_MOSSY_STONE_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_mossy_stone_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS).sounds(BlockSoundGroup.STONE)));

    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_polished_diorite_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.POLISHED_DIORITE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_mossy_cobblestone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_ENDSTONE_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_end_stone_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.END_STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_smooth_sandstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_GRANITE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_granite_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.GRANITE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_ANDESITE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_andesite_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.ANDESITE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_RED_NETHER_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_red_nether_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_polished_andesite_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_DIORITE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_diorite_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.DIORITE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_cobbled_deepslate_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_polished_deepslate_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));
    public static final Block VERTICAL_DEEPSLATE_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_deepslate_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block VERTICAL_DEEPSLATE_TILE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_deepslate_tile_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block VERTICAL_BLACKSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_blackstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.BLACKSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = registerBlock(OemMain.MOD_ID, "vertical_polished_blackstone_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_polished_blackstone_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).sounds(BlockSoundGroup.STONE)));


    public static final Block VERTICAL_MUD_BRICK_SLAB = registerBlock(OemMain.MOD_ID, "vertical_mud_brick_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.MUD_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static void get() {}
}
