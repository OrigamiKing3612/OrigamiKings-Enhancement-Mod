package net.origamiking.mcmods.oem.blocks.wool.white;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class WhiteWool extends ModBlocks {
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getWhiteWool() {}
}
