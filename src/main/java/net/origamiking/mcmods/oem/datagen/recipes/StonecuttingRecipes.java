package net.origamiking.mcmods.oem.datagen.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;

public class StonecuttingRecipes {
    public static void get(RecipeExporter exporter) {

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GoldBlocks.GOLD_BARS, Blocks.GOLD_BLOCK, 10);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_CHAIN, Blocks.COPPER_BLOCK, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_CHAIN, Blocks.EXPOSED_COPPER, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_CHAIN, Blocks.WEATHERED_COPPER, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_CHAIN, Blocks.OXIDIZED_COPPER, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_BARS, Blocks.COPPER_BLOCK, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_BARS, Blocks.EXPOSED_COPPER, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_BARS, Blocks.WEATHERED_COPPER, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_BARS, Blocks.OXIDIZED_COPPER, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_PRESSURE_PLATE, Blocks.COPPER_BLOCK, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE, Blocks.EXPOSED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE, Blocks.WEATHERED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_BUTTON, Blocks.COPPER_BLOCK, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_DOOR, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_TRAPDOOR, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_HELMET, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_CHESTPLATE, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_LEGGINGS, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_BOOTS, Blocks.COPPER_BLOCK);

        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_DOOR, Blocks.EXPOSED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_TRAPDOOR, Blocks.EXPOSED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_DOOR, Blocks.WEATHERED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_TRAPDOOR, Blocks.WEATHERED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_DOOR, Blocks.OXIDIZED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_TRAPDOOR, Blocks.OXIDIZED_COPPER);
    }
}
