package net.origamiking.mcmods.oem.blocks.wool.gray;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class GrayWool extends ModBlocks {
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));

    public static void getGrayWool() {}

}
