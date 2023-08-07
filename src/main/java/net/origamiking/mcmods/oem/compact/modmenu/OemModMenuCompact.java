package net.origamiking.mcmods.oem.compact.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.fabricmc.loader.api.FabricLoader;
import net.origamiking.mcmods.oem.config.OemConfigScreen;

public class OemModMenuCompact implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return FabricLoader.getInstance().isModLoaded("cloth-config") ? OemConfigScreen::getScreen : null;
    }
}
