package net.origamiking.mcmods.oem.datagen.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.stone.StoneVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.wood.WoodVSlabs;

import java.util.function.Consumer;

import static net.origamiking.mcmods.oapi.recipes.ModRecipeProviders.offerVerticalSlabs;

public class VerticalSlabRecipes {
    public static void get(RecipeExporter exporter) {
        offerVerticalSlabs(exporter, StoneVSlabs.STONE_VERTICAL_SLAB, Blocks.STONE);
        offerVerticalSlabs(exporter, StoneVSlabs.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_STONE_BRICK_SLAB, Blocks.STONE_BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_GRANITE_SLAB, Blocks.GRANITE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_DIORITE_SLAB, Blocks.DIORITE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_ANDESITE_SLAB, Blocks.ANDESITE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_BRICK_SLAB, Blocks.BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_MUD_BRICK_SLAB, Blocks.MUD_BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_SANDSTONE_SLAB, Blocks.SANDSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_PRISMARINE_SLAB, Blocks.PRISMARINE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_BLACKSTONE_SLAB, Blocks.BLACKSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_ENDSTONE_BRICK_SLAB, Blocks.END_STONE);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_QUARTZ_SLAB, Blocks.QUARTZ_BLOCK);
        offerVerticalSlabs(exporter, StoneVSlabs.VERTICAL_SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_BIRCH_SLAB, Blocks.BIRCH_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_ACACIA_SLAB, Blocks.ACACIA_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_MANGROVE_SLAB, Blocks.MANGROVE_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
        offerVerticalSlabs(exporter, WoodVSlabs.VERTICAL_WARPED_SLAB, Blocks.WARPED_PLANKS);
        offerVerticalSlabs(exporter, ConcreteVSlabs.WHITE_CONCRETE_VERTICAL_SLAB, Blocks.WHITE_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB, Blocks.GRAY_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB, Blocks.BLACK_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB, Blocks.BROWN_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB, Blocks.RED_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB, Blocks.ORANGE_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB, Blocks.YELLOW_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB, Blocks.LIME_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB, Blocks.GREEN_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB, Blocks.CYAN_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB, Blocks.BLUE_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB, Blocks.PURPLE_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB, Blocks.MAGENTA_CONCRETE);
        offerVerticalSlabs(exporter, ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB, Blocks.PINK_CONCRETE);
        offerVerticalSlabs(exporter, GlassVSlabs.WHITE_GLASS_VERTICAL_SLAB, Blocks.WHITE_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.LIGHT_GRAY_GLASS_VERTICAL_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.GRAY_GLASS_VERTICAL_SLAB, Blocks.GRAY_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.BLACK_GLASS_VERTICAL_SLAB, Blocks.BLACK_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.BROWN_GLASS_VERTICAL_SLAB, Blocks.BROWN_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.RED_GLASS_VERTICAL_SLAB, Blocks.RED_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.ORANGE_GLASS_VERTICAL_SLAB, Blocks.ORANGE_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.YELLOW_GLASS_VERTICAL_SLAB, Blocks.YELLOW_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.LIME_GLASS_VERTICAL_SLAB, Blocks.LIME_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.GREEN_GLASS_VERTICAL_SLAB, Blocks.GREEN_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.CYAN_GLASS_VERTICAL_SLAB, Blocks.CYAN_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.LIGHT_BLUE_GLASS_VERTICAL_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.BLUE_GLASS_VERTICAL_SLAB, Blocks.BLUE_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.PURPLE_GLASS_VERTICAL_SLAB, Blocks.PURPLE_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.MAGENTA_GLASS_VERTICAL_SLAB, Blocks.MAGENTA_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.PINK_GLASS_VERTICAL_SLAB, Blocks.PINK_STAINED_GLASS);
        offerVerticalSlabs(exporter, GlassVSlabs.GLASS_VERTICAL_SLAB, Blocks.GLASS);
    }
}
