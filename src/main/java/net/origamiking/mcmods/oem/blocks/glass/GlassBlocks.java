package net.origamiking.mcmods.oem.blocks.glass;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class GlassBlocks {
    public static String id = OemMain.MOD_ID;
    public static final Block GLASS_STAIR = registerBlock(id, "glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GLASS_SLAB = registerBlock(id, "glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_GLASS_STAIR = registerBlock(id, "white_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_GLASS_SLAB = registerBlock(id, "white_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_GLASS_STAIR = registerBlock(id, "light_gray_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_GLASS_SLAB = registerBlock(id, "light_gray_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_GLASS_STAIR = registerBlock(id, "gray_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_GLASS_SLAB = registerBlock(id, "gray_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_GLASS_SLAB = registerBlock(id, "black_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_GLASS_STAIR = registerBlock(id, "black_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_GLASS_SLAB = registerBlock(id, "brown_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_GLASS_STAIR = registerBlock(id, "brown_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_GLASS_SLAB = registerBlock(id, "red_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_GLASS_STAIR = registerBlock(id, "red_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_GLASS_SLAB = registerBlock(id, "orange_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_GLASS_STAIR = registerBlock(id, "orange_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_GLASS_SLAB = registerBlock(id, "yellow_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_GLASS_STAIR = registerBlock(id, "yellow_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_GLASS_SLAB = registerBlock(id, "lime_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_GLASS_STAIR = registerBlock(id, "lime_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_GLASS_SLAB = registerBlock(id, "green_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_GLASS_STAIR = registerBlock(id, "green_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_GLASS_SLAB = registerBlock(id, "cyan_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_GLASS_STAIR = registerBlock(id, "cyan_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_GLASS_SLAB = registerBlock(id, "light_blue_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_GLASS_STAIR = registerBlock(id, "light_blue_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_GLASS_SLAB = registerBlock(id, "blue_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_GLASS_STAIR = registerBlock(id, "blue_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_GLASS_SLAB = registerBlock(id, "purple_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_GLASS_STAIR = registerBlock(id, "purple_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_GLASS_SLAB = registerBlock(id, "magenta_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_GLASS_STAIR = registerBlock(id, "magenta_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_GLASS_SLAB = registerBlock(id, "pink_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_GLASS_STAIR = registerBlock(id, "pink_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));

    public static void getGlassBlocks() {

    }
}
