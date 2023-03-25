package net.origamiking.mcmods.oem.blocks.wool.red;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class RedWool extends BlocksUtils {
    public static final Block RED_WOOL_STAIRS = registerBlock(OemMain.MOD_ID, "red_wool_stairs", new StairsBlock(Blocks.RED_WOOL.getDefaultState(), OrigamiBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock(OemMain.MOD_ID, "red_wool_slab", new SlabBlock(OrigamiBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_WOOL_WALL = registerBlock(OemMain.MOD_ID, "red_wool_wall", new WallBlock(OrigamiBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getRedWool() {}
}
