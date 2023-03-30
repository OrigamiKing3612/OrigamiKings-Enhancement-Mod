package net.origamiking.mcmods.oem.blocks.vercticalslabs.wood;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;

public class WoodVSlabs extends BlocksUtils {
    public static final Block VERTICAL_OAK_SLAB =  registerBlock(OemMain.MOD_ID,"vertical_oak_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_SPRUCE_SLAB =  registerBlock(OemMain.MOD_ID, "vertical_spruce_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_BIRCH_SLAB =  registerBlock(OemMain.MOD_ID, "vertical_birch_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.BIRCH_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_JUNGLE_SLAB =  registerBlock(OemMain.MOD_ID,"vertical_jungle_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_ACACIA_SLAB =  registerBlock(OemMain.MOD_ID,"vertical_acacia_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.ACACIA_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_DARK_OAK_SLAB =  registerBlock(OemMain.MOD_ID,"vertical_dark_oak_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock(OemMain.MOD_ID,"vertical_crimson_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_WARPED_SLAB = registerBlock(OemMain.MOD_ID,"vertical_warped_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.WOOD)));

    public static void get() {}
}
