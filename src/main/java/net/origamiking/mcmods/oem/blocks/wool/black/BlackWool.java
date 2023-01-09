package net.origamiking.mcmods.oem.blocks.wool.black;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class BlackWool extends ModBlocks {
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));





    public static void getBlackWool() {}
}
