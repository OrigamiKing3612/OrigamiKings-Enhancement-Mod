package net.origamiking.mcmods.oem.recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModRecipeSerializers {
    public static final RecipeSerializer<WoodcutterRecipe> WOODCUTTER = register("woodcutter", new WoodcutterRecipe.Serializer(WoodcutterRecipe::new));

    public static void register() {
        OemMain.LOGGER.info("Registering Recipe Serializers for " + OemMain.VERSION);
    }

    public static <S extends RecipeSerializer<T>, T extends Recipe<?>> S register(String id, S serializer) {
        return (S) Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OemMain.MOD_ID, id), serializer);
    }}
