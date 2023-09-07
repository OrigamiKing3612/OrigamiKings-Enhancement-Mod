package net.origamiking.mcmods.oem.recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModRecipeType {
    public static final RecipeType<WoodcutterRecipe> WOODCUTTER_RECIPE = register("woodcutter");

    public static void register() {
        OemMain.LOGGER.info("Registering Recipe Types for " + OemMain.VERSION);
    }
    public static <T extends Recipe<?>> RecipeType<T> register(final String id) {
        return Registry.register(Registries.RECIPE_TYPE, new Identifier(OemMain.MOD_ID, id), new RecipeType<T>(){

            public String toString() {
                return id;
            }
        });
    }
}
