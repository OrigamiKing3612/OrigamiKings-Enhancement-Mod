package net.origamiking.mcmods.oem.blocks;

import com.sun.source.tree.LambdaExpressionTree;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.concrete.ModBlocksConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ModBlocksConcreteStairs;
import net.origamiking.mcmods.oem.blocks.glass.ModBlocksGlass;
import net.origamiking.mcmods.oem.blocks.sculk.ModBlocksSculk;
import net.origamiking.mcmods.oem.blocks.server_specific.ModBlocksServerSpecific;
import net.origamiking.mcmods.oem.blocks.wood.barrel.ModBlocksBarrels;
import net.origamiking.mcmods.oem.blocks.wood.bookshelf.ModBlocksBookshelf;
import net.origamiking.mcmods.oem.blocks.wood.ladder.ModBlocksLadder;


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
        ModBlocksGlass.getGlassBlocks();
        ModBlocksConcreteSlabs.getConcreteBlocks();
        ModBlocksConcreteStairs.getConcreteStairs();
        ModBlocksSculk.getSculkBlocks();
        ModBlocksBarrels.getBarrels();
        ModBlocksLadder.getLadders();
        ModBlocksBookshelf.getBookshelfs();
        ModBlocksServerSpecific.getServerSpecific();
        OemMain.LOGGER.info("Registering Blocks for OEM");
    }
}

