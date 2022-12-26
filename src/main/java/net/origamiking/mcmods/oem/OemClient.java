package net.origamiking.mcmods.oem;

import com.google.common.collect.Lists;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Util;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

import java.lang.module.ModuleFinder;
import java.util.List;

public class OemClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLD_CHAIN, RenderLayer.getCutout());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_STAIR, RenderLayer.getTranslucent());


    }
}
