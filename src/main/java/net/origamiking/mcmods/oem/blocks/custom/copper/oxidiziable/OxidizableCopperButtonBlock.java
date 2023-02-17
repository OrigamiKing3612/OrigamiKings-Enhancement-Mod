package net.origamiking.mcmods.oem.blocks.custom.copper.oxidiziable;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.origamiking.mcmods.oem.blocks.custom.copper.normal.CopperBarBlock;
import net.origamiking.mcmods.oem.blocks.custom.copper.normal.CopperButtonBlock;

public class OxidizableCopperButtonBlock extends CopperButtonBlock implements Oxidizable {
    public OxidizableCopperButtonBlock(OxidationLevel oxidizationLevel, Settings settings) {
        super(oxidizationLevel, settings);
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
