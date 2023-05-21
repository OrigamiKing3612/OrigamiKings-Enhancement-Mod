package net.origamiking.mcmods.oem.blocks.wood.warped;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class WarpedWoodBlocks {
    public static final Block WARPED_BARREL = registerBlock(OemMain.MOD_ID, "warped_barrel", new BarrelBlock(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_BOOKSHELF = registerBlock(OemMain.MOD_ID, "warped_bookshelf", new Block(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_LADDER = registerBlock(OemMain.MOD_ID, "warped_ladder", new LadderBlock(OrigamiBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block WARPED_LOG_FENCE = registerBlock(OemMain.MOD_ID, "warped_log_fence", new FenceBlock(OrigamiBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static void getWarpedBlocks() {}
}
