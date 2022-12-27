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
import net.origamiking.mcmods.oem.blocks.glass.ModBlocksGlass;
import net.origamiking.mcmods.oem.blocks.server_specific.ModBlocksServerSpecific;
import net.origamiking.mcmods.oem.blocks.wood.ladder.ModBlocksLadder;

import java.lang.module.ModuleFinder;
import java.util.List;

public class OemClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.SPRUCE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.DARK_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.MANGROVE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksLadder.WARPED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksServerSpecific.GOLD_CHAIN, RenderLayer.getCutout());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.WHITE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.WHITE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.LIGHT_GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.LIGHT_GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.BLACK_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.BLACK_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.BROWN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.BROWN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.RED_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.RED_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.ORANGE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.ORANGE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.YELLOW_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.YELLOW_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.LIME_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.LIME_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.GREEN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.GREEN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.CYAN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.CYAN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.LIGHT_BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.LIGHT_BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.PURPLE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.PURPLE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.MAGENTA_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.MAGENTA_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.PINK_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.PINK_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(ModBlocksGlass.GLASS_STAIR, RenderLayer.getTranslucent());


    }
}
