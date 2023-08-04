package net.origamiking.mcmods.oem.blocks.wood.jungle;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class JungleWoodBlocks {
    public static final Block JUNGLE_BARREL = registerBlock(OemMain.MOD_ID, "jungle_barrel", new BarrelBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_BOOKSHELF = registerBlock(OemMain.MOD_ID, "jungle_bookshelf", new Block(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_LADDER = registerBlock(OemMain.MOD_ID, "jungle_ladder", new LadderBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block JUNGLE_LOG_FENCE = registerBlock(OemMain.MOD_ID, "jungle_log_fence", new FenceBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_LOG_SLAB = registerBlock(OemMain.MOD_ID, "jungle_log_slab", new SlabBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_LOG_STAIRS = registerBlock(OemMain.MOD_ID, "jungle_log_stairs", new StairsBlock(Blocks.JUNGLE_LOG.getDefaultState(), OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static void getJungleBlocks() {}
}
