package net.origamiking.mcmods.oem.blocks.custom.copper.normal;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.SoundEvents;

public class CopperTrapdoorBlock extends TrapdoorBlock {
    public final Oxidizable.OxidationLevel oxidizationLevel;
    public CopperTrapdoorBlock(Oxidizable.OxidationLevel oxidizationLevel, Settings settings) {
        super(settings, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN);
        this.oxidizationLevel = oxidizationLevel;
    }

}
