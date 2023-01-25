package net.origamiking.mcmods.oem.blocks.verticalstairs.stone;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.origamiking.mcmods.oem.blocks.custom.VerticalStairsBlock;
import net.origamiking.mcmods.oem.blocks.verticalstairs.ModVerticalStairs;

public class StoneVStairs extends ModVerticalStairs {
    public static final Block STONE_BRICK_VERTICAL_STAIRS = registerBlock("vertical_stone_brick_stairs", new VerticalStairsBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));



    public static void get() {}
}
