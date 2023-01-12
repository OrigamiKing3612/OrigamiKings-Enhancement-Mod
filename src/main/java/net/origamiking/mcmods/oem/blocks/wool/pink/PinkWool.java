package net.origamiking.mcmods.oem.blocks.wool.pink;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class PinkWool extends ModBlocks {
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getPinkWool() {}
}
