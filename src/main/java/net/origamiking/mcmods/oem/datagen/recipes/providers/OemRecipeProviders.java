package net.origamiking.mcmods.oem.datagen.recipes.providers;

import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;


public class OemRecipeProviders {
    public static void offerCarpets(Consumer<RecipeJsonProvider> exporter, Block carpet, Block block) {
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, carpet, block, 8);
        RecipeProvider.offerCarpetRecipe(exporter, carpet, block);
    }
}
