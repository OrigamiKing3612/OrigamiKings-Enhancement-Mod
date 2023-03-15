package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.Oxidizable;

public class CopperButtonBlock extends ButtonBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperButtonBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings, BlockSetType.IRON, 30, false);
        this.oxidizationLevel = oxidizationLevel;
    }
}
