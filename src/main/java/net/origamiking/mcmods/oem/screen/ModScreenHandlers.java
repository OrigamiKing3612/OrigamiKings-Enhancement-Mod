package net.origamiking.mcmods.oem.screen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.screen.woodcutter.WoodcutterScreenHandler;

public class ModScreenHandlers {
    public static ScreenHandlerType<WoodcutterScreenHandler> WOODCUTTER_SCREEN_HANDLER = new ScreenHandlerType<>(WoodcutterScreenHandler::new, FeatureFlags.VANILLA_FEATURES);

    public static void register() {
        OemMain.LOGGER.info("Registering Screen Handlers for " + OemMain.VERSION);
        
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(OemMain.MOD_ID, "woodcutter"), WOODCUTTER_SCREEN_HANDLER);
    } 
}
