package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.Oxidizable;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.sound.SoundEvents;

public class CopperPresurePlateBlock extends PressurePlateBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperPresurePlateBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(ActivationRule.EVERYTHING, settings, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON);
        this.oxidizationLevel = oxidizationLevel;
    }

}
