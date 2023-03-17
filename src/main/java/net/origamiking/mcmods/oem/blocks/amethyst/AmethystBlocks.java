package net.origamiking.mcmods.oem.blocks.amethyst;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oem.OemMain;


public class AmethystBlocks {
    public static final Block AMETHYST_STAIR = BlocksUtils.registerBlock(OemMain.MOD_ID, "amethyst_block_stairs", new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_SLAB = BlocksUtils.registerBlock(OemMain.MOD_ID, "amethyst_block_slab", new SlabBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_WALL = BlocksUtils.registerBlock(OemMain.MOD_ID, "amethyst_block_wall", new WallBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static void getAmethyst() {}
}
