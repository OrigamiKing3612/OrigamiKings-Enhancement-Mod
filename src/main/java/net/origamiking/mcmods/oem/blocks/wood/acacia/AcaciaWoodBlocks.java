package net.origamiking.mcmods.oem.blocks.wood.acacia;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class AcaciaWoodBlocks {
    public static final Block ACACIA_BARREL = registerBlock(OemMain.MOD_ID, "acacia_barrel", new BarrelBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_BOOKSHELF = registerBlock(OemMain.MOD_ID, "acacia_bookshelf", new Block(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_LADDER = registerBlock(OemMain.MOD_ID, "acacia_ladder", new LadderBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block ACACIA_LOG_FENCE = registerBlock(OemMain.MOD_ID, "acacia_log_fence", new FenceBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_LOG_SLAB = registerBlock(OemMain.MOD_ID, "acacia_log_slab", new SlabBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_LOG_STAIRS = registerBlock(OemMain.MOD_ID, "acacia_log_stairs", new StairsBlock(Blocks.ACACIA_LOG.getDefaultState(), OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static void getAcaciaBlocks() {

    }
}
