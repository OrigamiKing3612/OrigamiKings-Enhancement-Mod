package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Oxidizable;

public class CopperDoorBlock extends DoorBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperDoorBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings, BlockSetType.IRON);
        this.oxidizationLevel = oxidizationLevel;
    }

}
