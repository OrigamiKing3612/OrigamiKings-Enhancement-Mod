package net.origamiking.mcmods.oem.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.resource.featuretoggle.ToggleableFeature;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModScreenHandlerType<T extends ScreenHandler> implements ToggleableFeature {
    public static final ScreenHandlerType<WoodcutterScreenHandler> WOODCUTTER = ModScreenHandlerType.register("woodcutter", WoodcutterScreenHandler::new);
    private final FeatureSet requiredFeatures;
    private final ScreenHandlerType.Factory<T> factory;
    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
        return Registry.register(Registries.SCREEN_HANDLER, new Identifier(OemMain.MOD_ID, id), new ScreenHandlerType<T>(factory, FeatureFlags.VANILLA_FEATURES));
    }

    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory, FeatureFlag... requiredFeatures) {
        return Registry.register(Registries.SCREEN_HANDLER, id, new ScreenHandlerType<T>(factory, FeatureFlags.FEATURE_MANAGER.featureSetOf(requiredFeatures)));
    }

    public ModScreenHandlerType(ScreenHandlerType.Factory<T> factory, FeatureSet requiredFeatures) {
        this.factory = factory;
        this.requiredFeatures = requiredFeatures;
    }

    public T create(int syncId, PlayerInventory playerInventory) {
        return this.factory.create(syncId, playerInventory);
    }

    @Override
    public FeatureSet getRequiredFeatures() {
        return this.requiredFeatures;
    }

    public static interface Factory<T extends ScreenHandler> {
        public T create(int var1, PlayerInventory var2);
    }
    public static void get() {}
}
