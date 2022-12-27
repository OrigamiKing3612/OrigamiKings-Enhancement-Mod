package net.origamiking.mcmods.oem.blocks.wood.barrel;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModBlocksBarrels {
    public static final Block OAK_BARREL = registerBlock("oak_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_BARREL = registerBlock("warped_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getBarrels() {
    }
}
