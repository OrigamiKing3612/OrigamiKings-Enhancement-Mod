package net.origamiking.mcmods.oem.datagen.models;

import net.minecraft.data.client.BlockStateModelGenerator;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sponge.ModSpongeBlocks;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;
import net.origamiking.mcmods.oemextra.extra.blocks.serverspecific.ServerSpecificBlocks;

public class SimpleCubeAllModels {
    public static void get(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(SpruceWoodBlocks.SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(BirchWoodBlocks.BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(JungleWoodBlocks.JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(AcaciaWoodBlocks.ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(DarkOakWoodBlocks.DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(MangroveWoodBlocks.MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(CrimsonWoodBlocks.CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(WarpedWoodBlocks.WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(AzaleaWoodBlocks.AZALEA_BOOKSHELF);

        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);

        blockStateModelGenerator.registerSimpleCubeAll(RandomBlocks.GUNPOWDER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModSpongeBlocks.LAVA_SPONGE);
        blockStateModelGenerator.registerSimpleCubeAll(ModSpongeBlocks.WET_LAVA_SPONGE);
    }
}
