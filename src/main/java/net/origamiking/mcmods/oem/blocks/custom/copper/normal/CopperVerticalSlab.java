package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;

public class CopperVerticalSlab extends VerticalSlabBlock implements Oxidizable {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperVerticalSlab(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }
}
