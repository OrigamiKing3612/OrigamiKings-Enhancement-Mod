package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.PressurePlateBlock;

public class CopperPresurePlateBlock extends PressurePlateBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperPresurePlateBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(ActivationRule.EVERYTHING, settings, BlockSetType.IRON);
        this.oxidizationLevel = oxidizationLevel;
    }

}
