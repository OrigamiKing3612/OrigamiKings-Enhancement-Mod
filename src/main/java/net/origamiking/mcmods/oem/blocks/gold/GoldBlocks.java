package net.origamiking.mcmods.oem.blocks.gold;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PaneBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class GoldBlocks {
    public static final Block GOLD_BARS = registerBlock(OemMain.MOD_ID, "gold_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL).strength(4f).nonOpaque().requiresTool().sounds(BlockSoundGroup.METAL)));

    public static void getGoldBlocks() {}
}
