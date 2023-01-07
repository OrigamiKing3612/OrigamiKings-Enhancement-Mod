package net.origamiking.mcmods.oem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;

public class OemClient implements ClientModInitializer {
   //public static final EntityModelLayer MODEL_NEW_COW_ENTITY_LAYER = new EntityModelLayer(new Identifier("oem", "new_cow_entity"), "main");
   @Override
   public void onInitializeClient() {
      //EntityRendererRegistry.register(NewCowEntity.NEW_COW_ENTITY, (context) -> {
      //           return new NewCowEntityRenderer(context);
      //       });


      //EntityModelLayerRegistry.registerModelLayer(MODEL_NEW_COW_ENTITY_LAYER, NewCowEntityModel::getTexturedModelData);
      BlockRenderLayerMap.INSTANCE.putBlock(GoldBlocks.GOLD_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.COPPER_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.EXPOSED_COPPER_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.WEATHERED_COPPER_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.OXIDIZED_COPPER_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(OakWoodBlocks.OAK_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(SpruceWoodBlocks.SPRUCE_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(BirchWoodBlocks.BIRCH_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(JungleWoodBlocks.JUNGLE_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(AcaciaWoodBlocks.ACACIA_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(DarkOakWoodBlocks.DARK_OAK_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(MangroveWoodBlocks.MANGROVE_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CrimsonWoodBlocks.CRIMSON_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(WarpedWoodBlocks.WARPED_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(ServerSpecificBlocks.GOLD_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.COPPER_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.WEATHERED_COPPER_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.EXPOSED_COPPER_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.OXIDIZED_COPPER_CHAIN, RenderLayer.getCutout());
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
//      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.OAK_LEAVES_STAIRS, RenderLayer.getCutoutMipped());
//      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.SPRUCE_LEAVES_STAIRS, RenderLayer.getCutoutMipped());
//      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.BIRCH_LEAVES_STAIRS, RenderLayer.getCutoutMipped());
//      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.ACACIA_LEAVES_STAIRS, RenderLayer.getCutoutMipped());
//      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.JUNGLE_LEAVES_STAIRS, RenderLayer.getCutoutMipped());
//      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.DARK_OAK_LEAVES_STAIRS, RenderLayer.getCutoutMipped());
//      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.MANGROVE_LEAVES_STAIRS, RenderLayer.getCutoutMipped());
//      registerBlockColor(OAK_LEAVES, LeafStairs.OAK_LEAVES_STAIRS);
//       case LeafStairs.BIRCH_LEAVES_STAIRS.getBirchColor();
//       case BIRCH_LEAVES -> (state, world, pos, tintIndex) -> FoliageColors.getBirchColor();
//       ColorProviderRegistry.BLOCK.register(LeafStairs.OAK_LEAVES_STAIRS);

       /*private void initBlockColors(){
          for (ModBlocks block: ModBlocks.values()) {
             BlockColorProvider blockColor = switch (block){
                case
                        OAK_LEAVES,
                                JUNGLE_LEAVES,
                                ACACIA_LEAVES,
                                DARK_OAK_LEAVES,
                                MANGROVE_LEAVES
                        -> ((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor());

                case SPRUCE_LEAVES -> (state, world, pos, tintIndex) -> FoliageColors.getSpruceColor();
                case BIRCH_LEAVES -> (state, world, pos, tintIndex) -> FoliageColors.getBirchColor();
                case GRASS_BLOCK -> (state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5, 1.0);
                default -> null;
             };

             ItemColorProvider itemColor = switch (block){
                case
                        OAK_LEAVES,
                                JUNGLE_LEAVES,
                                ACACIA_LEAVES,
                                DARK_OAK_LEAVES
                        -> ((stack, tintIndex) -> FoliageColors.getDefaultColor());

                case SPRUCE_LEAVES -> (stack, tintIndex) -> FoliageColors.getSpruceColor();
                case BIRCH_LEAVES -> (stack, tintIndex) -> FoliageColors.getBirchColor();
                case MANGROVE_LEAVES -> (stack, tintIndex) -> FoliageColors.getMangroveColor();
                case GRASS_BLOCK -> (stack, tintIndex) -> GrassColors.getColor(0.5, 1.0);
                default -> null;
             };

             if(blockColor != null){
                if(block.hasSlab()) registerBlockColor(blockColor, itemColor, block.getSlabBlock());
                if(block.hasStairs()) registerBlockColor(blockColor, itemColor, block.getStairsBlock());
                if(block.hasWall()) registerBlockColor(blockColor, itemColor, block.getWallBlock());
             }
          }
       }
    }*/
   }
       public static void registerBlockColor(BlockColorProvider blockColor, /*ItemColorProvider itemColor,*/ Block block){
          ColorProviderRegistry.BLOCK.register(blockColor, block);
          //ColorProviderRegistry.ITEM.register(itemColor, block.asItem());


   }

}