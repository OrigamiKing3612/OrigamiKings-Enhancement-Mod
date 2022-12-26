package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //translationBuilder.add(ITEM, "Item");
        translationBuilder.add(ModBlocks.GLASS_SLAB, "Glass Slab");
        translationBuilder.add(ModBlocks.GLASS_STAIR, "Glass Stair");
        translationBuilder.add(ModBlocks.WHITE_GLASS_STAIR, "White Glass Stair");
        translationBuilder.add(ModBlocks.WHITE_GLASS_SLAB, "White Glass Slab");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_GLASS_SLAB, "Light Gray Glass Slab");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_GLASS_STAIR, "Light Gray Glass Stair");
        translationBuilder.add(ModBlocks.GRAY_GLASS_SLAB,"Gray Glass Slab");
        translationBuilder.add(ModBlocks.GRAY_GLASS_STAIR, "Gray Glass Stair");
        translationBuilder.add(ModBlocks.BLACK_GLASS_SLAB, "Black Glass Slab");
        translationBuilder.add(ModBlocks.BLACK_GLASS_STAIR, "Black Glass Stair");
        translationBuilder.add(ModBlocks.BROWN_GLASS_SLAB," Brown Glass Slab");
        translationBuilder.add(ModBlocks.BROWN_GLASS_STAIR, "Brown Glass Stair");
        translationBuilder.add(ModBlocks.RED_GLASS_SLAB, "Red Glass Slab");
        translationBuilder.add(ModBlocks.RED_GLASS_STAIR, "Red Glass Stair");
        translationBuilder.add(ModBlocks.ORANGE_GLASS_SLAB, "Orange Glass Slab");
        translationBuilder.add(ModBlocks.ORANGE_GLASS_STAIR, "Orange Glass Stair");
        translationBuilder.add(ModBlocks.YELLOW_GLASS_SLAB, "Yellow Glass slab");
        translationBuilder.add(ModBlocks.YELLOW_GLASS_STAIR, "Yellow Glass Stair");
        translationBuilder.add(ModBlocks.LIME_GLASS_SLAB, "Lime Glass Slab");
        translationBuilder.add(ModBlocks.LIME_GLASS_STAIR, "Lime Glass Stair");
        translationBuilder.add(ModBlocks.GREEN_GLASS_SLAB, "Green glass Slab");
        translationBuilder.add(ModBlocks.GREEN_GLASS_STAIR, "Green Glass Stair");
        translationBuilder.add(ModBlocks.CYAN_GLASS_SLAB, "Cyan Glass Slab");
        translationBuilder.add(ModBlocks.CYAN_GLASS_STAIR, "Cyan Glass Stair");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_GLASS_SLAB, "Light Blue Glass Slab");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_GLASS_STAIR, "Light Blue Glass Slab");
        translationBuilder.add(ModBlocks.BLUE_GLASS_SLAB, "Blue Glass Slab");
        translationBuilder.add(ModBlocks.BLUE_GLASS_STAIR, "Blue Glass Stair");
        translationBuilder.add(ModBlocks.PURPLE_GLASS_SLAB, "Purple Glass Slab");
        translationBuilder.add(ModBlocks.PURPLE_GLASS_STAIR, "Purple Glass Stair");
        translationBuilder.add(ModBlocks.MAGENTA_GLASS_SLAB, "Magenta Glass Slab");
        translationBuilder.add(ModBlocks.MAGENTA_GLASS_STAIR, "Magenta Glass Stair");
        translationBuilder.add(ModBlocks.PINK_GLASS_SLAB, "Pink Glass Slab");
        translationBuilder.add(ModBlocks.PINK_GLASS_STAIR, "Pink Glass Stair");



        try {
            Path exisingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").get();
            translationBuilder.add(exisingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add to existing language file.", e);
        }
    }
}
