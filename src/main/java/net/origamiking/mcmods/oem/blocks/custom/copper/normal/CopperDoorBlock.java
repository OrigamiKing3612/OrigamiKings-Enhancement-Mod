package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.PaneBlock;
import net.minecraft.sound.SoundEvents;

public class CopperDoorBlock extends DoorBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperDoorBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings, SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
        this.oxidizationLevel = oxidizationLevel;
    }

}
