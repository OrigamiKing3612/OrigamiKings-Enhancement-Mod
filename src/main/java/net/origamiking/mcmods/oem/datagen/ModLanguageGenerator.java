package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.copper.WaxedCopperBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.copper.CopperVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.stone.StoneVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.wood.WoodVSlabs;
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
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;
import net.origamiking.mcmods.oemextra.extra.blocks.serverspecific.ServerSpecificBlocks;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.stone.StoneVStairs;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.wood.WoodVStairs;
import net.origamiking.mcmods.oemextra.extra.items.ModExtraItems;


import java.nio.file.Path;

import static net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool.*;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add(WHITE_WOOL_SLAB, "White Wool Slab");
//        translationBuilder.add(WHITE_WOOL_STAIRS, "White Wool Stairs");
//        translationBuilder.add(WHITE_WOOL_WALL, "White Wool Wall");
//        translationBuilder.add(LightGrayWool.LIGHT_GRAY_WOOL_SLAB, "Light Gray Wool Slab");
//        translationBuilder.add(LightGrayWool.LIGHT_GRAY_WOOL_STAIRS, "Light Gray Wool Stairs");
//        translationBuilder.add(LightGrayWool.LIGHT_GRAY_WOOL_WALL, "Light Gray Wool Wall");
//        translationBuilder.add(GrayWool.GRAY_WOOL_SLAB, "Gray Wool Slab");
//        translationBuilder.add(GrayWool.GRAY_WOOL_STAIRS, "Gray Wool Stairs");
//        translationBuilder.add(GrayWool.GRAY_WOOL_WALL, "Gray Wool Wall");
//        translationBuilder.add(BlackWool.BLACK_WOOL_SLAB, "Black Wool Slab");
//        translationBuilder.add(BlackWool.BLACK_WOOL_STAIRS, "Black Wool Stairs");
//        translationBuilder.add(BlackWool.BLACK_WOOL_WALL, "Black Wool Wall");
//        translationBuilder.add(BrownWool.BROWN_WOOL_SLAB, "Brown Wool Slab");
//        translationBuilder.add(BrownWool.BROWN_WOOL_STAIRS, "Brown Wool Stairs");
//        translationBuilder.add(BrownWool.BROWN_WOOL_WALL, "Brown Wool Wall");
//        translationBuilder.add(RedWool.RED_WOOL_SLAB, "Red Wool Slab");
//        translationBuilder.add(RedWool.RED_WOOL_STAIRS, "Red Wool Stairs");
//        translationBuilder.add(RedWool.RED_WOOL_WALL, "Red Wool Wall");
//        translationBuilder.add(OrangeWool.ORANGE_WOOL_SLAB, "Orange Wool Slab");
//        translationBuilder.add(OrangeWool.ORANGE_WOOL_STAIRS, "Orange Wool Stairs");
//        translationBuilder.add(OrangeWool.ORANGE_WOOL_WALL, "Orange Wool Wall");
//        translationBuilder.add(YellowWool.YELLOW_WOOL_SLAB, "Yellow Wool Slab");
//        translationBuilder.add(YellowWool.YELLOW_WOOL_STAIRS, "Yellow Wool Stairs");
//        translationBuilder.add(YellowWool.YELLOW_WOOL_WALL, "Yellow Wool Wall");
//        translationBuilder.add(LimeWool.LIME_WOOL_SLAB, "Lime Wool Slab");
//        translationBuilder.add(LimeWool.LIME_WOOL_STAIRS, "Lime Wool Stairs");
//        translationBuilder.add(LimeWool.LIME_WOOL_WALL, "Lime Wool Wall");
//        translationBuilder.add(GreenWool.GREEN_WOOL_SLAB, "Green Wool Slab");
//        translationBuilder.add(GreenWool.GREEN_WOOL_STAIRS, "Green Wool Stairs");
//        translationBuilder.add(GreenWool.GREEN_WOOL_WALL, "Green Wool Wall");
//        translationBuilder.add(CyanWool.CYAN_WOOL_SLAB, "Cyan Wool Slab");
//        translationBuilder.add(CyanWool.CYAN_WOOL_STAIRS, "Cyan Wool Stairs");
//        translationBuilder.add(CyanWool.CYAN_WOOL_WALL, "Cyan Wool Wall");
//        translationBuilder.add(LightBlueWool.LIGHT_BLUE_WOOL_SLAB, "Light Blue Wool Slab");
//        translationBuilder.add(LightBlueWool.LIGHT_BLUE_WOOL_STAIRS, "Light Blue Wool Stairs");
//        translationBuilder.add(LightBlueWool.LIGHT_BLUE_WOOL_WALL, "Light Blue Wool Wall");
//        translationBuilder.add(BlueWool.BLUE_WOOL_SLAB, "Blue Wool Slab");
//        translationBuilder.add(BlueWool.BLUE_WOOL_STAIRS, "Blue Wool Stairs");
//        translationBuilder.add(BlueWool.BLUE_WOOL_WALL, "Blue Wool Wall");
//        translationBuilder.add(PurpleWool.PURPLE_WOOL_SLAB, "Purple Wool Slab");
//        translationBuilder.add(PurpleWool.PURPLE_WOOL_STAIRS, "Purple Wool Stairs");
//        translationBuilder.add(PurpleWool.PURPLE_WOOL_WALL, "Purple Wool Wall");
//        translationBuilder.add(MagentaWool.MAGENTA_WOOL_SLAB, "Magenta Wool Slab");
//        translationBuilder.add(MagentaWool.MAGENTA_WOOL_STAIRS, "Magenta Wool Stairs");
//        translationBuilder.add(MagentaWool.MAGENTA_WOOL_WALL, "Magenta Wool Wall");
//        translationBuilder.add(PinkWool.PINK_WOOL_SLAB, "Pink Wool Slab");
//        translationBuilder.add(PinkWool.PINK_WOOL_STAIRS, "Pink Wool Stairs");
//        translationBuilder.add(PinkWool.PINK_WOOL_WALL, "Pink Wool Wall");
//        translationBuilder.add(LeafStairs.OAK_LEAVES_STAIRS, "Oak Leaf Stairs");
//        translationBuilder.add(LeafStairs.SPRUCE_LEAVES_STAIRS, "Spruce Leaf Stairs");
//        translationBuilder.add(LeafStairs.BIRCH_LEAVES_STAIRS, "Birch Leaf Stairs");
//        translationBuilder.add(LeafStairs.ACACIA_LEAVES_STAIRS, "Acacia Leaf Stairs");
//        translationBuilder.add(LeafStairs.JUNGLE_LEAVES_STAIRS, "Jungle Leaf Stairs");
//        translationBuilder.add(LeafStairs.DARK_OAK_LEAVES_STAIRS, "Dark oak Leaf Stairs");
//        translationBuilder.add(LeafStairs.MANGROVE_LEAVES_STAIRS, "Mangrove Leaf Stairs");
//        translationBuilder.add(LeafWalls.OAK_LEAVES_WALL, "Oak Leaf Wall");
//        translationBuilder.add(LeafWalls.SPRUCE_LEAVES_WALL, "Spruce Leaf Wall");
//        translationBuilder.add(LeafWalls.BIRCH_LEAVES_WALL, "Birch Leaf Wall");
//        translationBuilder.add(LeafWalls.JUNGLE_LEAVES_WALL, "Jungle Leaf Wall");
//        translationBuilder.add(LeafWalls.ACACIA_LEAVES_WALL, "Acacia Leaf Wall");
//        translationBuilder.add(LeafWalls.DARK_OAK_LEAVES_WALL, "Dark oak Leaf Wall");
//        translationBuilder.add(LeafWalls.MANGROVE_LEAVES_WALL, "Mangrove Leaf Wall");
//        translationBuilder.add(CopperBlocks.EXPOSED_COPPER_DOOR, "Exposed Copper Door");
//        translationBuilder.add(CopperBlocks.EXPOSED_COPPER_TRAPDOOR, "Exposed Copper Trapdoor");
//        translationBuilder.add(CopperBlocks.WEATHERED_COPPER_DOOR, "Weathered Copper Door");
//        translationBuilder.add(CopperBlocks.WEATHERED_COPPER_TRAPDOOR, "Weathered Copper Trapdoor");
//        translationBuilder.add(CopperBlocks.OXIDIZED_COPPER_DOOR,"Oxidized Copper Door");
//        translationBuilder.add(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR, "Oxidized Copper Trapdoor");
//        translationBuilder.add(GoldBlocks.GOLD_BARS, "Gold Bars");
//        translationBuilder.add(ConcreteWalls.WHITE_CONCRETE_WALL, "White Concrete Wall");
//        translationBuilder.add(ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL,"Light Gray Concrete Wall");
//        translationBuilder.add(ConcreteWalls.GRAY_CONCRETE_WALL,"Gray Concrete Wall");
//        translationBuilder.add(ConcreteWalls.BLACK_CONCRETE_WALL,"Black Concrete Wall");
//        translationBuilder.add(ConcreteWalls.BROWN_CONCRETE_WALL,"Brown Concrete Wall");
//        translationBuilder.add(ConcreteWalls.RED_CONCRETE_WALL,"Red Concrete Wall");
//        translationBuilder.add(ConcreteWalls.ORANGE_CONCRETE_WALL,"Orange Concrete Wall");
//        translationBuilder.add(ConcreteWalls.YELLOW_CONCRETE_WALL,"Yellow Concrete Wall");
//        translationBuilder.add(ConcreteWalls.LIME_CONCRETE_WALL,"Lime Concrete Wall");
//        translationBuilder.add(ConcreteWalls.GREEN_CONCRETE_WALL,"Green Concrete Wall");
//        translationBuilder.add(ConcreteWalls.CYAN_CONCRETE_WALL,"Cyan Concrete Wall");
//        translationBuilder.add(ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL,"Light Blue Concrete Wall");
//        translationBuilder.add(ConcreteWalls.BLUE_CONCRETE_WALL,"Blue Concrete Wall");
//        translationBuilder.add(ConcreteWalls.PURPLE_CONCRETE_WALL,"Purple Concrete Wall");
//        translationBuilder.add(ConcreteWalls.MAGENTA_CONCRETE_WALL,"Mangenta Concrete Wall");
//        translationBuilder.add(ConcreteWalls.PINK_CONCRETE_WALL,"Pink Concrete Wall");
//        translationBuilder.add(SculkBlocks.SCULK_WALL,"Sculk Wall");
//        translationBuilder.add(StoneVSlabs.STONE_VERTICAL_SLAB, "Stone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.COBBLESTONE_VERTICAL_SLAB, "Cobbletone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Mossy Cobblestone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_SMOOTH_STONE_SLAB, "Smooth Stone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_STONE_BRICK_SLAB, "Stone Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Mossy Stone Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_GRANITE_SLAB, "Granite Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_POLISHED_GRANITE_SLAB, "Polished Granite Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_DIORITE_SLAB, "Diorite Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_POLISHED_DIORITE_SLAB, "Polished Diorite Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_ANDESITE_SLAB, "Andesite Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_POLISHED_ANDESITE_SLAB, "Polished Polished Andesite Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Cobbed Deepslate Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Polished Deepslate Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_DEEPSLATE_BRICK_SLAB, "Deepslate Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_DEEPSLATE_TILE_SLAB, "Deepslate Tile Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_BRICK_SLAB, "Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_MUD_BRICK_SLAB, "Mud Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_SANDSTONE_SLAB, "Sandstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Smooth Sandstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_CUT_SANDSTONE_SLAB, "Cut Sandstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_RED_SANDSTONE_SLAB, "Red Sandstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Smooth Red Sandstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Cut Red Sandstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_PRISMARINE_SLAB, "Prismarine Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_PRISMARINE_BRICK_SLAB, "Prismarine Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_DARK_PRISMARINE_SLAB, "Dark Prismarine Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_NETHER_BRICK_SLAB, "Nether Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_RED_NETHER_BRICK_SLAB, "Red Nether Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_BLACKSTONE_SLAB, "Blackstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Polished Blackstone Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Polished");
//        translationBuilder.add(StoneVSlabs.VERTICAL_ENDSTONE_BRICK_SLAB, "Endstone Brick Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_QUARTZ_SLAB, "Quartz Vertical Slab");
//        translationBuilder.add(StoneVSlabs.VERTICAL_SMOOTH_QUARTZ_SLAB, "Smooth Quartz Vertical Slab");
//        translationBuilder.add(CopperVSlabs.VERTICAL_CUT_COPPER_SLAB, "VERTICAL_CUT_COPPER_SLAB");
//        translationBuilder.add(CopperVSlabs.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Vertical Exposed Cut Copper Slab");
//        translationBuilder.add(CopperVSlabs.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Vertical Weathered Cut Copper Slab");
//        translationBuilder.add(CopperVSlabs.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Vertical Oxidized Cut Copper Slab");
//        translationBuilder.add(CopperVSlabs.VERTICAL_WAXED_CUT_COPPER_SLAB, "Vertical Waxed Cut Copper Slab");
//        translationBuilder.add(CopperVSlabs.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Vertical Waxed Exposed Cut Copper Slab");
//        translationBuilder.add(CopperVSlabs.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Vertical Waxed Weathered Cut Copper Slab");
//        translationBuilder.add(CopperVSlabs.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Vertical Waxed Oxidized Cut Copper Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_OAK_SLAB, "Oak Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_SPRUCE_SLAB, "Spruce Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_BIRCH_SLAB, "Brich Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_JUNGLE_SLAB, "Jungle Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_ACACIA_SLAB, "Acacia Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_DARK_OAK_SLAB, "Dark Oak Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_MANGROVE_SLAB, "Mangrove Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_CRIMSON_SLAB, "Crimson Plank Vertical Slab");
//        translationBuilder.add(WoodVSlabs.VERTICAL_WARPED_SLAB, "Warped Plank Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.WHITE_CONCRETE_VERTICAL_SLAB, "White Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB, "Light Gray Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB, "Gray Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB, "Black Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB, "Brown Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB, "Red Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB, "Orange Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB,"Yellow Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB, "Lime Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB, "Green Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB,"Cyan Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB,"Light Blue Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB,"Blue Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB, "Purple Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB, "Magenta Concrete Vertical Slab");
//        translationBuilder.add(ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB, "Pink Concrete Vertical Slab");
//        translationBuilder.add(GlassVSlabs.WHITE_GLASS_VERTICAL_SLAB, "White Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.LIGHT_GRAY_GLASS_VERTICAL_SLAB, "Light Gray Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.GRAY_GLASS_VERTICAL_SLAB, "Gray Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.BLACK_GLASS_VERTICAL_SLAB, "Black Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.BROWN_GLASS_VERTICAL_SLAB, "Brown Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.RED_GLASS_VERTICAL_SLAB, "Red Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.ORANGE_GLASS_VERTICAL_SLAB, "Orange Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.YELLOW_GLASS_VERTICAL_SLAB, "Yellow Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.LIME_GLASS_VERTICAL_SLAB, "Lime Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.GREEN_GLASS_VERTICAL_SLAB, "Green Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.CYAN_GLASS_VERTICAL_SLAB, "Cyan Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.LIGHT_BLUE_GLASS_VERTICAL_SLAB, "Light Blue Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.BLUE_GLASS_VERTICAL_SLAB, "Blue Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.PURPLE_GLASS_VERTICAL_SLAB, "Purple Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.MAGENTA_GLASS_VERTICAL_SLAB, "Magenta Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.PINK_GLASS_VERTICAL_SLAB, "Pink Glass Vertical Slab");
//        translationBuilder.add(GlassVSlabs.GLASS_VERTICAL_SLAB, "Glass Vertical Slab");
//        translationBuilder.add(ServerSpecificBlocks.PRIM, "Pwim");
//        translationBuilder.add(WoodVStairs.OAK_VERTICAL_STAIRS, "Oak Vertical Stairs");
//        translationBuilder.add(StoneVStairs.STONE_BRICK_VERTICAL_STAIRS, "Stone Brick Vertical Stairs");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_LADDER, "Azalea Ladder");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_BARREL, "Azalea Barrel");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_BOOKSHELF, "Azalea Bookshelf");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_LOG, "Azalea Log");
//        translationBuilder.add(AzaleaWoodBlocks.STRIPPED_AZALEA_LOG, "Stripped Azalea Log");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_WOOD, "Azalea Wood");
//        translationBuilder.add(AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD, "Stripped Azalea Wood");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_PLANKS, "Azalea Planks");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_STAIR, "Azalea Stairs");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_SLAB, "Azalea Slab");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_FENCE, "Azalea Fence");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_FENCE_GATE, "Azalea Fence Gate");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_DOOR, "Azalea Door");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_TRAPDOOR, "Azalea Trapdoor");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_PRESSURE_PLATE, "Azalea Pressure Plate");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_BUTTON, "Azalea Button");
//        translationBuilder.add(RandomBlocks.IRON_BAR_DOOR, "Iron Bar Door");
//        translationBuilder.add(RandomBlocks.COPPER_BAR_DOOR, "Copper Bar Door");
//        translationBuilder.add(RandomBlocks.EXPOSED_COPPER_BAR_DOOR, "Exposed Copper Bar Door");
//        translationBuilder.add(RandomBlocks.WEATHERED_COPPER_BAR_DOOR, "Weather Copper Bar Door");
//        translationBuilder.add(RandomBlocks.OXIDIZED_COPPER_BAR_DOOR, "Oxidized Copper Bar Door");
//        translationBuilder.add(RandomBlocks.GOLD_BAR_DOOR, "Gold Bar Door");
//        translationBuilder.add(AcaciaWoodBlocks.ACACIA_CHEST, "Acacia Chest");
//        translationBuilder.add(AcaciaWoodBlocks.ACACIA_TRAPPED_CHEST, "Acacia Trapped Chest");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_CHEST, "Azalea Chest");
//        translationBuilder.add(AzaleaWoodBlocks.AZALEA_TRAPPED_CHEST, "Azalea Trapped Chest");
//        translationBuilder.add(BirchWoodBlocks.BIRCH_CHEST, "Birch Chest");
//        translationBuilder.add(BirchWoodBlocks.BIRCH_TRAPPED_CHEST, "Birch Trapped Chest");
//        translationBuilder.add(CrimsonWoodBlocks.CRIMSON_CHEST, "Crimson Chest");
//        translationBuilder.add(CrimsonWoodBlocks.CRIMSON_TRAPPED_CHEST, "Crimson Trapped Chest");
//        translationBuilder.add(DarkOakWoodBlocks.DARK_OAK_CHEST, "Dark Oak Chest");
//        translationBuilder.add(DarkOakWoodBlocks.DARK_OAK_TRAPPED_CHEST, "Dark Oak Trapped Chest");
//        translationBuilder.add(JungleWoodBlocks.JUNGLE_CHEST, "Jungle Chest");
//        translationBuilder.add(JungleWoodBlocks.JUNGLE_TRAPPED_CHEST, "Jungle Trapped Chest");
//        translationBuilder.add(MangroveWoodBlocks.MANGROVE_CHEST, "Mangrove Chest");
//        translationBuilder.add(MangroveWoodBlocks.MANGROVE_TRAPPED_CHEST, "Mangrove Trapped Chest");
//        translationBuilder.add(OakWoodBlocks.OAK_CHEST, "Oak Chest");
//        translationBuilder.add(OakWoodBlocks.OAK_TRAPPED_CHEST, "Oak Trapped Chest");
//        translationBuilder.add(SpruceWoodBlocks.SPRUCE_CHEST, "Spruce Chest");
//        translationBuilder.add(SpruceWoodBlocks.SPRUCE_TRAPPED_CHEST, "Spruce Trapped Chest");
//        translationBuilder.add(WarpedWoodBlocks.WARPED_CHEST, "Warped Chest");
//        translationBuilder.add(WarpedWoodBlocks.WARPED_TRAPPED_CHEST, "Warped Trapped Chest");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_COPPER_BARS, "Waxed Copper Bars");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BARS, "Waxed Exposed Copper Bars");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BARS, "Waxed Weathered Copper Bars");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BARS, "Waxed Oxidized Copper Bars");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_COPPER_CHAIN, "Waxed Copper Chain");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_CHAIN, "Waxed Exposed copper chain");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_CHAIN, "Waxed Weathered Copper Chain");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_CHAIN, "Waxed Oxidized Copper Chain");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_COPPER_LANTERN, "Waxed Copper Lantern");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_LANTERN, "Waxed Exposed Copper Lantern");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_LANTERN, "Waxed Weathered Copper Lantern");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_LANTERN, "Waxed Oxidized Copper Lantern");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_COPPER_PRESSURE_PLATE, "Waxed Copper Pressure Plate");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, "Waxed Exposed Copper Pressure Plate");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, "Waxed Weathered Copper Pressure Plate");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, "Waxed Oxidized Copper Pressure Plate");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_COPPER_BUTTON, "Waxed Copper Button");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BUTTON, "Waxed Exposed Copper Button");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BUTTON, "Waxed Weathered Copper Button");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BUTTON, "Waxed Oxidized Copper Button");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_COPPER_DOOR, "Waxed Copper Door");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_COPPER_TRAPDOOR, "Waxed Copper Trapdoor");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_DOOR, "Waxed Exposed Copper Door");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR, "Waxed Exposed Copper Trapdoor");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_DOOR, "Waxed Weathered Copper Door");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR, "Waxed Weathered Copper Trapdoor");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR, "Waxed Oxidized Copper Door");
//        translationBuilder.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR, "Waxed oxidized_Copper Trapdoor");
//        translationBuilder.add(CopperBlocks.EXPOSED_COPPER_LANTERN, "Exposed Copper Lantern");
//        translationBuilder.add(CopperBlocks.WEATHERED_COPPER_LANTERN, "Weathered Copper Lantern");
//        translationBuilder.add(CopperBlocks.OXIDIZED_COPPER_LANTERN, "Oxidized Copper Lantern");
//        translationBuilder.add(CopperBlocks.EXPOSED_COPPER_LANTERN, "Exposed Copper Lantern");
//        translationBuilder.add(CopperBlocks.WEATHERED_COPPER_LANTERN, "Weathered Copper Lantern");
//        translationBuilder.add(CopperBlocks.OXIDIZED_COPPER_LANTERN, "Oxidized Copper Lantern");
//        translationBuilder.add(ModExtraItems.FUT_GUN, "Future Gun");
//        translationBuilder.add(ArmorRegistry.VIKING_ARMOR_HELMET, "Viking Armor Helmet");
//        translationBuilder.add(GlassBlocks.GLASS_WALL, "Glass Wall");
//        translationBuilder.add(GlassBlocks.WHITE_GLASS_WALL, "White Glass Wall");
//        translationBuilder.add(GlassBlocks.LIGHT_GRAY_GLASS_WALL, "Light Gray Glass Wall");
//        translationBuilder.add(GlassBlocks.GRAY_GLASS_WALL, "Gray Glass Wall");
//        translationBuilder.add(GlassBlocks.BLACK_GLASS_WALL, "Black Glass Wall");
//        translationBuilder.add(GlassBlocks.BROWN_GLASS_WALL, "Brown Glass Wall");
//        translationBuilder.add(GlassBlocks.RED_GLASS_WALL, "Red Glass Wall");
//        translationBuilder.add(GlassBlocks.ORANGE_GLASS_WALL, "Orange Glass Wall");
//        translationBuilder.add(GlassBlocks.YELLOW_GLASS_WALL, "Yellow Glass Wall");
//        translationBuilder.add(GlassBlocks.LIME_GLASS_WALL, "Lime Glass Wall");
//        translationBuilder.add(GlassBlocks.GREEN_GLASS_WALL, "Green Glass Wall");
//        translationBuilder.add(GlassBlocks.CYAN_GLASS_WALL, "Cyan Glass Wall");
//        translationBuilder.add(GlassBlocks.LIGHT_BLUE_GLASS_WALL, "Light Blue Glass Wall");
//        translationBuilder.add(GlassBlocks.BLUE_GLASS_WALL, "Blue Glass Wall");
//        translationBuilder.add(GlassBlocks.PURPLE_GLASS_WALL, "Purple Glass Wall");
//        translationBuilder.add(GlassBlocks.MAGENTA_GLASS_WALL, "Magenta Glass Wall");
//        translationBuilder.add(GlassBlocks.PINK_GLASS_WALL, "Pink Glass Wall");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
