package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.BlockState;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;

public class CopperChainBlock extends ChainBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperChainBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }
}
