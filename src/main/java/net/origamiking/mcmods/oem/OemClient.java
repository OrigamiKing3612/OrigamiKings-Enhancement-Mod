package net.origamiking.mcmods.oem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.copper.WaxedCopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafCarpets;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;
import net.origamiking.mcmods.oem.blocks.woodcutter.ModWoodcutter;
import net.origamiking.mcmods.oem.screen.ModScreenHandlers;
import net.origamiking.mcmods.oem.screen.woodcutter.WoodcutterScreen;
import net.origamiking.mcmods.oemextra.extra.OemExtraClient;

public class OemClient implements ClientModInitializer {
   @Override
   public void onInitializeClient() {

      OemMain.LOGGER.info("Registering Client stuff for " + OemMain.VERSION);

      getCutout(ModWoodcutter.WOODCUTTER);
      HandledScreens.register(ModScreenHandlers.WOODCUTTER_SCREEN_HANDLER, WoodcutterScreen::new);

      getTranslucent(GoldBlocks.GOLD_BARS);
      getTranslucent(CopperBlocks.COPPER_BARS);
      getTranslucent(CopperBlocks.EXPOSED_COPPER_BARS);
      getTranslucent(CopperBlocks.WEATHERED_COPPER_BARS);
      getTranslucent(CopperBlocks.OXIDIZED_COPPER_BARS);
      getTranslucent(WaxedCopperBlocks.WAXED_COPPER_BARS);
      getTranslucent(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BARS);
      getTranslucent(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BARS);
      getTranslucent(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BARS);
      getCutout(AzaleaWoodBlocks.AZALEA_DOOR);
      getCutout(AzaleaWoodBlocks.AZALEA_TRAPDOOR);
      getCutout(RandomBlocks.IRON_BAR_DOOR);
      getCutout(RandomBlocks.GOLD_BAR_DOOR);
      getCutout(RandomBlocks.COPPER_BAR_DOOR);
      getCutout(RandomBlocks.EXPOSED_COPPER_BAR_DOOR);
      getCutout(RandomBlocks.WEATHERED_COPPER_BAR_DOOR);
      getCutout(RandomBlocks.OXIDIZED_COPPER_BAR_DOOR);
      getCutout(CopperBlocks.COPPER_DOOR);
      getCutout(CopperBlocks.COPPER_TRAPDOOR);
      getCutout(CopperBlocks.EXPOSED_COPPER_DOOR);
      getCutout(CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
      getCutout(CopperBlocks.WEATHERED_COPPER_DOOR);
      getCutout(CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
      getCutout(CopperBlocks.OXIDIZED_COPPER_DOOR);
      getCutout(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
      getCutout(WaxedCopperBlocks.WAXED_COPPER_DOOR);
      getCutout(WaxedCopperBlocks.WAXED_COPPER_TRAPDOOR);
      getCutout(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_DOOR);
      getCutout(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
      getCutout(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_DOOR);
      getCutout(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
      getCutout(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR);
      getCutout(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
      getCutout(OakWoodBlocks.OAK_LADDER);
      getCutout(AzaleaWoodBlocks.AZALEA_LADDER);
      getCutout(SpruceWoodBlocks.SPRUCE_LADDER);
      getCutout(BirchWoodBlocks.BIRCH_LADDER);
      getCutout(JungleWoodBlocks.JUNGLE_LADDER);
      getCutout(AcaciaWoodBlocks.ACACIA_LADDER);
      getCutout(DarkOakWoodBlocks.DARK_OAK_LADDER);
      getCutout(MangroveWoodBlocks.MANGROVE_LADDER);
      getCutout(CrimsonWoodBlocks.CRIMSON_LADDER);
      getCutout(WarpedWoodBlocks.WARPED_LADDER);
      getCutout(GoldBlocks.GOLD_CHAIN);
      getCutout(CopperBlocks.COPPER_CHAIN);
      getCutout(CopperBlocks.WEATHERED_COPPER_CHAIN);
      getCutout(CopperBlocks.EXPOSED_COPPER_CHAIN);
      getCutout(CopperBlocks.OXIDIZED_COPPER_CHAIN);
      getCutout(WaxedCopperBlocks.WAXED_COPPER_CHAIN);
      getCutout(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_CHAIN);
      getCutout(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_CHAIN);
      getCutout(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_CHAIN);
      getTranslucent(GlassBlocks.WHITE_GLASS_STAIR);
      getTranslucent(GlassBlocks.WHITE_GLASS_SLAB);
      getTranslucent(GlassBlocks.LIGHT_GRAY_GLASS_SLAB);
      getTranslucent(GlassBlocks.LIGHT_GRAY_GLASS_STAIR);
      getTranslucent(GlassBlocks.GRAY_GLASS_SLAB);
      getTranslucent(GlassBlocks.GRAY_GLASS_STAIR);
      getTranslucent(GlassBlocks.BLACK_GLASS_SLAB);
      getTranslucent(GlassBlocks.BLACK_GLASS_STAIR);
      getTranslucent(GlassBlocks.BROWN_GLASS_SLAB);
      getTranslucent(GlassBlocks.BROWN_GLASS_STAIR);
      getTranslucent(GlassBlocks.RED_GLASS_SLAB);
      getTranslucent(GlassBlocks.RED_GLASS_STAIR);
      getTranslucent(GlassBlocks.ORANGE_GLASS_SLAB);
      getTranslucent(GlassBlocks.ORANGE_GLASS_STAIR);
      getTranslucent(GlassBlocks.YELLOW_GLASS_SLAB);
      getTranslucent(GlassBlocks.YELLOW_GLASS_STAIR);
      getTranslucent(GlassBlocks.LIME_GLASS_SLAB);
      getTranslucent(GlassBlocks.LIME_GLASS_STAIR);
      getTranslucent(GlassBlocks.GREEN_GLASS_SLAB);
      getTranslucent(GlassBlocks.GREEN_GLASS_STAIR);
      getTranslucent(GlassBlocks.CYAN_GLASS_SLAB);
      getTranslucent(GlassBlocks.CYAN_GLASS_STAIR);
      getTranslucent(GlassBlocks.LIGHT_BLUE_GLASS_SLAB);
      getTranslucent(GlassBlocks.LIGHT_BLUE_GLASS_STAIR);
      getTranslucent(GlassBlocks.BLUE_GLASS_SLAB);
      getTranslucent(GlassBlocks.BLUE_GLASS_STAIR);
      getTranslucent(GlassBlocks.PURPLE_GLASS_SLAB);
      getTranslucent(GlassBlocks.PURPLE_GLASS_STAIR);
      getTranslucent(GlassBlocks.MAGENTA_GLASS_SLAB);
      getTranslucent(GlassBlocks.MAGENTA_GLASS_STAIR);
      getTranslucent(GlassBlocks.PINK_GLASS_SLAB);
      getTranslucent(GlassBlocks.PINK_GLASS_STAIR);
      getTranslucent(GlassBlocks.GLASS_SLAB);
      getTranslucent(GlassBlocks.GLASS_STAIR);
      getTranslucent(GlassVSlabs.GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.WHITE_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.LIGHT_GRAY_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.GRAY_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.BLACK_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.BROWN_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.RED_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.ORANGE_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.YELLOW_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.LIME_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.GREEN_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.CYAN_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.LIGHT_BLUE_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.BLUE_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.PURPLE_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.MAGENTA_GLASS_VERTICAL_SLAB);
      getTranslucent(GlassVSlabs.PINK_GLASS_VERTICAL_SLAB);

      getTranslucent(GlassBlocks.GLASS_WALL);
      getTranslucent(GlassBlocks.WHITE_GLASS_WALL);
      getTranslucent(GlassBlocks.LIGHT_GRAY_GLASS_WALL);
      getTranslucent(GlassBlocks.GRAY_GLASS_WALL);
      getTranslucent(GlassBlocks.BLACK_GLASS_WALL);
      getTranslucent(GlassBlocks.BROWN_GLASS_WALL);
      getTranslucent(GlassBlocks.RED_GLASS_WALL);
      getTranslucent(GlassBlocks.ORANGE_GLASS_WALL);
      getTranslucent(GlassBlocks.YELLOW_GLASS_WALL);
      getTranslucent(GlassBlocks.LIME_GLASS_WALL);
      getTranslucent(GlassBlocks.GREEN_GLASS_WALL);
      getTranslucent(GlassBlocks.CYAN_GLASS_WALL);
      getTranslucent(GlassBlocks.LIGHT_BLUE_GLASS_WALL);
      getTranslucent(GlassBlocks.BLUE_GLASS_WALL);
      getTranslucent(GlassBlocks.PURPLE_GLASS_WALL);
      getTranslucent(GlassBlocks.MAGENTA_GLASS_WALL);
      getTranslucent(GlassBlocks.PINK_GLASS_WALL);
      getCutout(CopperBlocks.COPPER_LANTERN);
      getCutout(CopperBlocks.EXPOSED_COPPER_LANTERN);
      getCutout(CopperBlocks.WEATHERED_COPPER_LANTERN);
      getCutout(CopperBlocks.OXIDIZED_COPPER_LANTERN);
      getCutout(WaxedCopperBlocks.WAXED_COPPER_LANTERN);
      getCutout(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_LANTERN);
      getCutout(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_LANTERN);
      getCutout(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_LANTERN);

      //leaf cutout
      getCutout(LeafStairs.OAK_LEAVES_STAIRS);
      getCutout(LeafStairs.SPRUCE_LEAVES_STAIRS);
      getCutout(LeafStairs.BIRCH_LEAVES_STAIRS);
      getCutout(LeafStairs.ACACIA_LEAVES_STAIRS);
      getCutout(LeafStairs.JUNGLE_LEAVES_STAIRS);
      getCutout(LeafStairs.DARK_OAK_LEAVES_STAIRS);
      getCutout(LeafStairs.MANGROVE_LEAVES_STAIRS);
      getCutout(LeafSlabs.OAK_LEAVES_SLAB);
      getCutout(LeafSlabs.SPRUCE_LEAVES_SLAB);
      getCutout(LeafSlabs.BIRCH_LEAVES_SLAB);
      getCutout(LeafSlabs.ACACIA_LEAVES_SLAB);
      getCutout(LeafSlabs.JUNGLE_LEAVES_SLAB);
      getCutout(LeafSlabs.DARK_OAK_LEAVES_SLAB);
      getCutout(LeafSlabs.MANGROVE_LEAVES_SLAB);
      getCutout(LeafWalls.OAK_LEAVES_WALL);
      getCutout(LeafWalls.SPRUCE_LEAVES_WALL);
      getCutout(LeafWalls.BIRCH_LEAVES_WALL);
      getCutout(LeafWalls.ACACIA_LEAVES_WALL);
      getCutout(LeafWalls.JUNGLE_LEAVES_WALL);
      getCutout(LeafWalls.DARK_OAK_LEAVES_WALL);
      getCutout(LeafWalls.MANGROVE_LEAVES_WALL);
      getCutout(LeafCarpets.OAK_LEAVES_CARPET);
      getCutout(LeafCarpets.SPRUCE_LEAVES_CARPET);
      getCutout(LeafCarpets.BIRCH_LEAVES_CARPET);
      getCutout(LeafCarpets.ACACIA_LEAVES_CARPET);
      getCutout(LeafCarpets.JUNGLE_LEAVES_CARPET);
      getCutout(LeafCarpets.DARK_OAK_LEAVES_CARPET);
      getCutout(LeafCarpets.MANGROVE_LEAVES_CARPET);

      //leaf blocks
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.OAK_LEAVES_STAIRS, LeafSlabs.OAK_LEAVES_SLAB, LeafWalls.OAK_LEAVES_WALL, LeafCarpets.OAK_LEAVES_CARPET);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getSpruceColor(), LeafStairs.SPRUCE_LEAVES_STAIRS, LeafSlabs.SPRUCE_LEAVES_SLAB, LeafWalls.SPRUCE_LEAVES_WALL, LeafCarpets.SPRUCE_LEAVES_CARPET);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getBirchColor(), LeafStairs.BIRCH_LEAVES_STAIRS, LeafSlabs.BIRCH_LEAVES_SLAB, LeafWalls.BIRCH_LEAVES_WALL, LeafCarpets.BIRCH_LEAVES_CARPET);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.ACACIA_LEAVES_STAIRS, LeafSlabs.ACACIA_LEAVES_SLAB, LeafWalls.ACACIA_LEAVES_WALL, LeafCarpets.ACACIA_LEAVES_CARPET);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.JUNGLE_LEAVES_STAIRS, LeafSlabs.JUNGLE_LEAVES_SLAB, LeafWalls.JUNGLE_LEAVES_WALL, LeafCarpets.JUNGLE_LEAVES_CARPET);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.DARK_OAK_LEAVES_STAIRS, LeafSlabs.DARK_OAK_LEAVES_SLAB, LeafWalls.DARK_OAK_LEAVES_WALL, LeafCarpets.DARK_OAK_LEAVES_CARPET);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getMangroveColor(), LeafStairs.MANGROVE_LEAVES_STAIRS, LeafSlabs.MANGROVE_LEAVES_SLAB, LeafWalls.MANGROVE_LEAVES_WALL, LeafCarpets.MANGROVE_LEAVES_CARPET);

