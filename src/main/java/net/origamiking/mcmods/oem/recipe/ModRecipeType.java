package net.origamiking.mcmods.oem.recipe;

import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModRecipeType {
    public static final RecipeType<WoodcutterRecipe> WOODCUTTER_RECIPE = Registry.register(Registries.RECIPE_TYPE, new Identifier(OemMain.MOD_ID, WoodcutterRecipe.Type.ID),
            WoodcutterRecipe.Type.INSTANCE);

    public static void register() {
        OemMain.LOGGER.info("Registering Recipe Types for " + OemMain.VERSION);
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OemMain.MOD_ID, WoodcutterRecipe.Serializer.ID),
                WoodcutterRecipe.Serializer.INSTANCE);
    }
}
