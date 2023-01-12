package net.origamiking.mcmods.oem.blocks.wool.purple;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class PurpleWool extends ModBlocks {
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getPurpleWool() {}
}
