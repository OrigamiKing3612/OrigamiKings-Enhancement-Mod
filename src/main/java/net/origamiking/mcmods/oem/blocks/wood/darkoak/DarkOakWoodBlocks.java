package net.origamiking.mcmods.oem.blocks.wood.darkoak;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class DarkOakWoodBlocks {
    public static final Block DARK_OAK_BARREL = registerBlock(OemMain.MOD_ID, "dark_oak_barrel", new BarrelBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock(OemMain.MOD_ID, "dark_oak_bookshelf", new Block(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_LADDER = registerBlock(OemMain.MOD_ID, "dark_oak_ladder", new LadderBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block DARK_OAK_LOG_FENCE = registerBlock(OemMain.MOD_ID, "dark_oak_log_fence", new FenceBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_LOG_SLAB = registerBlock(OemMain.MOD_ID, "dark_oak_log_slab", new SlabBlock(OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_LOG_STAIRS = registerBlock(OemMain.MOD_ID, "dark_oak_log_stairs", new StairsBlock(Blocks.DARK_OAK_LOG.getDefaultState(), OrigamiBlockSettings.create().nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static void getDarkOakBlocks() {
    }
}
