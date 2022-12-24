package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.items.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       // blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEST);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_BOOKSHELF);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
    }
}
