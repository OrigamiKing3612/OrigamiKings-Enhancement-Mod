package net.origamiking.mcmods.oem.screen;

import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.screen.woodcutter.WoodcutterScreenHandler;

import static net.origamiking.mcmods.oapi.screen.ScreenUtils.registerScreenHandler;

public class ModScreenHandlers {
    public static ScreenHandlerType<WoodcutterScreenHandler> WOODCUTTER_SCREEN_HANDLER = registerScreenHandler(OemMain.MOD_ID, "woodcutter", new ScreenHandlerType<>(WoodcutterScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    public static void register() {
        OemMain.LOGGER.info("Registering Screen Handlers for " + OemMain.VERSION);
    }
}
