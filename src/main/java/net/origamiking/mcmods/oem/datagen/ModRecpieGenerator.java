package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.items.ModItems;

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
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_SLAB, Blocks.CALCITE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_STAIRS, Blocks.CALCITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_SLAB, Blocks.TUFF, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_STAIRS, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_SLAB, Blocks.TUFF, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_STAIRS, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_SLAB, Blocks.SNOW_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_STAIRS, Blocks.SNOW_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AmethystBlocks.AMETHYST_WALL, Blocks.SNOW_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_WALL, Blocks.CALCITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_WALL, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_WALL, Blocks.SNOW_BLOCK);
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COPPER_NUGGET, RecipeCategory.BUILDING_BLOCKS, Items.COPPER_INGOT);
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
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_HELMET, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_CHESTPLATE, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_LEGGINGS, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_BOOTS, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WhiteWool.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WhiteWool.WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WhiteWool.WHITE_WOOL_WALL, Blocks.WHITE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightGrayWool.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightGrayWool.LIGHT_GRAY_WOOL_STAIRS,Blocks.LIGHT_GRAY_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightGrayWool.LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_WOOL);



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_PRESSURE_PLATE, 2)
                .pattern("   ").pattern("   ").pattern("###").input('#', Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT), RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(CopperBlocks.COPPER_PRESSURE_PLATE)));

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.COPPER_INGOT, 1)
                .pattern("###").pattern("###").pattern("###").input('#', ModItems.COPPER_NUGGET)
                .criterion(RecipeProvider.hasItem(ModItems.COPPER_NUGGET), RecipeProvider.conditionsFromItem(ModItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.COPPER_NUGGET)));*/


        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocksServerSpecific.GOLD_LANTERN, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(Blocks.GLASS), RecipeProvider.conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocksGlass.GLASS_STAIR)));*/
    }
}
