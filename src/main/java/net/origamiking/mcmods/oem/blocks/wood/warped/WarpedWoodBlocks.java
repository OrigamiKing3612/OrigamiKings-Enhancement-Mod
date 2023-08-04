package net.origamiking.mcmods.oem.blocks.wood.warped;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class WarpedWoodBlocks {
    public static final Block WARPED_BARREL = registerBlock(OemMain.MOD_ID, "warped_barrel", new BarrelBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_BOOKSHELF = registerBlock(OemMain.MOD_ID, "warped_bookshelf", new Block(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_LADDER = registerBlock(OemMain.MOD_ID, "warped_ladder", new LadderBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block WARPED_LOG_FENCE = registerBlock(OemMain.MOD_ID, "warped_log_fence", new FenceBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_LOG_SLAB = registerBlock(OemMain.MOD_ID, "warped_log_slab", new SlabBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_LOG_STAIRS = registerBlock(OemMain.MOD_ID, "warped_log_stairs", new StairsBlock(Blocks.WARPED_STEM.getDefaultState(), OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static void getWarpedBlocks() {}
}
