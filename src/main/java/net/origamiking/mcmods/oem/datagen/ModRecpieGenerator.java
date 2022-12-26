package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

import java.util.function.Consumer;

public class ModRecpieGenerator extends FabricRecipeProvider {
    public ModRecpieGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        RecipeProvider.createStairsRecipe(ModBlocks.GLASS_STAIR, Ingredient.ofItems(Items.GLASS));
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_STAIR, Blocks.GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_SLAB, Blocks.GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLASS_STAIR, Blocks.WHITE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLASS_STAIR, Blocks.LIGHT_GRAY_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLASS_STAIR, Blocks.GRAY_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLASS_STAIR, Blocks.BLACK_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLASS_STAIR, Blocks.BROWN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLASS_STAIR, Blocks.RED_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLASS_SLAB, Blocks.RED_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLASS_STAIR, Blocks.ORANGE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLASS_STAIR, Blocks.YELLOW_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLASS_STAIR, Blocks.LIME_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLASS_SLAB, Blocks.LIME_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLASS_STAIR, Blocks.GREEN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLASS_STAIR, Blocks.CYAN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLASS_STAIR, Blocks.LIGHT_BLUE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLASS_STAIR, Blocks.BLUE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLASS_STAIR, Blocks.PURPLE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLASS_STAIR, Blocks.MAGENTA_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLASS_STAIR, Blocks.PINK_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLASS_SLAB, Blocks.PINK_STAINED_GLASS, 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_STAIR, 4)
                .pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.GLASS)
                .criterion(RecipeProvider.hasItem(Blocks.GLASS), RecipeProvider.conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.GLASS_STAIR)));
    }
}
