package net.origamiking.mcmods.oem.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
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
import net.origamiking.mcmods.oem.blocks.wool.black.BlackWool;
import net.origamiking.mcmods.oem.blocks.wool.brown.BrownWool;
import net.origamiking.mcmods.oem.blocks.wool.gray.GrayWool;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;


public class ModBlocks {
    //public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane", new StainedGlassPaneBlock(FabricBlockSettings.of(Material.GLASS).strength(4f).requiresTool().sounds(BlockSoundGroup.GLASS)));
    //public static final Block H = registerBlock("h", new SnowBlock(FabricBlockSettings.of(Material.SNOW_LAYER).ticksRandomly().strength(0.1f).requiresTool().sounds(BlockSoundGroup.SNOW).blockVision((state, world, pos) -> state.get(SnowBlock.LAYERS) >= 8)));
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void register() {
        GlassBlocks.getGlassBlocks();
        ConcreteSlabs.getConcreteBlocks();
        ConcreteStairs.getConcreteStairs();
        SculkBlocks.getSculkBlocks();
        ServerSpecificBlocks.getServerSpecific();
        AmethystBlocks.getAmethyst();
        RandomBlocks.getRandomBlocks();
        //geting wood blocks
        OakWoodBlocks.getOakBlocks();
        SpruceWoodBlocks.getSpruceBlocks();
        BirchWoodBlocks.getBirchBlocks();
        JungleWoodBlocks.getJungleBlocks();
        AcaciaWoodBlocks.getAcaciaBlocks();
        DarkOakWoodBlocks.getDarkOakBlocks();
        MangroveWoodBlocks.getMangroveBlocks();
        CrimsonWoodBlocks.getCrimsonBlocks();
        WarpedWoodBlocks.getWarpedBlocks();
        CopperBlocks.getCopperBlocks();
        GoldBlocks.getGoldBlocks();
        //wool
        WhiteWool.getWhiteWool();
        LightGrayWool.getLightGrayWool();
        GrayWool.getGrayWool();
        BlackWool.getBlackWool();
        BrownWool.getBrownWool();


        //geting leaf blocks
//        LeafStairs.getLeafStairs();
//        LeafSlabs.getLeafSlabs();
//        LeafWalls.getLeafWalls();
//        LeaveCarpets.getLeafCarpets();
        OemMain.LOGGER.info("Registering Blocks for OEM");
    }
}

