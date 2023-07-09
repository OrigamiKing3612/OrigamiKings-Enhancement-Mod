package net.origamiking.mcmods.oem.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;

public class ModRecipeType {
    public static void register(){
        OemMain.LOGGER.info("Registering Recipe Types for " + OemMain.VERSION);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(OemMain.MOD_ID, WoodcutterRecipe.Serializer.ID),
                WoodcutterRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(OemMain.MOD_ID, WoodcutterRecipe.Type.ID),
                WoodcutterRecipe.Type.INSTANCE);
    }

}
