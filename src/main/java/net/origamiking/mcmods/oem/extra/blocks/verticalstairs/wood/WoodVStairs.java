package net.origamiking.mcmods.oem.extra.blocks.verticalstairs.wood;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.origamiking.mcmods.oem.blocks.custom.VerticalStairsBlock;
import net.origamiking.mcmods.oem.extra.blocks.verticalstairs.ModVerticalStairs;

public class WoodVStairs extends ModVerticalStairs {
    public static final Block OAK_VERTICAL_STAIRS = registerBlock("vertical_oak_stairs", new VerticalStairsBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));



    public static void get() {}
}
