package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.stone.StoneVSlabs;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add(WhiteWool.WHITE_WOOL_SLAB, "White Wool Slab");
//        translationBuilder.add(WhiteWool.WHITE_WOOL_STAIRS, "White Wool Stairs");
//        translationBuilder.add(WhiteWool.WHITE_WOOL_WALL, "White Wool Wall");
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
//        translationBuilder.add("item.oem.viking_helmet","Viking Helmet");
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


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
