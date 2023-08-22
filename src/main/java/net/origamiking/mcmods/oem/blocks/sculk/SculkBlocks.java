package net.origamiking.mcmods.oem.blocks.sculk;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class SculkBlocks {
    public static String id = OemMain.MOD_ID;
    public static final Block SCULK_STAIR = registerBlock(id, "sculk_stairs", new StairsBlock(Blocks.SCULK.getDefaultState(), OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static final Block SCULK_SLAB = registerBlock(id, "sculk_slab", new SlabBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));
    public static final Block SCULK_WALL = registerBlock(id, "sculk_wall", new WallBlock(OrigamiBlockSettings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static void getSculkBlocks() {
    }
}
