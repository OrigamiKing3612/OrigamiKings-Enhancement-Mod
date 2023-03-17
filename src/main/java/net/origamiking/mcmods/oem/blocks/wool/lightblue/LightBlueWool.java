package net.origamiking.mcmods.oem.blocks.wool.lightblue;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class LightBlueWool extends BlocksUtils {
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock(OemMain.MOD_ID, "light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock(OemMain.MOD_ID, "light_blue_wool_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock(OemMain.MOD_ID, "light_blue_wool_wall", new WallBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).requiresTool().sounds(BlockSoundGroup.WOOL)));



    public static void getLightBlueWool() {}
}
