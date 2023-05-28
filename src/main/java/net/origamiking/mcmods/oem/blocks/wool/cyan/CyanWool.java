package net.origamiking.mcmods.oem.blocks.wool.cyan;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class CyanWool extends BlocksUtils {
    public static final Block CYAN_WOOL_STAIRS = registerBlock(OemMain.MOD_ID, "cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock(OemMain.MOD_ID, "cyan_wool_slab", new SlabBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_WOOL_WALL = registerBlock(OemMain.MOD_ID, "cyan_wool_wall", new WallBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getCyanWool() {}
}
