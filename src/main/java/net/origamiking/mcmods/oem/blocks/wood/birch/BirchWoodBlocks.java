package net.origamiking.mcmods.oem.blocks.wood.birch;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class BirchWoodBlocks {
    public static final Block BIRCH_BARREL = registerBlock(OemMain.MOD_ID, "birch_barrel", new BarrelBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_BOOKSHELF = registerBlock(OemMain.MOD_ID, "birch_bookshelf", new Block(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_LADDER = registerBlock(OemMain.MOD_ID, "birch_ladder", new LadderBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block BIRCH_LOG_FENCE = registerBlock(OemMain.MOD_ID, "birch_log_fence", new FenceBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_LOG_SLAB = registerBlock(OemMain.MOD_ID, "birch_log_slab", new SlabBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_LOG_STAIRS = registerBlock(OemMain.MOD_ID, "birch_log_stairs", new StairsBlock(Blocks.BIRCH_LOG.getDefaultState(), OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static void getBirchBlocks() {}
}
