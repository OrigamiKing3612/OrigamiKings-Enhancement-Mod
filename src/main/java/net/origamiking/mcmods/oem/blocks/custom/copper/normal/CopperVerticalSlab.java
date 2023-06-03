package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.Oxidizable;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;

public class CopperVerticalSlab extends VerticalSlabBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperVerticalSlab(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }
}
