package net.origamiking.mcmods.oem.blocks.wool.lime;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class LimeWool extends ModBlocks {
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getLimeWool() {}
}
