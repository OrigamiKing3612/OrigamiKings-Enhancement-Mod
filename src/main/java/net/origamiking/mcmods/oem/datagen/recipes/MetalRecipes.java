package net.origamiking.mcmods.oem.datagen.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.recipes.ModRecipeProvider;
import net.origamiking.mcmods.oapi.recipes.ModRecipeProviders;
import net.origamiking.mcmods.oapi.recipes.OrigamiShapedRecipeJsonBuilder;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.copper.WaxedCopperBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.items.ModItems;

import java.util.function.Consumer;

import static net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial.getCopperArmor.*;

public class MetalRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
        ModRecipeProvider.offerBarRecipe(exporter, CopperBlocks.COPPER_BARS, Items.COPPER_INGOT);
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.COPPER_BLOCK));
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.EXPOSED_COPPER));
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.WEATHERED_COPPER));
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.OXIDIZED_COPPER));
        ModRecipeProvider.offerButtonRecipe(exporter, CopperBlocks.COPPER_BUTTON, Blocks.COPPER_BLOCK);
        ModRecipeProvider.offerButtonRecipe(exporter, CopperBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER);
        ModRecipeProvider.offerButtonRecipe(exporter, CopperBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER);
        ModRecipeProvider.offerButtonRecipe(exporter, CopperBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_LANTERN, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_LANTERN, Blocks.EXPOSED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_LANTERN, Blocks.WEATHERED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_LANTERN, Blocks.OXIDIZED_COPPER);
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COPPER_NUGGET, RecipeCategory.BUILDING_BLOCKS, Items.COPPER_INGOT);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.IRON_BAR_DOOR, Blocks.IRON_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.GOLD_BAR_DOOR, Blocks.GOLD_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.COPPER_BAR_DOOR, Blocks.COPPER_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.EXPOSED_COPPER_BAR_DOOR, Blocks.EXPOSED_COPPER, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.WEATHERED_COPPER_BAR_DOOR, Blocks.WEATHERED_COPPER, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.OXIDIZED_COPPER_BAR_DOOR, Blocks.OXIDIZED_COPPER, 2);
        ModRecipeProvider.offerDoorRecipe(exporter,RandomBlocks.IRON_BAR_DOOR, Items.IRON_INGOT);
        ModRecipeProvider.offerDoorRecipe(exporter,RandomBlocks.GOLD_BAR_DOOR, Items.GOLD_INGOT);
        ModRecipeProvider.offerDoorRecipe(exporter,RandomBlocks.COPPER_BAR_DOOR, Items.COPPER_INGOT);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_COPPER_BARS, CopperBlocks.COPPER_BARS);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BARS, CopperBlocks.EXPOSED_COPPER_BARS);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BARS, CopperBlocks.WEATHERED_COPPER_BARS);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BARS, CopperBlocks.OXIDIZED_COPPER_BARS);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_COPPER_CHAIN, CopperBlocks.COPPER_CHAIN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_CHAIN, CopperBlocks.EXPOSED_COPPER_CHAIN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_CHAIN, CopperBlocks.WEATHERED_COPPER_CHAIN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_CHAIN, CopperBlocks.OXIDIZED_COPPER_CHAIN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_COPPER_LANTERN, CopperBlocks.COPPER_LANTERN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_LANTERN, CopperBlocks.EXPOSED_COPPER_LANTERN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_LANTERN, CopperBlocks.WEATHERED_COPPER_LANTERN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_LANTERN, CopperBlocks.OXIDIZED_COPPER_LANTERN);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_COPPER_PRESSURE_PLATE, CopperBlocks.COPPER_PRESSURE_PLATE);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_COPPER_BUTTON, CopperBlocks.COPPER_BUTTON);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BUTTON, CopperBlocks.EXPOSED_COPPER_BUTTON);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BUTTON, CopperBlocks.WEATHERED_COPPER_BUTTON);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BUTTON, CopperBlocks.OXIDIZED_COPPER_BUTTON);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_COPPER_DOOR, CopperBlocks.COPPER_DOOR);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_COPPER_TRAPDOOR, CopperBlocks.COPPER_TRAPDOOR);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_DOOR, CopperBlocks.EXPOSED_COPPER_DOOR);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR, CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_DOOR, CopperBlocks.WEATHERED_COPPER_DOOR);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR, CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR, CopperBlocks.OXIDIZED_COPPER_DOOR);
        ModRecipeProvider.offerWaxableRecipe(exporter, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR, CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
        ModRecipeProvider.offerLanternRecipe(exporter, CopperBlocks.COPPER_LANTERN, Items.COPPER_INGOT);
        ModRecipeProvider.offerBarRecipe(exporter, GoldBlocks.GOLD_BARS, Items.GOLD_INGOT);
        ModRecipeProviders.offerArmorSet(exporter, Items.COPPER_INGOT, COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS);


        OrigamiShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_PRESSURE_PLATE, 2)
                .pattern("   ").pattern("   ").pattern("###").inputWithCriterion('#', Items.COPPER_INGOT)
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(CopperBlocks.COPPER_PRESSURE_PLATE)));
    }
}
