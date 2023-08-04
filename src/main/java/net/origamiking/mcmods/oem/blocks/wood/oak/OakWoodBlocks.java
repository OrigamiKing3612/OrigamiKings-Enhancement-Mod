package net.origamiking.mcmods.oem.blocks.wood.oak;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class OakWoodBlocks {
    public static final Block OAK_BARREL = registerBlock(OemMain.MOD_ID, "oak_barrel", new BarrelBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_LADDER = registerBlock(OemMain.MOD_ID, "oak_ladder", new LadderBlock(OrigamiBlockSettings.create().strength(4f).nonOpaque().requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block OAK_LOG_FENCE = registerBlock(OemMain.MOD_ID, "oak_log_fence", new FenceBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_LOG_SLAB = registerBlock(OemMain.MOD_ID, "oak_log_slab", new SlabBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_LOG_STAIRS = registerBlock(OemMain.MOD_ID, "oak_log_stairs", new StairsBlock(Blocks.OAK_LOG.getDefaultState(), OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static void getOakBlocks() {}
}
