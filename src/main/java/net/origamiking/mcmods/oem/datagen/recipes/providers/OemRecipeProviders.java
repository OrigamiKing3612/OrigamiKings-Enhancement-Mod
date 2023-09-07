package net.origamiking.mcmods.oem.datagen.recipes.providers;

import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.recipe.book.RecipeCategory;


public class OemRecipeProviders {
    public static void offerCarpets(RecipeExporter exporter, Block carpet, Block block) {
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, carpet, block, 8);
        RecipeProvider.offerCarpetRecipe(exporter, carpet, block);
    }
}
