package net.origamiking.mcmods.oem.blocks.wool.brown;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class BrownWool extends ModBlocks {
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getBrownWool() {}
}
