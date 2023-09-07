package net.origamiking.mcmods.oem.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oem.OemMain.getOemConfig;

public class OemConfigScreen {
    public static Screen getScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.translatable("title." + OemMain.MOD_ID + ".config"));
        ConfigCategory general = builder.getOrCreateCategory(Text.translatable("category." + OemMain.MOD_ID + ".general"));

        builder.setSavingRunnable(OemConfig::save);

        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("option." + OemMain.MOD_ID + ".enableWoodcutter"), getOemConfig().enableWoodcutter)
                .setDefaultValue(ConfigDefaultValues.defaultEnableWoodcutter)
                .setSaveConsumer(newValue -> getOemConfig().enableWoodcutter = newValue)
                .build());

        general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("option." + OemMain.MOD_ID + ".disableWoodcutter"), getOemConfig().disableWoodcutter)
                .setDefaultValue(ConfigDefaultValues.defaultDisableWoodcutter)
                .setTooltip(Text.translatable("option." + OemMain.MOD_ID + ".disableWoodcutter.description")
                        .formatted(Formatting.RED, Formatting.BOLD))
                .setSaveConsumer(newValue -> getOemConfig().disableWoodcutter = newValue)
                .requireRestart()
                .build());


        return builder.build();
    }
}
