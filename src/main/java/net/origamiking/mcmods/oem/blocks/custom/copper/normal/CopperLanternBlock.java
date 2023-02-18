package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.LanternBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.PaneBlock;

public class CopperLanternBlock extends LanternBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperLanternBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }

}
