package net.origamiking.mcmods.oem.screen.woodcutter;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;

public class ModScreenHandlerType<T extends ScreenHandler> {
//    public static final ScreenHandlerType<WoodcutterScreenHandler> WOODCUTTER_SCREEN_HANDLER = ModScreenHandlerType.register("woodcutter", WoodcutterScreenHandler::new);
    private final ScreenHandlerType.Factory<T> factory;
    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
        return Registry.register(Registry.SCREEN_HANDLER, new Identifier(OemMain.MOD_ID, id), new ScreenHandlerType<T>(factory));
    }

//    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
//        return Registry.register(Registry.SCREEN_HANDLER, id, new ScreenHandlerType<T>(factory));
//    }

    public ModScreenHandlerType(ScreenHandlerType.Factory<T> factory) {
        this.factory = factory;
    }

    public T create(int syncId, PlayerInventory playerInventory) {
        return this.factory.create(syncId, playerInventory);
    }
    public static interface Factory<T extends ScreenHandler> {
        public T create(int var1, PlayerInventory var2);
    }
}
