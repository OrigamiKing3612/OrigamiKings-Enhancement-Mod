package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_FENCE)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_SLAB)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_STAIRS)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_FENCE)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_SLAB)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_STAIRS)
//                .add(BirchWoodBlocks.BIRCH_LOG_FENCE)
//                .add(BirchWoodBlocks.BIRCH_LOG_SLAB)
//                .add(BirchWoodBlocks.BIRCH_LOG_STAIRS)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_FENCE)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_SLAB)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_STAIRS)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_FENCE)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_SLAB)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_STAIRS)
//                .add(JungleWoodBlocks.JUNGLE_LOG_FENCE)
//                .add(JungleWoodBlocks.JUNGLE_LOG_SLAB)
//                .add(JungleWoodBlocks.JUNGLE_LOG_STAIRS)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_FENCE)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_SLAB)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_STAIRS)
//                .add(OakWoodBlocks.OAK_LOG_FENCE)
//                .add(OakWoodBlocks.OAK_LOG_SLAB)
//                .add(OakWoodBlocks.OAK_LOG_STAIRS)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_FENCE)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_SLAB)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_STAIRS)
//                .add(WarpedWoodBlocks.WARPED_LOG_FENCE)
//                .add(WarpedWoodBlocks.WARPED_LOG_SLAB)
//                .add(WarpedWoodBlocks.WARPED_LOG_STAIRS);
//        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_FENCE)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_SLAB)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_STAIRS)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_FENCE)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_SLAB)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_STAIRS)
//                .add(BirchWoodBlocks.BIRCH_LOG_FENCE)
//                .add(BirchWoodBlocks.BIRCH_LOG_SLAB)
//                .add(BirchWoodBlocks.BIRCH_LOG_STAIRS)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_FENCE)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_SLAB)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_STAIRS)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_FENCE)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_SLAB)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_STAIRS)
//                .add(JungleWoodBlocks.JUNGLE_LOG_FENCE)
//                .add(JungleWoodBlocks.JUNGLE_LOG_SLAB)
//                .add(JungleWoodBlocks.JUNGLE_LOG_STAIRS)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_FENCE)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_SLAB)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_STAIRS)
//                .add(OakWoodBlocks.OAK_LOG_FENCE)
//                .add(OakWoodBlocks.OAK_LOG_SLAB)
//                .add(OakWoodBlocks.OAK_LOG_STAIRS)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_FENCE)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_SLAB)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_STAIRS)
//                .add(WarpedWoodBlocks.WARPED_LOG_FENCE)
//                .add(WarpedWoodBlocks.WARPED_LOG_SLAB)
//                .add(WarpedWoodBlocks.WARPED_LOG_STAIRS);
////        getOrCreateTagBuilder(BlockTags.WALLS)
////        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
////        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
////        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
////        getOrCreateTagBuilder(BlockTags.DOORS)
////        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
////        getOrCreateTagBuilder(BlockTags.WOOL)
////        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
//        getOrCreateTagBuilder(BlockTags.ACACIA_LOGS)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_FENCE)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_SLAB)
//                .add(AcaciaWoodBlocks.ACACIA_LOG_STAIRS);
//
//        getOrCreateTagBuilder(ModBlockTags.AZALEA_LOGS)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_FENCE)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_SLAB)
//                .add(AzaleaWoodBlocks.AZALEA_LOG)
//                .add(AzaleaWoodBlocks.STRIPPED_AZALEA_LOG)
//                .add(AzaleaWoodBlocks.AZALEA_WOOD)
//                .add(AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD)
//                .add(AzaleaWoodBlocks.AZALEA_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.BIRCH_LOGS)
//                .add(BirchWoodBlocks.BIRCH_LOG_FENCE)
//                .add(BirchWoodBlocks.BIRCH_LOG_SLAB)
//                .add(BirchWoodBlocks.BIRCH_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.CRIMSON_STEMS)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_FENCE)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_SLAB)
//                .add(CrimsonWoodBlocks.CRIMSON_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.DARK_OAK_LOGS)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_FENCE)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_SLAB)
//                .add(DarkOakWoodBlocks.DARK_OAK_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.JUNGLE_LOGS)
//                .add(JungleWoodBlocks.JUNGLE_LOG_FENCE)
//                .add(JungleWoodBlocks.JUNGLE_LOG_SLAB)
//                .add(JungleWoodBlocks.JUNGLE_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.MANGROVE_LOGS)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_FENCE)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_SLAB)
//                .add(MangroveWoodBlocks.MANGROVE_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.OAK_LOGS)
//                .add(OakWoodBlocks.OAK_LOG_FENCE)
//                .add(OakWoodBlocks.OAK_LOG_SLAB)
//                .add(OakWoodBlocks.OAK_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.SPRUCE_LOGS)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_FENCE)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_SLAB)
//                .add(SpruceWoodBlocks.SPRUCE_LOG_STAIRS);
//
//        getOrCreateTagBuilder(BlockTags.WARPED_STEMS)
//                .add(WarpedWoodBlocks.WARPED_LOG_FENCE)
//                .add(WarpedWoodBlocks.WARPED_LOG_SLAB)
//                .add(WarpedWoodBlocks.WARPED_LOG_STAIRS);
    }
}
