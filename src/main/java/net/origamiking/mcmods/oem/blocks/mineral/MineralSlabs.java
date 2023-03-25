package net.origamiking.mcmods.oem.blocks.mineral;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class MineralSlabs extends BlocksUtils {
    public static final Block COAL_BLOCK_SLAB = registerBlock(OemMain.MOD_ID, "coal_block_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    public static final Block GOLD_BLOCK_SLAB = registerBlock(OemMain.MOD_ID, "gold_block_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block IRON_BLOCK_SLAB = registerBlock(OemMain.MOD_ID, "iron_block_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EMERALD_BLOCK_SLAB = registerBlock(OemMain.MOD_ID, "emerald_block_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block LAPIS_BLOCK_SLAB = registerBlock(OemMain.MOD_ID, "lapis_block_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block DIAMOND_BLOCK_SLAB = registerBlock(OemMain.MOD_ID, "diamond_block_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block NETHERITE_BLOCK_SLAB = registerBlock(OemMain.MOD_ID, "netherite_block_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static void getMineralSlabs() {}
}
