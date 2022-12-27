package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateSupplier;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ModBlocksServerSpecific;
import net.origamiking.mcmods.oem.blocks.wood.bookshelf.ModBlocksBookshelf;
import net.origamiking.mcmods.oem.items.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       // blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEST);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksBookshelf.WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksServerSpecific.CAVERNS_BLOCK_ONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksServerSpecific.CAVERNS_BLOCK_TWO);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksServerSpecific.CAVERNS_BLOCK_THREE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksServerSpecific.CAVERNS_BLOCK_FOUR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksServerSpecific.CAVERNS_BLOCK_FIVE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocksServerSpecific.CAVERNS_BLOCK_SIX);

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
    }
}
