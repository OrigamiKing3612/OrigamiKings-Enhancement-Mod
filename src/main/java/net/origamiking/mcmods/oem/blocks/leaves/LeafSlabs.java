package net.origamiking.mcmods.oem.blocks.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class LeafSlabs extends BlocksUtils {
    public static String id = OemMain.MOD_ID;
    public static final Block OAK_LEAVES_SLAB = registerBlock(id, "oak_leaves_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SPRUCE_LEAVES_SLAB = registerBlock(id, "spruce_leaves_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)));
    public static final Block BIRCH_LEAVES_SLAB = registerBlock(id, "birch_leaves_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.BIRCH_LEAVES)));
    public static final Block JUNGLE_LEAVES_SLAB = registerBlock(id, "jungle_leaves_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)));
    public static final Block ACACIA_LEAVES_SLAB = registerBlock(id, "acacia_leaves_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.ACACIA_LEAVES)));
    public static final Block DARK_OAK_LEAVES_SLAB = registerBlock(id, "dark_oak_leaves_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)));
    public static final Block MANGROVE_LEAVES_SLAB = registerBlock(id, "mangrove_leaves_slab", new SlabBlock(OrigamiBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)));

    public static void getLeafSlabs() {
    }
}
