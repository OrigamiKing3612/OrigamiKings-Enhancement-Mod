package net.origamiking.mcmods.oem.blocks.wool.gray;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class GrayWool extends BlocksUtils {
    public static final Block GRAY_WOOL_STAIRS = registerBlock(OemMain.MOD_ID, "gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock(OemMain.MOD_ID, "gray_wool_slab", new SlabBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_WOOL_WALL = registerBlock(OemMain.MOD_ID, "gray_wool_wall", new WallBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));

    public static void getGrayWool() {
    }

}
