package net.origamiking.mcmods.oem.datagen.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.SingleItemRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;
import net.origamiking.mcmods.oem.recipe.WoodcutterRecipe;

import java.util.function.Consumer;

public class WoodcuttingRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, 4);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_STAIRS, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_SLAB, Blocks.BAMBOO_PLANKS, 2);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_FENCE, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_FENCE_GATE, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_DOOR, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_TRAPDOOR, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_PRESSURE_PLATE, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_BUTTON, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_SIGN, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_HANGING_SIGN, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_MOSAIC_STAIRS, Blocks.BAMBOO_MOSAIC);
        offerWoodcuttingRecipe(exporter, Blocks.BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC);
        offerWoodcuttingRecipe(exporter, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK);

        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, 4);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_STAIRS, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_SLAB, Blocks.CHERRY_PLANKS, 2);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_FENCE, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_FENCE_GATE, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_DOOR, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_TRAPDOOR, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_PRESSURE_PLATE, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_BUTTON, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_SIGN, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.CHERRY_HANGING_SIGN, Blocks.CHERRY_PLANKS);
        offerWoodcuttingRecipe(exporter, Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        offerWoodcuttingRecipe(exporter, Blocks.STRIPPED_CHERRY_WOOD, Blocks.CHERRY_WOOD);

        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_PLANKS, AzaleaWoodBlocks.AZALEA_LOG, 4);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_STAIR, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_SLAB, AzaleaWoodBlocks.AZALEA_PLANKS, 2);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_FENCE, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_FENCE_GATE, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_DOOR, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_TRAPDOOR, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_PRESSURE_PLATE, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_BUTTON, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD, AzaleaWoodBlocks.AZALEA_WOOD);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.STRIPPED_AZALEA_LOG, AzaleaWoodBlocks.AZALEA_LOG);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_BARREL, AzaleaWoodBlocks.AZALEA_LOG);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_LADDER, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerWoodcuttingRecipe(exporter, AzaleaWoodBlocks.AZALEA_LOG_FENCE, AzaleaWoodBlocks.AZALEA_PLANKS);


        offerWoodcuttingRecipe(exporter, AcaciaWoodBlocks.ACACIA_BARREL, Blocks.ACACIA_LOG);
        offerWoodcuttingRecipe(exporter, BirchWoodBlocks.BIRCH_BARREL, Blocks.BIRCH_LOG);
        offerWoodcuttingRecipe(exporter, CrimsonWoodBlocks.CRIMSON_BARREL, Blocks.CRIMSON_STEM);
        offerWoodcuttingRecipe(exporter, DarkOakWoodBlocks.DARK_OAK_BARREL, Blocks.DARK_OAK_LOG);
        offerWoodcuttingRecipe(exporter, JungleWoodBlocks.JUNGLE_BARREL, Blocks.JUNGLE_LOG);
        offerWoodcuttingRecipe(exporter, MangroveWoodBlocks.MANGROVE_BARREL, Blocks.MANGROVE_LOG);
        offerWoodcuttingRecipe(exporter, OakWoodBlocks.OAK_BARREL, Blocks.OAK_LOG);
        offerWoodcuttingRecipe(exporter, SpruceWoodBlocks.SPRUCE_BARREL, Blocks.SPRUCE_LOG);
        offerWoodcuttingRecipe(exporter, WarpedWoodBlocks.WARPED_BARREL, Blocks.WARPED_STEM);

        offerWoodcuttingRecipe(exporter, AcaciaWoodBlocks.ACACIA_LADDER, Blocks.ACACIA_LOG, 2);
        offerWoodcuttingRecipe(exporter, BirchWoodBlocks.BIRCH_LADDER, Blocks.BIRCH_LOG, 2);
        offerWoodcuttingRecipe(exporter, CrimsonWoodBlocks.CRIMSON_LADDER, Blocks.CRIMSON_STEM, 2);
        offerWoodcuttingRecipe(exporter, DarkOakWoodBlocks.DARK_OAK_LADDER, Blocks.DARK_OAK_LOG, 2);
        offerWoodcuttingRecipe(exporter, JungleWoodBlocks.JUNGLE_LADDER, Blocks.JUNGLE_LOG, 2);
        offerWoodcuttingRecipe(exporter, MangroveWoodBlocks.MANGROVE_LADDER, Blocks.MANGROVE_LOG, 2);
        offerWoodcuttingRecipe(exporter, OakWoodBlocks.OAK_LADDER, Blocks.OAK_LOG, 2);
        offerWoodcuttingRecipe(exporter, SpruceWoodBlocks.SPRUCE_LADDER, Blocks.SPRUCE_LOG, 2);
        offerWoodcuttingRecipe(exporter, WarpedWoodBlocks.WARPED_LADDER, Blocks.WARPED_STEM, 2);

        offerWoodcuttingRecipe(exporter, AcaciaWoodBlocks.ACACIA_LOG_FENCE, Blocks.ACACIA_LOG);
        offerWoodcuttingRecipe(exporter, BirchWoodBlocks.BIRCH_LOG_FENCE, Blocks.BIRCH_LOG);
        offerWoodcuttingRecipe(exporter, CrimsonWoodBlocks.CRIMSON_LOG_FENCE, Blocks.CRIMSON_STEM);
        offerWoodcuttingRecipe(exporter, DarkOakWoodBlocks.DARK_OAK_LOG_FENCE, Blocks.DARK_OAK_LOG);
        offerWoodcuttingRecipe(exporter, JungleWoodBlocks.JUNGLE_LOG_FENCE, Blocks.JUNGLE_LOG);
        offerWoodcuttingRecipe(exporter, MangroveWoodBlocks.MANGROVE_LOG_FENCE, Blocks.MANGROVE_LOG);
        offerWoodcuttingRecipe(exporter, OakWoodBlocks.OAK_LOG_FENCE, Blocks.OAK_LOG);
        offerWoodcuttingRecipe(exporter, SpruceWoodBlocks.SPRUCE_LOG_FENCE, Blocks.SPRUCE_LOG);
        offerWoodcuttingRecipe(exporter, WarpedWoodBlocks.WARPED_LOG_FENCE, Blocks.WARPED_STEM);
    }
    private static SingleItemRecipeJsonBuilder createWoodcutting(Ingredient input, ItemConvertible output, int count) {
        return new SingleItemRecipeJsonBuilder(RecipeCategory.BUILDING_BLOCKS, WoodcutterRecipe.Serializer.INSTANCE, input, output, count);
    }
    public static void offerWoodcuttingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        offerWoodcuttingRecipe(exporter, output, input, 1);
    }
    public static void offerWoodcuttingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input, int count) {
        createWoodcutting(Ingredient.ofItems(input), output, count).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter, RecipeProvider.convertBetween(output, input) + "_woodcutting");
    }
}
