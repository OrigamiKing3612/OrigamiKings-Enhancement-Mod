package net.origamiking.mcmods.oem.blocks.gold;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class GoldBlocks {
    public  static final Block GOLD_LANTERN = registerBlock(OemMain.MOD_ID, "gold_lantern", new LanternBlock(OrigamiBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(10).sounds(BlockSoundGroup.LANTERN)));
    public static final Block GOLD_CHAIN = registerBlock(OemMain.MOD_ID, "gold_chain", new ChainBlock(OrigamiBlockSettings.of(Material.METAL).strength(4f).requiresTool().sounds(BlockSoundGroup.CHAIN)));
    public static final Block GOLD_BARS = registerBlock(OemMain.MOD_ID, "gold_bars", new PaneBlock(OrigamiBlockSettings.of(Material.METAL).strength(4f).nonOpaque().requiresTool().sounds(BlockSoundGroup.METAL)));

    public static void getGoldBlocks() {}
}
