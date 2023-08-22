package net.origamiking.mcmods.oem.blocks.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class LeafWalls extends BlocksUtils {
    public static String id = OemMain.MOD_ID;
    public static final Block OAK_LEAVES_WALL = registerBlock(id, "oak_leaves_wall", new WallBlock(OrigamiBlockSettings.copyOf(Blocks.OAK_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block SPRUCE_LEAVES_WALL = registerBlock(id, "spruce_leaves_wall", new WallBlock(OrigamiBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)/*.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block BIRCH_LEAVES_WALL = registerBlock(id, "birch_leaves_wall", new WallBlock(OrigamiBlockSettings.copyOf(Blocks.BIRCH_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block JUNGLE_LEAVES_WALL = registerBlock(id, "jungle_leaves_wall", new WallBlock(OrigamiBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block ACACIA_LEAVES_WALL = registerBlock(id, "acacia_leaves_wall", new WallBlock(OrigamiBlockSettings.copyOf(Blocks.ACACIA_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block DARK_OAK_LEAVES_WALL = registerBlock(id, "dark_oak_leaves_wall", new WallBlock(OrigamiBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));
    public static final Block MANGROVE_LEAVES_WALL = registerBlock(id, "mangrove_leaves_wall", new WallBlock(OrigamiBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)/*of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()*/));


    public static void getLeafWalls() {
    }

}
