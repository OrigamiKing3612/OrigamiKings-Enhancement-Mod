package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.*;

public class CopperTrapdoorBlock extends TrapdoorBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperTrapdoorBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings, BlockSetType.IRON);
        this.oxidizationLevel = oxidizationLevel;
    }

}
