package net.origamiking.mcmods.oem.blocks.mineral;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class MineralSlabs extends ModBlocks {
    public static final Block COAL_BLOCK_SLAB = registerBlock("coal_block_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    public static final Block GOLD_BLOCK_SLAB = registerBlock("gold_block_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block IRON_BLOCK_SLAB = registerBlock("iron_block_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EMERALD_BLOCK_SLAB = registerBlock("emerald_block_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block LAPIS_BLOCK_SLAB = registerBlock("lapis_block_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block DIAMOND_BLOCK_SLAB = registerBlock("diamond_block_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block NETHERITE_BLOCK_SLAB = registerBlock("netherite_block_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static void getMineralSlabs() {}
}
