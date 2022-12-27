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
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.barrel.BarrelBlocks;
import net.origamiking.mcmods.oem.blocks.wood.bookshelf.BookshelfBlocks;
import net.origamiking.mcmods.oem.blocks.wood.ladder.LadderBlocks;


public class ModBlocks {

    //public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane", new StainedGlassPaneBlock(FabricBlockSettings.of(Material.GLASS).strength(4f).requiresTool().sounds(BlockSoundGroup.GLASS)));
    private static Item registerBlockItem(String name, Block block) {
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
        BarrelBlocks.getBarrels();
        LadderBlocks.getLadders();
        BookshelfBlocks.getBookshelfs();
        ServerSpecificBlocks.getServerSpecific();
        AmethystBlocks.getAmethyst();
        RandomBlocks.getRandomBlocks();
        OemMain.LOGGER.info("Registering Blocks for OEM");
    }
}

