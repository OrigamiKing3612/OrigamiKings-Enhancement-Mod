package net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.wood;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.VerticalStairsBlock;

public class WoodVStairs extends BlocksUtils {
    public static final Block OAK_VERTICAL_STAIRS = registerBlock(OemMain.MOD_ID, "vertical_oak_stairs", new VerticalStairsBlock(OrigamiBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static void get() {
    }
}
