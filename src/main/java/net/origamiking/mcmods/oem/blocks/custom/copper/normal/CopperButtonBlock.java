package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.ButtonBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.sound.SoundEvents;

public class CopperButtonBlock extends ButtonBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperButtonBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings, 30, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON);
        this.oxidizationLevel = oxidizationLevel;
    }
}
