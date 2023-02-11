package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.verticalstairs.stone.StoneVStairs;
import net.origamiking.mcmods.oem.blocks.verticalstairs.wood.WoodVStairs;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;


import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.WALLS)
//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
//        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
//        getOrCreateTagBuilder(BlockTags.DOORS)
//        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
//        getOrCreateTagBuilder(BlockTags.WOOL)
//        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
    }
}
