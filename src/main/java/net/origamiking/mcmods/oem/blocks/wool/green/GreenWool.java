package net.origamiking.mcmods.oem.blocks.wool.green;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class GreenWool extends BlocksUtils {
    public static final Block GREEN_WOOL_STAIRS = registerBlock(OemMain.MOD_ID, "green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock(OemMain.MOD_ID, "green_wool_slab", new SlabBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_WOOL_WALL = registerBlock(OemMain.MOD_ID, "green_wool_wall", new WallBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getGreenWool() {}
}
