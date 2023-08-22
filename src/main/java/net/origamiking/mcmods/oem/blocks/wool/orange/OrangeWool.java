package net.origamiking.mcmods.oem.blocks.wool.orange;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class OrangeWool extends BlocksUtils {
    public static final Block ORANGE_WOOL_STAIRS = registerBlock(OemMain.MOD_ID, "orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock(OemMain.MOD_ID, "orange_wool_slab", new SlabBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_WOOL_WALL = registerBlock(OemMain.MOD_ID, "orange_wool_wall", new WallBlock(OrigamiBlockSettings.create().strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));


    public static void getOrangeWool() {
    }
}
