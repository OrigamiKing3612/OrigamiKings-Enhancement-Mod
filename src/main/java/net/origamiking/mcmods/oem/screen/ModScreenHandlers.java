package net.origamiking.mcmods.oem.screen;

import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.screen.woodcutter.WoodcutterScreenHandler;

public class ModScreenHandlers {
    public static ScreenHandlerType<WoodcutterScreenHandler> WOODCUTTER_SCREEN_HANDLER = new ScreenHandlerType<>(WoodcutterScreenHandler::new);

    public static void register() {
        OemMain.LOGGER.info("Registering Screen Handlers for " + OemMain.VERSION);
        
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(OemMain.MOD_ID, "woodcutter"), WOODCUTTER_SCREEN_HANDLER);
    } 
}
