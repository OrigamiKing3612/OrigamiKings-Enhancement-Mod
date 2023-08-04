package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
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

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(AcaciaWoodBlocks.ACACIA_LOG_SLAB, "Acacia Log Slab");
        translationBuilder.add(AcaciaWoodBlocks.ACACIA_LOG_STAIRS, "Acacia Log Stairs");
        translationBuilder.add(AzaleaWoodBlocks.AZALEA_LOG_SLAB, "Azalea Log Slab");
        translationBuilder.add(AzaleaWoodBlocks.AZALEA_LOG_STAIRS, "Azalea Log Stairs");
        translationBuilder.add(BirchWoodBlocks.BIRCH_LOG_SLAB, "Birch Log Slab");
        translationBuilder.add(BirchWoodBlocks.BIRCH_LOG_STAIRS, "Birch Log Stairs");
        translationBuilder.add(CrimsonWoodBlocks.CRIMSON_LOG_SLAB, "Crimson Log Slab");
        translationBuilder.add(CrimsonWoodBlocks.CRIMSON_LOG_STAIRS, "Crimson Log Stairs");
        translationBuilder.add(DarkOakWoodBlocks.DARK_OAK_LOG_SLAB, "Dark Oak Slab");
        translationBuilder.add(DarkOakWoodBlocks.DARK_OAK_LOG_STAIRS, "Dark Oak Stairs");
        translationBuilder.add(JungleWoodBlocks.JUNGLE_LOG_SLAB, "Jungle Log Slab");
        translationBuilder.add(JungleWoodBlocks.JUNGLE_LOG_STAIRS, "Jungle Log Stairs");
        translationBuilder.add(MangroveWoodBlocks.MANGROVE_LOG_SLAB, "Mangrove Log Slab");
        translationBuilder.add(MangroveWoodBlocks.MANGROVE_LOG_STAIRS, "Mangrove Log Stairs");
        translationBuilder.add(OakWoodBlocks.OAK_LOG_SLAB, "Oak Log Slab");
        translationBuilder.add(OakWoodBlocks.OAK_LOG_STAIRS, "Oak Log Stairs");
        translationBuilder.add(SpruceWoodBlocks.SPRUCE_LOG_SLAB, "Spruce Log Slab");
        translationBuilder.add(SpruceWoodBlocks.SPRUCE_LOG_STAIRS, "Spruce Log Stairs");
        translationBuilder.add(WarpedWoodBlocks.WARPED_LOG_SLAB, "Warped Log Slab");
        translationBuilder.add(WarpedWoodBlocks.WARPED_LOG_STAIRS, "Warped Log Stairs");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
