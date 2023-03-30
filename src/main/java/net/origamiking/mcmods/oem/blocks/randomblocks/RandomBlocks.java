package net.origamiking.mcmods.oem.blocks.randomblocks;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class RandomBlocks {
    public static String id = OemMain.MOD_ID;
    public static final Block CALSITE_STAIRS = registerBlock(id, "calcite_stairs", new StairsBlock(Blocks.CALCITE.getDefaultState(), OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALSITE_SLAB = registerBlock(id, "calcite_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALSITE_WALL = registerBlock(id, "calcite_wall", new WallBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block TUFF_STAIRS = registerBlock(id, "tuff_stairs", new StairsBlock(Blocks.TUFF.getDefaultState(), OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_SLAB = registerBlock(id, "tuff_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_WALL = registerBlock(id, "tuff_wall", new WallBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.TUFF)));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock(id, "smooth_basalt_stairs", new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock(id, "smooth_basalt_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));
    public static final Block NETHERRACK_STAIRS = registerBlock(id, "netherrack_stairs", new StairsBlock(Blocks.NETHERRACK.getDefaultState(), OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock(id, "smooth_basalt_wall", new WallBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block NETHERRACK_SLAB = registerBlock(id, "netherrack_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock(id, "netherrack_wall", new WallBlock(OrigamiBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block DRIPSTONE_STAIRS = registerBlock(id, "dripstone_block_stairs", new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock(id, "dripstone_block_slab", new SlabBlock(OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = registerBlock(id, "dripstone_block_wall", new WallBlock(OrigamiBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block SNOW_STAIRS = registerBlock(id, "snow_block_stairs", new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(), OrigamiBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_SLAB = registerBlock(id, "snow_block_slab", new SlabBlock(OrigamiBlockSettings.of(Material.SNOW_BLOCK).strength(4f).requiresTool().sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_WALL = registerBlock(id, "snow_block_wall", new WallBlock(OrigamiBlockSettings.of(Material.SNOW_BLOCK).strength(4f).requiresTool().sounds(BlockSoundGroup.SNOW)));
    public static final Block IRON_BAR_DOOR = registerBlock(OemMain.MOD_ID, "iron_bar_door", new DoorBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_DOOR)));
    public static final Block GOLD_BAR_DOOR = registerBlock(OemMain.MOD_ID, "gold_bar_door", new DoorBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_DOOR)));
    public static final Block COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "copper_bar_door", new DoorBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_DOOR)));
    public static final Block EXPOSED_COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "exposed_copper_bar_door", new DoorBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_DOOR)));
    public static final Block WEATHERED_COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "weathered_copper_bar_door", new DoorBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_DOOR)));
    public static final Block OXIDIZED_COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "oxidized_copper_bar_door", new DoorBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_DOOR)));
    public static void getRandomBlocks() {}
}
