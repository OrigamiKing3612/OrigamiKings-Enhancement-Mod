package net.origamiking.mcmods.oem.datagen.models;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
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

import static net.origamiking.mcmods.oapi.models.ModRecipeProviders.blockSet;

public class BlockSetModels {
    public static void get(BlockStateModelGenerator blockStateModelGenerator) {
        blockSet(blockStateModelGenerator, Blocks.GLASS, GlassBlocks.GLASS_SLAB, GlassBlocks.GLASS_STAIR, GlassBlocks.GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.BLACK_STAINED_GLASS, GlassBlocks.BLACK_GLASS_SLAB, GlassBlocks.BLACK_GLASS_STAIR, GlassBlocks.BLACK_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.GRAY_STAINED_GLASS, GlassBlocks.GRAY_GLASS_SLAB, GlassBlocks.GRAY_GLASS_STAIR, GlassBlocks.GRAY_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIGHT_GRAY_STAINED_GLASS, GlassBlocks.LIGHT_GRAY_GLASS_SLAB, GlassBlocks.LIGHT_GRAY_GLASS_STAIR, GlassBlocks.LIGHT_GRAY_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.WHITE_STAINED_GLASS, GlassBlocks.WHITE_GLASS_SLAB, GlassBlocks.WHITE_GLASS_STAIR, GlassBlocks.WHITE_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.BROWN_STAINED_GLASS, GlassBlocks.BROWN_GLASS_SLAB, GlassBlocks.BROWN_GLASS_STAIR, GlassBlocks.BROWN_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.RED_STAINED_GLASS, GlassBlocks.RED_GLASS_SLAB, GlassBlocks.RED_GLASS_STAIR, GlassBlocks.RED_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.ORANGE_STAINED_GLASS, GlassBlocks.ORANGE_GLASS_SLAB, GlassBlocks.ORANGE_GLASS_STAIR, GlassBlocks.ORANGE_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.YELLOW_STAINED_GLASS, GlassBlocks.YELLOW_GLASS_SLAB, GlassBlocks.YELLOW_GLASS_STAIR, GlassBlocks.YELLOW_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIME_STAINED_GLASS, GlassBlocks.LIME_GLASS_SLAB, GlassBlocks.LIME_GLASS_STAIR, GlassBlocks.LIME_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.GREEN_STAINED_GLASS, GlassBlocks.GREEN_GLASS_SLAB, GlassBlocks.GREEN_GLASS_STAIR, GlassBlocks.GREEN_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.CYAN_STAINED_GLASS, GlassBlocks.CYAN_GLASS_SLAB, GlassBlocks.CYAN_GLASS_STAIR, GlassBlocks.CYAN_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.BLUE_STAINED_GLASS, GlassBlocks.BLUE_GLASS_SLAB, GlassBlocks.BLUE_GLASS_STAIR, GlassBlocks.BLUE_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIGHT_BLUE_STAINED_GLASS, GlassBlocks.LIGHT_BLUE_GLASS_SLAB, GlassBlocks.LIGHT_BLUE_GLASS_STAIR, GlassBlocks.LIGHT_BLUE_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.PURPLE_STAINED_GLASS, GlassBlocks.PURPLE_GLASS_SLAB, GlassBlocks.PURPLE_GLASS_STAIR, GlassBlocks.PURPLE_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.MAGENTA_STAINED_GLASS, GlassBlocks.MAGENTA_GLASS_SLAB, GlassBlocks.MAGENTA_GLASS_STAIR, GlassBlocks.MAGENTA_GLASS_WALL);
        blockSet(blockStateModelGenerator, Blocks.PINK_STAINED_GLASS, GlassBlocks.PINK_GLASS_SLAB, GlassBlocks.PINK_GLASS_STAIR, GlassBlocks.PINK_GLASS_WALL);

        blockSet(blockStateModelGenerator, Blocks.BLACK_WOOL, BlackWool.BLACK_WOOL_SLAB, BlackWool.BLACK_WOOL_STAIRS, BlackWool.BLACK_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.GRAY_WOOL, GrayWool.GRAY_WOOL_SLAB, GrayWool.GRAY_WOOL_STAIRS, GrayWool.GRAY_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIGHT_GRAY_WOOL, LightGrayWool.LIGHT_GRAY_WOOL_SLAB, LightGrayWool.LIGHT_GRAY_WOOL_STAIRS, LightGrayWool.LIGHT_GRAY_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.WHITE_WOOL, WhiteWool.WHITE_WOOL_SLAB, WhiteWool.WHITE_WOOL_STAIRS, WhiteWool.WHITE_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.BROWN_WOOL, BrownWool.BROWN_WOOL_SLAB, BrownWool.BROWN_WOOL_STAIRS, BrownWool.BROWN_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.RED_WOOL, RedWool.RED_WOOL_SLAB, RedWool.RED_WOOL_STAIRS, RedWool.RED_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.ORANGE_WOOL, OrangeWool.ORANGE_WOOL_SLAB, OrangeWool.ORANGE_WOOL_STAIRS, OrangeWool.ORANGE_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.YELLOW_WOOL, YellowWool.YELLOW_WOOL_SLAB, YellowWool.YELLOW_WOOL_STAIRS, YellowWool.YELLOW_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIME_WOOL, LimeWool.LIME_WOOL_SLAB, LimeWool.LIME_WOOL_STAIRS, LimeWool.LIME_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.GREEN_WOOL, GreenWool.GREEN_WOOL_SLAB, GreenWool.GREEN_WOOL_STAIRS, GreenWool.GREEN_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.CYAN_WOOL, CyanWool.CYAN_WOOL_SLAB, CyanWool.CYAN_WOOL_STAIRS, CyanWool.CYAN_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.BLUE_WOOL, BlueWool.BLUE_WOOL_SLAB, BlueWool.BLUE_WOOL_STAIRS, BlueWool.BLUE_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIGHT_BLUE_WOOL, LightBlueWool.LIGHT_BLUE_WOOL_SLAB, LightBlueWool.LIGHT_BLUE_WOOL_STAIRS, LightBlueWool.LIGHT_BLUE_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.PURPLE_WOOL, PurpleWool.PURPLE_WOOL_SLAB, PurpleWool.PURPLE_WOOL_STAIRS, PurpleWool.PURPLE_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.MAGENTA_WOOL, MagentaWool.MAGENTA_WOOL_SLAB, MagentaWool.MAGENTA_WOOL_STAIRS, MagentaWool.MAGENTA_WOOL_WALL);
        blockSet(blockStateModelGenerator, Blocks.PINK_WOOL, PinkWool.PINK_WOOL_SLAB, PinkWool.PINK_WOOL_STAIRS, PinkWool.PINK_WOOL_WALL);

        blockSet(blockStateModelGenerator, Blocks.BLACK_CONCRETE, ConcreteSlabs.BLACK_CONCRETE_SLAB, ConcreteStairs.BLACK_CONCRETE_STAIR, ConcreteWalls.BLACK_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.GRAY_CONCRETE, ConcreteSlabs.GRAY_CONCRETE_SLAB, ConcreteStairs.GRAY_CONCRETE_STAIR, ConcreteWalls.GRAY_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIGHT_GRAY_CONCRETE, ConcreteSlabs.LIGHT_GRAY_CONCRETE_SLAB, ConcreteStairs.LIGHT_GRAY_CONCRETE_STAIR, ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.WHITE_CONCRETE, ConcreteSlabs.WHITE_CONCRETE_SLAB, ConcreteStairs.WHITE_CONCRETE_STAIR, ConcreteWalls.WHITE_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.BROWN_CONCRETE, ConcreteSlabs.BROWN_CONCRETE_SLAB, ConcreteStairs.BROWN_CONCRETE_STAIR, ConcreteWalls.BROWN_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.RED_CONCRETE, ConcreteSlabs.RED_CONCRETE_SLAB, ConcreteStairs.RED_CONCRETE_STAIR, ConcreteWalls.RED_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.ORANGE_CONCRETE, ConcreteSlabs.ORANGE_CONCRETE_SLAB, ConcreteStairs.ORANGE_CONCRETE_STAIR, ConcreteWalls.ORANGE_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.YELLOW_CONCRETE, ConcreteSlabs.YELLOW_CONCRETE_SLAB, ConcreteStairs.YELLOW_CONCRETE_STAIR, ConcreteWalls.YELLOW_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIME_CONCRETE, ConcreteSlabs.LIME_CONCRETE_SLAB, ConcreteStairs.LIME_CONCRETE_STAIR, ConcreteWalls.LIME_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.GREEN_CONCRETE, ConcreteSlabs.GREEN_CONCRETE_SLAB, ConcreteStairs.GREEN_CONCRETE_STAIR, ConcreteWalls.GREEN_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.CYAN_CONCRETE, ConcreteSlabs.CYAN_CONCRETE_SLAB, ConcreteStairs.CYAN_CONCRETE_STAIR, ConcreteWalls.CYAN_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.BLUE_CONCRETE, ConcreteSlabs.BLUE_CONCRETE_SLAB, ConcreteStairs.BLUE_CONCRETE_STAIR, ConcreteWalls.BLUE_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.LIGHT_BLUE_CONCRETE, ConcreteSlabs.LIGHT_BLUE_CONCRETE_SLAB, ConcreteStairs.LIGHT_BLUE_CONCRETE_STAIR, ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.PURPLE_CONCRETE, ConcreteSlabs.PURPLE_CONCRETE_SLAB, ConcreteStairs.PURPLE_CONCRETE_STAIR, ConcreteWalls.PURPLE_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.MAGENTA_CONCRETE, ConcreteSlabs.MAGENTA_CONCRETE_SLAB, ConcreteStairs.MAGENTA_CONCRETE_STAIR, ConcreteWalls.MAGENTA_CONCRETE_WALL);
        blockSet(blockStateModelGenerator, Blocks.PINK_CONCRETE, ConcreteSlabs.PINK_CONCRETE_SLAB, ConcreteStairs.PINK_CONCRETE_STAIR, ConcreteWalls.PINK_CONCRETE_WALL);
    }
}
