package net.origamiking.mcmods.oem.blocks;

import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafCarpets;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.ModVericalSlabs;
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
    public static void register() {
        GlassBlocks.getGlassBlocks();
        ConcreteSlabs.getConcreteSlabs();
        ConcreteStairs.getConcreteStairs();
        ConcreteWalls.getConcreteWalls();

        AmethystBlocks.getAmethyst();
        RandomBlocks.getRandomBlocks();
        //geting wood blocks
        OakWoodBlocks.getOakBlocks();
        AzaleaWoodBlocks.getAzaleaBlocks();
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

        ModVericalSlabs.registerVerticalSlabs();

        OemMain.LOGGER.info("Registering Blocks for " + OemMain.NAME);
    }
}

