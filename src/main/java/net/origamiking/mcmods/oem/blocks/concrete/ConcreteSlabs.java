package net.origamiking.mcmods.oem.blocks.concrete;

import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class ConcreteSlabs {
    public static final String id = OemMain.MOD_ID;
    public static final Block WHITE_CONCRETE_SLAB = registerBlock(id, "white_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.WHITE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock(id, "black_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock(id, "light_gray_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock(id, "gray_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.GRAY)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock(id, "brown_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BROWN)));
    public static final Block RED_CONCRETE_SLAB = registerBlock(id, "red_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.RED)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock(id, "orange_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.ORANGE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock(id, "yellow_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.YELLOW)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock(id, "lime_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIME)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock(id, "green_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.GREEN)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock(id, "cyan_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.CYAN)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock(id, "light_blue_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock(id, "blue_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLUE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock(id, "purple_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.PURPLE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock(id, "magenta_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.MAGENTA)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock(id, "pink_concrete_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.PINK)));
    public static void getConcreteSlabs() {}
}
