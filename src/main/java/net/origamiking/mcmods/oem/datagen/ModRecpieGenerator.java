package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;

import java.util.function.Consumer;

public class ModRecpieGenerator extends FabricRecipeProvider {
    public ModRecpieGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        RecipeProvider.createStairsRecipe(GlassBlocks.GLASS_STAIR, Ingredient.ofItems(Items.GLASS));
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GLASS_STAIR, Blocks.GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GLASS_SLAB, Blocks.GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.WHITE_GLASS_STAIR, Blocks.WHITE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.WHITE_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_GRAY_GLASS_STAIR, Blocks.LIGHT_GRAY_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_GRAY_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GRAY_GLASS_STAIR, Blocks.GRAY_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GRAY_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLACK_GLASS_STAIR, Blocks.BLACK_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLACK_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BROWN_GLASS_STAIR, Blocks.BROWN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BROWN_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.RED_GLASS_STAIR, Blocks.RED_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.RED_GLASS_SLAB, Blocks.RED_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.ORANGE_GLASS_STAIR, Blocks.ORANGE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.ORANGE_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.YELLOW_GLASS_STAIR, Blocks.YELLOW_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.YELLOW_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIME_GLASS_STAIR, Blocks.LIME_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIME_GLASS_SLAB, Blocks.LIME_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GREEN_GLASS_STAIR, Blocks.GREEN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GREEN_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.CYAN_GLASS_STAIR, Blocks.CYAN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.CYAN_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_BLUE_GLASS_STAIR, Blocks.LIGHT_BLUE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_BLUE_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLUE_GLASS_STAIR, Blocks.BLUE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLUE_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PURPLE_GLASS_STAIR, Blocks.PURPLE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PURPLE_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.MAGENTA_GLASS_STAIR, Blocks.MAGENTA_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.MAGENTA_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PINK_GLASS_STAIR, Blocks.PINK_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PINK_GLASS_SLAB, Blocks.PINK_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_SLAB, Blocks.CALCITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_STAIRS, Blocks.CALCITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_SLAB, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_STAIRS, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_SLAB, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_STAIRS, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_SLAB, Blocks.SNOW_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_STAIRS, Blocks.SNOW_BLOCK);

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocksGlass.GLASS_STAIR, 4)
                .pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.GLASS)
                .criterion(RecipeProvider.hasItem(Blocks.GLASS), RecipeProvider.conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocksGlass.GLASS_STAIR)));*/
        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocksServerSpecific.GOLD_LANTERN, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(Blocks.GLASS), RecipeProvider.conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocksGlass.GLASS_STAIR)));*/
    }
}
