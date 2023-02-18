package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.Oxidizable;
import net.minecraft.block.PaneBlock;

public class CopperBarBlock extends PaneBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperBarBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }
}
