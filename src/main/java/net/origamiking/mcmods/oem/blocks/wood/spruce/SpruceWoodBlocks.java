package net.origamiking.mcmods.oem.blocks.wood.spruce;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class SpruceWoodBlocks {
    public static final Block SPRUCE_BARREL = registerBlock(OemMain.MOD_ID, "spruce_barrel", new BarrelBlock(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_BOOKSHELF = registerBlock(OemMain.MOD_ID, "spruce_bookshelf", new Block(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_LADDER = registerBlock(OemMain.MOD_ID, "spruce_ladder", new LadderBlock(OrigamiBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));

    public static void getSpruceBlocks() {}
}
