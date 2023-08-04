package net.origamiking.mcmods.oem.datagen.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafCarpets;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.terracotta.TerracottaSlabs;
import net.origamiking.mcmods.oem.blocks.terracotta.TerracottaStairs;
import net.origamiking.mcmods.oem.blocks.terracotta.TerracottaWalls;
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
import net.origamiking.mcmods.oem.blocks.wool.black.BlackWool;
import net.origamiking.mcmods.oem.blocks.wool.blue.BlueWool;
import net.origamiking.mcmods.oem.blocks.wool.brown.BrownWool;
import net.origamiking.mcmods.oem.blocks.wool.cyan.CyanWool;
import net.origamiking.mcmods.oem.blocks.wool.gray.GrayWool;
import net.origamiking.mcmods.oem.blocks.wool.green.GreenWool;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.lightblue.LightBlueWool;
import net.origamiking.mcmods.oem.blocks.wool.lime.LimeWool;
import net.origamiking.mcmods.oem.blocks.wool.magenta.MagentaWool;
import net.origamiking.mcmods.oem.blocks.wool.orange.OrangeWool;
import net.origamiking.mcmods.oem.blocks.wool.pink.PinkWool;
import net.origamiking.mcmods.oem.blocks.wool.purple.PurpleWool;
import net.origamiking.mcmods.oem.blocks.wool.red.RedWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;

import java.util.function.Consumer;

import static net.origamiking.mcmods.oapi.recipes.ModRecipeProviders.offerBlockSet;
import static net.origamiking.mcmods.oem.datagen.recipes.providers.OemRecipeProviders.offerCarpets;

