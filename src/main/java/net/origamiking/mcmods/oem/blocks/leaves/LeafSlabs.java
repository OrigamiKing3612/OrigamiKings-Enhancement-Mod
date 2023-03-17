package net.origamiking.mcmods.oem.blocks.leaves;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class LeafSlabs extends BlocksUtils {
    public static String id = OemMain.MOD_ID;
    public static final Block OAK_LEAVES_SLAB = registerBlock(id, "oak_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block SPRUCE_LEAVES_SLAB = registerBlock(id, "spruce_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block BIRCH_LEAVES_SLAB = registerBlock(id, "birch_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block JUNGLE_LEAVES_SLAB = registerBlock(id, "jungle_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block ACACIA_LEAVES_SLAB = registerBlock(id, "acacia_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block DARK_OAK_LEAVES_SLAB = registerBlock(id, "dark_oak_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block MANGROVE_LEAVES_SLAB = registerBlock(id, "mangrove_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));

    public static void getLeafSlabs() {}
}