      //leaf items
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.OAK_LEAVES_STAIRS, LeafSlabs.OAK_LEAVES_SLAB, LeafWalls.OAK_LEAVES_WALL, LeafCarpets.OAK_LEAVES_CARPET);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getSpruceColor(), LeafStairs.SPRUCE_LEAVES_STAIRS, LeafSlabs.SPRUCE_LEAVES_SLAB, LeafWalls.SPRUCE_LEAVES_WALL, LeafCarpets.SPRUCE_LEAVES_CARPET);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getBirchColor(), LeafStairs.BIRCH_LEAVES_STAIRS, LeafSlabs.BIRCH_LEAVES_SLAB, LeafWalls.BIRCH_LEAVES_WALL, LeafCarpets.BIRCH_LEAVES_CARPET);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.ACACIA_LEAVES_STAIRS, LeafSlabs.ACACIA_LEAVES_SLAB, LeafWalls.ACACIA_LEAVES_WALL, LeafCarpets.ACACIA_LEAVES_CARPET);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.JUNGLE_LEAVES_STAIRS, LeafSlabs.JUNGLE_LEAVES_SLAB, LeafWalls.JUNGLE_LEAVES_WALL, LeafCarpets.JUNGLE_LEAVES_CARPET);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.DARK_OAK_LEAVES_STAIRS, LeafSlabs.DARK_OAK_LEAVES_SLAB, LeafWalls.DARK_OAK_LEAVES_WALL, LeafCarpets.DARK_OAK_LEAVES_CARPET);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getMangroveColor(), LeafStairs.MANGROVE_LEAVES_STAIRS, LeafSlabs.MANGROVE_LEAVES_SLAB, LeafWalls.MANGROVE_LEAVES_WALL, LeafCarpets.MANGROVE_LEAVES_CARPET);

      if (FabricLoader.getInstance().isModLoaded("oem-extra")) { OemExtraClient.onInitializeClient(); }
   }
   public static void getCutout(Block block) {
      BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
   }
   public static void getTranslucent(Block block) {
      BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
   }
}