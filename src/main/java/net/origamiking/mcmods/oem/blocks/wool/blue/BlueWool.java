package net.origamiking.mcmods.oem.blocks.wool.blue;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class BlueWool extends BlocksUtils {
    public static final Block BLUE_WOOL_STAIRS = registerBlock(OemMain.MOD_ID, "blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), OrigamiBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock(OemMain.MOD_ID, "blue_wool_slab", new SlabBlock(OrigamiBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_WOOL_WALL = registerBlock(OemMain.MOD_ID, "blue_wool_wall", new WallBlock(OrigamiBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getBlueWool() {}
}
