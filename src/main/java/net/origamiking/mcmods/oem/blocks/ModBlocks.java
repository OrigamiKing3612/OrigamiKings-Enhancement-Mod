package net.origamiking.mcmods.oem.blocks;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.leaves.LeafCarpets;
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
import net.origamiking.mcmods.oem.blocks.wool.blue.BlueWool;
import net.origamiking.mcmods.oem.blocks.wool.brown.BrownWool;
import net.origamiking.mcmods.oem.blocks.wool.cyan.CyanWool;
import net.origamiking.mcmods.oem.blocks.wool.gray.GrayWool;
import net.origamiking.mcmods.oem.blocks.wool.green.GreenWool;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.lightblue.LightBlueWool;
import net.origamiking.mcmods.oem.blocks.wool.lime.LimeWool;
import net.origamiking.mcmods.oem.blocks.wool.magenta.MagentaWool;
import net.origamiking.mcmods.oem.blocks.wool.orange.OrangeWool;
import net.origamiking.mcmods.oem.blocks.wool.pink.PinkWool;
import net.origamiking.mcmods.oem.blocks.wool.purple.PurpleWool;
import net.origamiking.mcmods.oem.blocks.wool.red.RedWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;


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
        ConcreteSlabs.getConcreteSlabs();
        ConcreteStairs.getConcreteStairs();
        ConcreteWalls.getConcreteWalls();
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
        RedWool.getRedWool();
        OrangeWool.getOrangeWool();
        YellowWool.getYellowWool();
        LimeWool.getLimeWool();
        GreenWool.getGreenWool();
        CyanWool.getCyanWool();
        LightBlueWool.getLightBlueWool();
        BlueWool.getBlueWool();
        PurpleWool.getPurpleWool();
        MagentaWool.getMagentaWool();
        PinkWool.getPinkWool();

        //geting leaf blocks
        LeafStairs.getLeafStairs();
        LeafSlabs.getLeafSlabs();
        LeafWalls.getLeafWalls();
        LeafCarpets.getLeafCarpets();

        OemMain.LOGGER.info("Registering Blocks for OEM");
    }
}

