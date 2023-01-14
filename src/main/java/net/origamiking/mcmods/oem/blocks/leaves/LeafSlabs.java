package net.origamiking.mcmods.oem.blocks.leaves;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class LeafSlabs extends ModBlocks {
    public static final Block OAK_LEAVES_SLAB = registerBlock("oak_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block SPRUCE_LEAVES_SLAB = registerBlock("spruce_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block BIRCH_LEAVES_SLAB = registerBlock("birch_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block JUNGLE_LEAVES_SLAB = registerBlock("jungle_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block ACACIA_LEAVES_SLAB = registerBlock("acacia_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block DARK_OAK_LEAVES_SLAB = registerBlock("dark_oak_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block MANGROVE_LEAVES_SLAB = registerBlock("mangrove_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));

    public static void getLeafSlabs() {}
}
