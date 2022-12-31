package net.origamiking.mcmods.oem.blocks.randomblocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class RandomBlocks {
    public static final Block CALSITE_STAIRS = registerBlock("calcite_stairs", new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALSITE_SLAB = registerBlock("calcite_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALSITE_WALL = registerBlock("calcite_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs", new StairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_SLAB = registerBlock("tuff_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_WALL = registerBlock("tuff_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.TUFF)));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs", new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs", new StairsBlock(Blocks.NETHERRACK.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall", new WallBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_block_stairs", new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_block_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_block_wall", new WallBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block SNOW_STAIRS = registerBlock("snow_block_stairs", new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_SLAB = registerBlock("snow_block_slab", new SlabBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(4f).requiresTool().sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_WALL = registerBlock("snow_block_wall", new WallBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(4f).requiresTool().sounds(BlockSoundGroup.SNOW)));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getRandomBlocks() {}
}
