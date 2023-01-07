package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add(WhiteWool.WHITE_WOOL_SLAB, "White Wool Slab");
//        translationBuilder.add(WhiteWool.WHITE_WOOL_STAIRS, "White Wool Stairs");
//        translationBuilder.add(WhiteWool.WHITE_WOOL_WALL, "White Wool Wall");
        translationBuilder.add(LightGrayWool.LIGHT_GRAY_WOOL_SLAB, "Light Gray Wool Slab");
        translationBuilder.add(LightGrayWool.LIGHT_GRAY_WOOL_STAIRS, "Light Gray Wool Stairs");
        translationBuilder.add(LightGrayWool.LIGHT_GRAY_WOOL_WALL, "Light Gray Wool Wall");

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
