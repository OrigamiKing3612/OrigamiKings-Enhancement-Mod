package net.origamiking.mcmods.oem.blocks.wood.spruce;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class SpruceWoodBlocks {
    public static final Block SPRUCE_BARREL = registerBlock(OemMain.MOD_ID, "spruce_barrel", new BarrelBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_BOOKSHELF = registerBlock(OemMain.MOD_ID, "spruce_bookshelf", new Block(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_LADDER = registerBlock(OemMain.MOD_ID, "spruce_ladder", new LadderBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block SPRUCE_LOG_FENCE = registerBlock(OemMain.MOD_ID, "spruce_log_fence", new FenceBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_LOG_SLAB = registerBlock(OemMain.MOD_ID, "spruce_log_slab", new SlabBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_LOG_STAIRS = registerBlock(OemMain.MOD_ID, "spruce_log_stairs", new StairsBlock(Blocks.SPRUCE_LOG.getDefaultState(), OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static void getSpruceBlocks() {
    }
}
