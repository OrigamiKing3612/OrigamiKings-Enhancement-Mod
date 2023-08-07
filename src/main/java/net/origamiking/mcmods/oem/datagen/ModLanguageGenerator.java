package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.oem.OemMain;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add("title." + OemMain.MOD_ID + ".config", "Oem Config");
//        translationBuilder.add("category." + OemMain.MOD_ID + ".general", "Oem General");
//        translationBuilder.add("option." + OemMain.MOD_ID + ".enableWoodcutter", "Enable Woodcutter");
//        translationBuilder.add("option." + OemMain.MOD_ID + ".disableWoodcutter", "Disable Woodcutter");
//        translationBuilder.add("option." + OemMain.MOD_ID + ".disableWoodcutter.description", "Removes Woodcutter from the game. All woodcutters from existing worlds will be removed if loaded when this is enabled.\nRequires Restart.");
        translationBuilder.add("option." + OemMain.MOD_ID + ".disableOldWorldScreen", "Disables the old Create New World Screen");
        translationBuilder.add("option." + OemMain.MOD_ID + ".disableOldWorldScreen.description", "Changes the Create New World Screen back to the 1.20+ Screen");

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").orElseThrow();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
