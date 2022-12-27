package net.origamiking.mcmods.oem.blocks.glass;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModBlocksGlass {
    public static final Block GLASS_STAIR = registerBlock("glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GLASS_SLAB = registerBlock("glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_GLASS_STAIR = registerBlock("white_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_GLASS_SLAB = registerBlock("white_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_GLASS_STAIR = registerBlock("light_gray_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_GLASS_SLAB = registerBlock("light_gray_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_GLASS_STAIR = registerBlock("gray_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_GLASS_SLAB = registerBlock("gray_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_GLASS_SLAB = registerBlock("black_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_GLASS_STAIR = registerBlock("black_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_GLASS_SLAB = registerBlock("brown_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_GLASS_STAIR = registerBlock("brown_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_GLASS_SLAB = registerBlock("red_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_GLASS_STAIR = registerBlock("red_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_GLASS_SLAB = registerBlock("orange_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_GLASS_STAIR = registerBlock("orange_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_GLASS_SLAB = registerBlock("yellow_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_GLASS_STAIR = registerBlock("yellow_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_GLASS_SLAB = registerBlock("lime_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_GLASS_STAIR = registerBlock("lime_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_GLASS_SLAB = registerBlock("green_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_GLASS_STAIR = registerBlock("green_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_GLASS_SLAB = registerBlock("cyan_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_GLASS_STAIR = registerBlock("cyan_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_GLASS_SLAB = registerBlock("light_blue_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_GLASS_STAIR = registerBlock("light_blue_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_GLASS_SLAB = registerBlock("blue_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_GLASS_STAIR = registerBlock("blue_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_GLASS_SLAB = registerBlock("purple_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_GLASS_STAIR = registerBlock("purple_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_GLASS_SLAB = registerBlock("magenta_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_GLASS_STAIR = registerBlock("magenta_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_GLASS_SLAB = registerBlock("pink_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_GLASS_STAIR = registerBlock("pink_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getGlassBlocks() {

    }
}
