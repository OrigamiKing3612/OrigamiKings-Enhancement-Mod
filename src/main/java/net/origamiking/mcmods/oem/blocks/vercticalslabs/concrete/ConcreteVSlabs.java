package net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.ModVericalSlabs;

public class ConcreteVSlabs extends ModVericalSlabs {
    public static final Block WHITE_CONCRETE_VERTICAL_SLAB = registerBlock("vertical_white_concrete_slab", new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).sounds(BlockSoundGroup.STONE)));


    public static void get() {}
}
