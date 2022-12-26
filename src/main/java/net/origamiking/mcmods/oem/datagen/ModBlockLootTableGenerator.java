package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

import java.util.function.BiConsumer;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WHITE_CONCRETE_STAIR);
        addDrop(ModBlocks.WHITE_CONCRETE_SLAB);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIR);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        addDrop(ModBlocks.GRAY_CONCRETE_STAIR);
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB);
        addDrop(ModBlocks.BLACK_CONCRETE_STAIR);
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB);
        addDrop(ModBlocks.BROWN_CONCRETE_STAIR);
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB);
        addDrop(ModBlocks.RED_CONCRETE_STAIR);
        addDrop(ModBlocks.RED_CONCRETE_SLAB);
        addDrop(ModBlocks.ORANGE_CONCRETE_STAIR);
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB);
        addDrop(ModBlocks.YELLOW_CONCRETE_STAIR);
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB);
        addDrop(ModBlocks.LIME_CONCRETE_STAIR);
        addDrop(ModBlocks.LIME_CONCRETE_SLAB);
        addDrop(ModBlocks.GREEN_CONCRETE_STAIR);
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB);
        addDrop(ModBlocks.CYAN_CONCRETE_STAIR);
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIR);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        addDrop(ModBlocks.BLUE_CONCRETE_STAIR);
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB);
        addDrop(ModBlocks.PURPLE_CONCRETE_STAIR);
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB);
        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIR);
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB);
        addDrop(ModBlocks.PINK_CONCRETE_STAIR);
        addDrop(ModBlocks.PINK_CONCRETE_SLAB);
        addDrop(ModBlocks.SCULK_STAIR);
        addDrop(ModBlocks.SCULK_SLAB);
        addDrop(ModBlocks.OAK_BARREL);
        addDrop(ModBlocks.OAK_LADDER);
        addDrop(ModBlocks.SPRUCE_BARREL);
        addDrop(ModBlocks.SPRUCE_LADDER);
        addDrop(ModBlocks.SPRUCE_BOOKSHELF);
        addDrop(ModBlocks.BIRCH_LADDER);
        addDrop(ModBlocks.BIRCH_BARREL);
        addDrop(ModBlocks.BIRCH_BOOKSHELF);
        addDrop(ModBlocks.JUNGLE_LADDER);
        addDrop(ModBlocks.JUNGLE_BOOKSHELF);
        addDrop(ModBlocks.JUNGLE_BARREL);
        addDrop(ModBlocks.ACACIA_LADDER);
        addDrop(ModBlocks.ACACIA_BOOKSHELF);
        addDrop(ModBlocks.ACACIA_BARREL);
        addDrop(ModBlocks.DARK_OAK_LADDER);
        addDrop(ModBlocks.DARK_OAK_BOOKSHELF);
        addDrop(ModBlocks.DARK_OAK_BARREL);
        addDrop(ModBlocks.MANGROVE_LADDER);
        addDrop(ModBlocks.MANGROVE_BARREL);
        addDrop(ModBlocks.MANGROVE_BOOKSHELF);
        addDrop(ModBlocks.CRIMSON_LADDER);
        addDrop(ModBlocks.CRIMSON_BARREL);
        addDrop(ModBlocks.CRIMSON_BOOKSHELF);
        addDrop(ModBlocks.WARPED_LADDER);
        addDrop(ModBlocks.WARPED_BARREL);
        addDrop(ModBlocks.WARPED_BOOKSHELF);
        addDrop(ModBlocks.GOLD_CHAIN);
        addDropWithSilkTouch(ModBlocks.WHITE_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.WHITE_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.LIGHT_GRAY_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.LIGHT_GRAY_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.GRAY_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.GRAY_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.BLACK_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.BLACK_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.BROWN_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.BROWN_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.RED_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.RED_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.ORANGE_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.ORANGE_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.YELLOW_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.YELLOW_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.LIME_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.LIME_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.GREEN_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.GREEN_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.CYAN_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.CYAN_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.LIGHT_BLUE_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.LIGHT_BLUE_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.BLUE_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.BLUE_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.PURPLE_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.PURPLE_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.MAGENTA_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.MAGENTA_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.PINK_GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.PINK_GLASS_STAIR);
        addDropWithSilkTouch(ModBlocks.GLASS_SLAB);
        addDropWithSilkTouch(ModBlocks.GLASS_STAIR);

    }
}
