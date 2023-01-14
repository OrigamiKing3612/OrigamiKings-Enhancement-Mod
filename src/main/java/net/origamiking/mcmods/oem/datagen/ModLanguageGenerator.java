package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

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
//        translationBuilder.add(LeafSlabs.OAK_LEAVES_SLAB, "Oak Leaf Stairs");
//        translationBuilder.add(LeafSlabs.SPRUCE_LEAVES_SLAB, "Spruce Leaf Slab");
//        translationBuilder.add(LeafSlabs.BIRCH_LEAVES_SLAB, "Birch Leaf Slab");
//        translationBuilder.add(LeafSlabs.JUNGLE_LEAVES_SLAB, "Jungle Leaf Slab");
//        translationBuilder.add(LeafSlabs.ACACIA_LEAVES_SLAB, "Acacia Leaf Slab");
//        translationBuilder.add(LeafSlabs.DARK_OAK_LEAVES_SLAB, "Dark oak Leaf Slab");
//        translationBuilder.add(LeafSlabs.MANGROVE_LEAVES_SLAB, "Mangrove Leaf Slab");


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file.", e);
        }
    }
}
