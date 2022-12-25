package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //translationBuilder.add(ITEM, "Item");
        translationBuilder.add(ModBlocks.GOLD_CHAIN, "Gold Chain");

        try {
            Path exisingFilePath = dataOutput.getModContainer().findPath("assets/oem/en_us.existing.json").get();
            translationBuilder.add(exisingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add to existing language file.");
        }
    }
}