public class BlockSetRecipes {
    public static void get(Consumer<RecipeJsonProvider> exporter) {
        offerBlockSet(exporter, Blocks.BLACK_WOOL, BlackWool.BLACK_WOOL_SLAB, BlackWool.BLACK_WOOL_STAIRS, BlackWool.BLACK_WOOL_WALL);
        offerBlockSet(exporter, Blocks.GRAY_WOOL, GrayWool.GRAY_WOOL_SLAB, GrayWool.GRAY_WOOL_STAIRS, GrayWool.GRAY_WOOL_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_GRAY_WOOL, LightGrayWool.LIGHT_GRAY_WOOL_SLAB, LightGrayWool.LIGHT_GRAY_WOOL_STAIRS, LightGrayWool.LIGHT_GRAY_WOOL_WALL);
        offerBlockSet(exporter, Blocks.WHITE_WOOL, WhiteWool.WHITE_WOOL_SLAB, WhiteWool.WHITE_WOOL_STAIRS, WhiteWool.WHITE_WOOL_WALL);
        offerBlockSet(exporter, Blocks.BROWN_WOOL, BrownWool.BROWN_WOOL_SLAB, BrownWool.BROWN_WOOL_STAIRS, BrownWool.BROWN_WOOL_WALL);
        offerBlockSet(exporter, Blocks.RED_WOOL, RedWool.RED_WOOL_SLAB, RedWool.RED_WOOL_STAIRS, RedWool.RED_WOOL_WALL);
        offerBlockSet(exporter, Blocks.ORANGE_WOOL, OrangeWool.ORANGE_WOOL_SLAB, OrangeWool.ORANGE_WOOL_STAIRS, OrangeWool.ORANGE_WOOL_WALL);
        offerBlockSet(exporter, Blocks.YELLOW_WOOL, YellowWool.YELLOW_WOOL_SLAB, YellowWool.YELLOW_WOOL_STAIRS, YellowWool.YELLOW_WOOL_WALL);
        offerBlockSet(exporter, Blocks.LIME_WOOL, LimeWool.LIME_WOOL_SLAB, LimeWool.LIME_WOOL_STAIRS, LimeWool.LIME_WOOL_WALL);
        offerBlockSet(exporter, Blocks.GREEN_WOOL, GreenWool.GREEN_WOOL_SLAB, GreenWool.GREEN_WOOL_STAIRS, GreenWool.GREEN_WOOL_WALL);
        offerBlockSet(exporter, Blocks.CYAN_WOOL, CyanWool.CYAN_WOOL_SLAB, CyanWool.CYAN_WOOL_STAIRS, CyanWool.CYAN_WOOL_WALL);
        offerBlockSet(exporter, Blocks.BLUE_WOOL, BlueWool.BLUE_WOOL_SLAB, BlueWool.BLUE_WOOL_STAIRS, BlueWool.BLUE_WOOL_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_BLUE_WOOL, LightBlueWool.LIGHT_BLUE_WOOL_SLAB, LightBlueWool.LIGHT_BLUE_WOOL_STAIRS, LightBlueWool.LIGHT_BLUE_WOOL_WALL);
        offerBlockSet(exporter, Blocks.PURPLE_WOOL, PurpleWool.PURPLE_WOOL_SLAB, PurpleWool.PURPLE_WOOL_STAIRS, PurpleWool.PURPLE_WOOL_WALL);
        offerBlockSet(exporter, Blocks.MAGENTA_WOOL, MagentaWool.MAGENTA_WOOL_SLAB, MagentaWool.MAGENTA_WOOL_STAIRS, MagentaWool.MAGENTA_WOOL_WALL);
        offerBlockSet(exporter, Blocks.PINK_WOOL, PinkWool.PINK_WOOL_SLAB, PinkWool.PINK_WOOL_STAIRS, PinkWool.PINK_WOOL_WALL);

        offerBlockSet(exporter, Blocks.BLACK_CONCRETE, ConcreteSlabs.BLACK_CONCRETE_SLAB, ConcreteStairs.BLACK_CONCRETE_STAIR, ConcreteWalls.BLACK_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.GRAY_CONCRETE, ConcreteSlabs.GRAY_CONCRETE_SLAB, ConcreteStairs.GRAY_CONCRETE_STAIR, ConcreteWalls.GRAY_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_GRAY_CONCRETE, ConcreteSlabs.LIGHT_GRAY_CONCRETE_SLAB, ConcreteStairs.LIGHT_GRAY_CONCRETE_STAIR, ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.WHITE_CONCRETE, ConcreteSlabs.WHITE_CONCRETE_SLAB, ConcreteStairs.WHITE_CONCRETE_STAIR, ConcreteWalls.WHITE_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.BROWN_CONCRETE, ConcreteSlabs.BROWN_CONCRETE_SLAB, ConcreteStairs.BROWN_CONCRETE_STAIR, ConcreteWalls.BROWN_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.RED_CONCRETE, ConcreteSlabs.RED_CONCRETE_SLAB, ConcreteStairs.RED_CONCRETE_STAIR, ConcreteWalls.RED_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.ORANGE_CONCRETE, ConcreteSlabs.ORANGE_CONCRETE_SLAB, ConcreteStairs.ORANGE_CONCRETE_STAIR, ConcreteWalls.ORANGE_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.YELLOW_CONCRETE, ConcreteSlabs.YELLOW_CONCRETE_SLAB, ConcreteStairs.YELLOW_CONCRETE_STAIR, ConcreteWalls.YELLOW_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.LIME_CONCRETE, ConcreteSlabs.LIME_CONCRETE_SLAB, ConcreteStairs.LIME_CONCRETE_STAIR, ConcreteWalls.LIME_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.GREEN_CONCRETE, ConcreteSlabs.GREEN_CONCRETE_SLAB, ConcreteStairs.GREEN_CONCRETE_STAIR, ConcreteWalls.GREEN_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.CYAN_CONCRETE, ConcreteSlabs.CYAN_CONCRETE_SLAB, ConcreteStairs.CYAN_CONCRETE_STAIR, ConcreteWalls.CYAN_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.BLUE_CONCRETE, ConcreteSlabs.BLUE_CONCRETE_SLAB, ConcreteStairs.BLUE_CONCRETE_STAIR, ConcreteWalls.BLUE_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_BLUE_CONCRETE, ConcreteSlabs.LIGHT_BLUE_CONCRETE_SLAB, ConcreteStairs.LIGHT_BLUE_CONCRETE_STAIR, ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.PURPLE_CONCRETE, ConcreteSlabs.PURPLE_CONCRETE_SLAB, ConcreteStairs.PURPLE_CONCRETE_STAIR, ConcreteWalls.PURPLE_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.MAGENTA_CONCRETE, ConcreteSlabs.MAGENTA_CONCRETE_SLAB, ConcreteStairs.MAGENTA_CONCRETE_STAIR, ConcreteWalls.MAGENTA_CONCRETE_WALL);
        offerBlockSet(exporter, Blocks.PINK_CONCRETE, ConcreteSlabs.PINK_CONCRETE_SLAB, ConcreteStairs.PINK_CONCRETE_STAIR, ConcreteWalls.PINK_CONCRETE_WALL);

        offerBlockSet(exporter, Blocks.GLASS, GlassBlocks.GLASS_SLAB, GlassBlocks.GLASS_STAIR, GlassBlocks.GLASS_WALL);
        offerBlockSet(exporter, Blocks.BLACK_STAINED_GLASS, GlassBlocks.BLACK_GLASS_SLAB, GlassBlocks.BLACK_GLASS_STAIR, GlassBlocks.BLACK_GLASS_WALL);
        offerBlockSet(exporter, Blocks.GRAY_STAINED_GLASS, GlassBlocks.GRAY_GLASS_SLAB, GlassBlocks.GRAY_GLASS_STAIR, GlassBlocks.GRAY_GLASS_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_GRAY_STAINED_GLASS, GlassBlocks.LIGHT_GRAY_GLASS_SLAB, GlassBlocks.LIGHT_GRAY_GLASS_STAIR, GlassBlocks.LIGHT_GRAY_GLASS_WALL);
        offerBlockSet(exporter, Blocks.WHITE_STAINED_GLASS, GlassBlocks.WHITE_GLASS_SLAB, GlassBlocks.WHITE_GLASS_STAIR, GlassBlocks.WHITE_GLASS_WALL);
        offerBlockSet(exporter, Blocks.BROWN_STAINED_GLASS, GlassBlocks.BROWN_GLASS_SLAB, GlassBlocks.BROWN_GLASS_STAIR, GlassBlocks.BROWN_GLASS_WALL);
        offerBlockSet(exporter, Blocks.RED_STAINED_GLASS, GlassBlocks.RED_GLASS_SLAB, GlassBlocks.RED_GLASS_STAIR, GlassBlocks.RED_GLASS_WALL);
        offerBlockSet(exporter, Blocks.ORANGE_STAINED_GLASS, GlassBlocks.ORANGE_GLASS_SLAB, GlassBlocks.ORANGE_GLASS_STAIR, GlassBlocks.ORANGE_GLASS_WALL);
        offerBlockSet(exporter, Blocks.YELLOW_STAINED_GLASS, GlassBlocks.YELLOW_GLASS_SLAB, GlassBlocks.YELLOW_GLASS_STAIR, GlassBlocks.YELLOW_GLASS_WALL);
        offerBlockSet(exporter, Blocks.LIME_STAINED_GLASS, GlassBlocks.LIME_GLASS_SLAB, GlassBlocks.LIME_GLASS_STAIR, GlassBlocks.LIME_GLASS_WALL);
        offerBlockSet(exporter, Blocks.GREEN_STAINED_GLASS, GlassBlocks.GREEN_GLASS_SLAB, GlassBlocks.GREEN_GLASS_STAIR, GlassBlocks.GREEN_GLASS_WALL);
        offerBlockSet(exporter, Blocks.CYAN_STAINED_GLASS, GlassBlocks.CYAN_GLASS_SLAB, GlassBlocks.CYAN_GLASS_STAIR, GlassBlocks.CYAN_GLASS_WALL);
        offerBlockSet(exporter, Blocks.BLUE_STAINED_GLASS, GlassBlocks.BLUE_GLASS_SLAB, GlassBlocks.BLUE_GLASS_STAIR, GlassBlocks.BLUE_GLASS_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_BLUE_STAINED_GLASS, GlassBlocks.LIGHT_BLUE_GLASS_SLAB, GlassBlocks.LIGHT_BLUE_GLASS_STAIR, GlassBlocks.LIGHT_BLUE_GLASS_WALL);
        offerBlockSet(exporter, Blocks.PURPLE_STAINED_GLASS, GlassBlocks.PURPLE_GLASS_SLAB, GlassBlocks.PURPLE_GLASS_STAIR, GlassBlocks.PURPLE_GLASS_WALL);
        offerBlockSet(exporter, Blocks.MAGENTA_STAINED_GLASS, GlassBlocks.MAGENTA_GLASS_SLAB, GlassBlocks.MAGENTA_GLASS_STAIR, GlassBlocks.MAGENTA_GLASS_WALL);
        offerBlockSet(exporter, Blocks.PINK_STAINED_GLASS, GlassBlocks.PINK_GLASS_SLAB, GlassBlocks.PINK_GLASS_STAIR, GlassBlocks.PINK_GLASS_WALL);

        offerBlockSet(exporter, Blocks.OAK_LEAVES, LeafSlabs.OAK_LEAVES_SLAB, LeafStairs.OAK_LEAVES_STAIRS, LeafWalls.OAK_LEAVES_WALL);
        offerBlockSet(exporter, Blocks.SPRUCE_LEAVES, LeafSlabs.SPRUCE_LEAVES_SLAB, LeafStairs.SPRUCE_LEAVES_STAIRS, LeafWalls.SPRUCE_LEAVES_WALL);
        offerBlockSet(exporter, Blocks.BIRCH_LEAVES, LeafSlabs.BIRCH_LEAVES_SLAB, LeafStairs.BIRCH_LEAVES_STAIRS, LeafWalls.BIRCH_LEAVES_WALL);
        offerBlockSet(exporter, Blocks.JUNGLE_LEAVES, LeafSlabs.JUNGLE_LEAVES_SLAB, LeafStairs.JUNGLE_LEAVES_STAIRS, LeafWalls.JUNGLE_LEAVES_WALL);
        offerBlockSet(exporter, Blocks.ACACIA_LEAVES, LeafSlabs.ACACIA_LEAVES_SLAB, LeafStairs.ACACIA_LEAVES_STAIRS, LeafWalls.ACACIA_LEAVES_WALL);
        offerBlockSet(exporter, Blocks.DARK_OAK_LEAVES, LeafSlabs.DARK_OAK_LEAVES_SLAB, LeafStairs.DARK_OAK_LEAVES_STAIRS, LeafWalls.DARK_OAK_LEAVES_WALL);
        offerBlockSet(exporter, Blocks.MANGROVE_LEAVES, LeafSlabs.MANGROVE_LEAVES_SLAB, LeafStairs.MANGROVE_LEAVES_STAIRS, LeafWalls.MANGROVE_LEAVES_WALL);

        offerBlockSet(exporter, Blocks.AMETHYST_BLOCK, AmethystBlocks.AMETHYST_SLAB, AmethystBlocks.AMETHYST_STAIR, AmethystBlocks.AMETHYST_WALL);
        offerBlockSet(exporter, Blocks.CALCITE, RandomBlocks.CALSITE_SLAB, RandomBlocks.CALSITE_STAIRS, RandomBlocks.CALSITE_WALL);
        offerBlockSet(exporter, Blocks.TUFF, RandomBlocks.TUFF_SLAB, RandomBlocks.TUFF_STAIRS, RandomBlocks.TUFF_WALL);
        offerBlockSet(exporter, Blocks.SMOOTH_BASALT, RandomBlocks.SMOOTH_BASALT_SLAB, RandomBlocks.SMOOTH_BASALT_STAIRS, RandomBlocks.SMOOTH_BASALT_WALL);
        offerBlockSet(exporter, Blocks.NETHERRACK, RandomBlocks.NETHERRACK_SLAB, RandomBlocks.NETHERRACK_STAIRS, RandomBlocks.NETHERRACK_WALL);
        offerBlockSet(exporter, Blocks.DRIPSTONE_BLOCK, RandomBlocks.DRIPSTONE_SLAB, RandomBlocks.DRIPSTONE_STAIRS, RandomBlocks.DRIPSTONE_WALL);
        offerBlockSet(exporter, Blocks.SNOW_BLOCK, RandomBlocks.SNOW_SLAB, RandomBlocks.SNOW_STAIRS, RandomBlocks.SNOW_WALL);
        offerBlockSet(exporter, Blocks.SCULK, SculkBlocks.SCULK_SLAB, SculkBlocks.SCULK_STAIR, SculkBlocks.SCULK_WALL);

        offerCarpets(exporter, LeafCarpets.OAK_LEAVES_CARPET, Blocks.OAK_LEAVES);
        offerCarpets(exporter, LeafCarpets.SPRUCE_LEAVES_CARPET, Blocks.SPRUCE_LEAVES);
        offerCarpets(exporter, LeafCarpets.BIRCH_LEAVES_CARPET, Blocks.BIRCH_LEAVES);
        offerCarpets(exporter, LeafCarpets.JUNGLE_LEAVES_CARPET, Blocks.JUNGLE_LEAVES);
        offerCarpets(exporter, LeafCarpets.ACACIA_LEAVES_CARPET, Blocks.ACACIA_LEAVES);
        offerCarpets(exporter, LeafCarpets.DARK_OAK_LEAVES_CARPET, Blocks.DARK_OAK_LEAVES);
        offerCarpets(exporter, LeafCarpets.MANGROVE_LEAVES_CARPET, Blocks.MANGROVE_LEAVES);

        offerBlockSet(exporter, Blocks.BLACK_TERRACOTTA, TerracottaSlabs.BLACK_TERRACOTTA_SLAB, TerracottaStairs.BLACK_TERRACOTTA_STAIR, TerracottaWalls.BLACK_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.GRAY_TERRACOTTA, TerracottaSlabs.GRAY_TERRACOTTA_SLAB, TerracottaStairs.GRAY_TERRACOTTA_STAIR, TerracottaWalls.GRAY_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_GRAY_TERRACOTTA, TerracottaSlabs.LIGHT_GRAY_TERRACOTTA_SLAB, TerracottaStairs.LIGHT_GRAY_TERRACOTTA_STAIR, TerracottaWalls.LIGHT_GRAY_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.WHITE_TERRACOTTA, TerracottaSlabs.WHITE_TERRACOTTA_SLAB, TerracottaStairs.WHITE_TERRACOTTA_STAIR, TerracottaWalls.WHITE_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.BROWN_TERRACOTTA, TerracottaSlabs.BROWN_TERRACOTTA_SLAB, TerracottaStairs.BROWN_TERRACOTTA_STAIR, TerracottaWalls.BROWN_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.RED_TERRACOTTA, TerracottaSlabs.RED_TERRACOTTA_SLAB, TerracottaStairs.RED_TERRACOTTA_STAIR, TerracottaWalls.RED_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.ORANGE_TERRACOTTA, TerracottaSlabs.ORANGE_TERRACOTTA_SLAB, TerracottaStairs.ORANGE_TERRACOTTA_STAIR, TerracottaWalls.ORANGE_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.YELLOW_TERRACOTTA, TerracottaSlabs.YELLOW_TERRACOTTA_SLAB, TerracottaStairs.YELLOW_TERRACOTTA_STAIR, TerracottaWalls.YELLOW_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.LIME_TERRACOTTA, TerracottaSlabs.LIME_TERRACOTTA_SLAB, TerracottaStairs.LIME_TERRACOTTA_STAIR, TerracottaWalls.LIME_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.GREEN_TERRACOTTA, TerracottaSlabs.GREEN_TERRACOTTA_SLAB, TerracottaStairs.GREEN_TERRACOTTA_STAIR, TerracottaWalls.GREEN_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.CYAN_TERRACOTTA, TerracottaSlabs.CYAN_TERRACOTTA_SLAB, TerracottaStairs.CYAN_TERRACOTTA_STAIR, TerracottaWalls.CYAN_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.BLUE_TERRACOTTA, TerracottaSlabs.BLUE_TERRACOTTA_SLAB, TerracottaStairs.BLUE_TERRACOTTA_STAIR, TerracottaWalls.BLUE_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.LIGHT_BLUE_TERRACOTTA, TerracottaSlabs.LIGHT_BLUE_TERRACOTTA_SLAB, TerracottaStairs.LIGHT_BLUE_TERRACOTTA_STAIR, TerracottaWalls.LIGHT_BLUE_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.PURPLE_TERRACOTTA, TerracottaSlabs.PURPLE_TERRACOTTA_SLAB, TerracottaStairs.PURPLE_TERRACOTTA_STAIR, TerracottaWalls.PURPLE_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.MAGENTA_TERRACOTTA, TerracottaSlabs.MAGENTA_TERRACOTTA_SLAB, TerracottaStairs.MAGENTA_TERRACOTTA_STAIR, TerracottaWalls.MAGENTA_TERRACOTTA_WALL);
        offerBlockSet(exporter, Blocks.PINK_TERRACOTTA, TerracottaSlabs.PINK_TERRACOTTA_SLAB, TerracottaStairs.PINK_TERRACOTTA_STAIR, TerracottaWalls.PINK_TERRACOTTA_WALL);

        offerBlockSet(exporter, Blocks.ACACIA_LOG, AcaciaWoodBlocks.ACACIA_LOG_SLAB, AcaciaWoodBlocks.ACACIA_LOG_STAIRS);
        offerBlockSet(exporter, AzaleaWoodBlocks.AZALEA_LOG, AzaleaWoodBlocks.AZALEA_LOG_SLAB, AzaleaWoodBlocks.AZALEA_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.BIRCH_LOG, BirchWoodBlocks.BIRCH_LOG_SLAB, BirchWoodBlocks.BIRCH_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.CRIMSON_STEM, CrimsonWoodBlocks.CRIMSON_LOG_SLAB, CrimsonWoodBlocks.CRIMSON_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.DARK_OAK_LOG, DarkOakWoodBlocks.DARK_OAK_LOG_SLAB, DarkOakWoodBlocks.DARK_OAK_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.JUNGLE_LOG, JungleWoodBlocks.JUNGLE_LOG_SLAB, JungleWoodBlocks.JUNGLE_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.MANGROVE_LOG, MangroveWoodBlocks.MANGROVE_LOG_SLAB, MangroveWoodBlocks.MANGROVE_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.OAK_LOG, OakWoodBlocks.OAK_LOG_SLAB, OakWoodBlocks.OAK_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.SPRUCE_LOG, SpruceWoodBlocks.SPRUCE_LOG_SLAB, SpruceWoodBlocks.SPRUCE_LOG_STAIRS);
        offerBlockSet(exporter, Blocks.WARPED_STEM, WarpedWoodBlocks.WARPED_LOG_SLAB, WarpedWoodBlocks.WARPED_LOG_STAIRS);
    }
}
