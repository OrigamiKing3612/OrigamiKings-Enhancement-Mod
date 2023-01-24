package net.origamiking.mcmods.oem.blocks.vercticalslabs.wood;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.ModVericalSlabs;

public class WoodVSlabs extends ModVericalSlabs {
    public static final Block VERTICAL_OAK_SLAB =  registerBlock("vertical_oak_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_SPRUCE_SLAB =  registerBlock("vertical_spruce_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_BIRCH_SLAB =  registerBlock("vertical_birch_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_JUNGLE_SLAB =  registerBlock("vertical_jungle_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_ACACIA_SLAB =  registerBlock("vertical_acacia_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_DARK_OAK_SLAB =  registerBlock("vertical_dark_oak_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.WOOD)));

    public static void get() {}
}
