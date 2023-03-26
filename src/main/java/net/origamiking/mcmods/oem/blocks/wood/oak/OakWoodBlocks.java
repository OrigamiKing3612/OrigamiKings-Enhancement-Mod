package net.origamiking.mcmods.oem.blocks.wood.oak;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class OakWoodBlocks {
    public static final Block OAK_BARREL = registerBlock(OemMain.MOD_ID, "oak_barrel", new BarrelBlock(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_LADDER = registerBlock(OemMain.MOD_ID, "oak_ladder", new LadderBlock(OrigamiBlockSettings.of(Material.WOOD).strength(4f).nonOpaque().requiresTool().sounds(BlockSoundGroup.LADDER)));

    public static void getOakBlocks() {}
}
