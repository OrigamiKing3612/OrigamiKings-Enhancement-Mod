package net.origamiking.mcmods.oem.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;


public class ModBlocks {
    //public static final Block TEST = registerBlock("test", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    public static final Block WHITE_CONCRETE_STAIR = registerBlock("white_concrete_stair", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    public static final Block BLACK_CONCRETE_STAIR = registerBlock("black_concrete_stair", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void register() {
        OemMain.LOGGER.info("Registering Blocks");
    }
}

