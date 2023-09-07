package net.origamiking.mcmods.oem.datagen.recipes;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;

import java.util.function.Consumer;

public class OtherRecipes {
    public static void get(RecipeExporter exporter) {


        RecipeProvider.offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.GUNPOWDER_BLOCK, Items.GUNPOWDER);
        RecipeProvider.offerShapelessRecipe(exporter, Items.GUNPOWDER, RandomBlocks.GUNPOWDER_BLOCK, "building_blocks", 4);
    }
}
