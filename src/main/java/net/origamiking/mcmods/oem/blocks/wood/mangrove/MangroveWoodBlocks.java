package net.origamiking.mcmods.oem.blocks.wood.mangrove;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class MangroveWoodBlocks {
    public static final Block MANGROVE_BARREL = registerBlock(OemMain.MOD_ID, "mangrove_barrel", new BarrelBlock(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_BOOKSHELF = registerBlock(OemMain.MOD_ID, "mangrove_bookshelf", new Block(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_LADDER = registerBlock(OemMain.MOD_ID, "mangrove_ladder", new LadderBlock(OrigamiBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block MANGROVE_CHEST = registerBlock(OemMain.MOD_ID, "mangrove_chest", new ChestBlock(OrigamiBlockSettings.copyOf(Blocks.CHEST), () -> BlockEntityType.CHEST));
    public static final Block MANGROVE_TRAPPED_CHEST = registerBlock(OemMain.MOD_ID, "mangrove_trapped_chest", new TrappedChestBlock(OrigamiBlockSettings.copyOf(Blocks.CHEST)));

    public static void getMangroveBlocks() {}
}
