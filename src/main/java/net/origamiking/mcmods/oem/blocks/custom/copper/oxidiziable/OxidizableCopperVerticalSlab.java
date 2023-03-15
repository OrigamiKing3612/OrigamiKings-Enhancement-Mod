package net.origamiking.mcmods.oem.blocks.custom.copper.oxidiziable;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.origamiking.mcmods.oem.blocks.custom.copper.normal.CopperVerticalSlab;

public class OxidizableCopperVerticalSlab extends CopperVerticalSlab implements Oxidizable {
    public OxidizableCopperVerticalSlab(OxidationLevel oxidizationLevel, Settings settings) {
        super(oxidizationLevel, settings);
    }
//    @Override
//    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
//        tickDegradation(state, world, pos, random);
//    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return super.hasRandomTicks(state) || Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }
}
