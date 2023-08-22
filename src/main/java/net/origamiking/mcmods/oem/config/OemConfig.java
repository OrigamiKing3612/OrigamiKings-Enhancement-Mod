package net.origamiking.mcmods.oem.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.origamiking.mcmods.oem.OemMain;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OemConfig {
    public static void load() {
        File configFile = new File(FabricLoader.getInstance().getConfigDir().toFile(), OemMain.MOD_ID + "_config.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if (configFile.exists()) {
            try {
                FileReader fileReader = new FileReader(configFile);
                OemMain.OEM_CONFIG = gson.fromJson(fileReader, OemConfigHandler.class);
                fileReader.close();
                save();
            } catch (IOException e) {
                OemMain.LOGGER.warn("Orm config was not loaded: " + e.getLocalizedMessage());
            }
        } else {
            OemMain.OEM_CONFIG = new OemConfigHandler();
            save();
        }
    }

    public static void save() {
        File configFile = new File(FabricLoader.getInstance().getConfigDir().toFile(), OemMain.MOD_ID + "_config.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if (!configFile.getParentFile().exists()) {
            configFile.getParentFile().mkdir();
        }
        try {
            FileWriter fileWriter = new FileWriter(configFile);
            fileWriter.write(gson.toJson(OemMain.OEM_CONFIG));
            fileWriter.close();
        } catch (IOException e) {
            OemMain.LOGGER.warn("Orm config was not saved: " + e.getLocalizedMessage());
        }
    }
}
