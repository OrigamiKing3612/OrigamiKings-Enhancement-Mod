package net.origamiking.mcmods.oem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.ladder.LadderBlocks;

public class OemClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.SPRUCE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.DARK_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.MANGROVE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LadderBlocks.WARPED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ServerSpecificBlocks.GOLD_CHAIN, RenderLayer.getCutout());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIME_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIME_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.CYAN_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.CYAN_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PINK_GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PINK_GLASS_STAIR, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GLASS_SLAB, RenderLayer.getTranslucent());
       BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GLASS_STAIR, RenderLayer.getTranslucent());


    }
}
