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


public class ModBlocks {

    //public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane", new StainedGlassPaneBlock(FabricBlockSettings.of(Material.GLASS).strength(4f).requiresTool().sounds(BlockSoundGroup.GLASS)));
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
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
        //CopperBlocks.getCopperBlocks();
        GoldBlocks.getGoldBlocks();
        OemMain.LOGGER.info("Registering Blocks for OEM");
    }
}

