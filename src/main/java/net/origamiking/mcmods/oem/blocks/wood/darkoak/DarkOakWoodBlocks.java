package net.origamiking.mcmods.oem.blocks.wood.darkoak;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class DarkOakWoodBlocks {
    public static final Block DARK_OAK_BARREL = registerBlock(OemMain.MOD_ID, "dark_oak_barrel", new BarrelBlock(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock(OemMain.MOD_ID, "dark_oak_bookshelf", new Block(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_LADDER = registerBlock(OemMain.MOD_ID, "dark_oak_ladder", new LadderBlock(OrigamiBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block DARK_OAK_CHEST = registerBlock(OemMain.MOD_ID, "dark_oak_chest", new ChestBlock(OrigamiBlockSettings.copyOf(Blocks.CHEST), () -> BlockEntityType.CHEST));
    public static final Block DARK_OAK_TRAPPED_CHEST = registerBlock(OemMain.MOD_ID, "dark_oak_trapped_chest", new TrappedChestBlock(OrigamiBlockSettings.copyOf(Blocks.CHEST)));
    public static final Block DARK_OAK_LOG_FENCE = registerBlock(OemMain.MOD_ID, "dark_oak_log_fence", new FenceBlock(OrigamiBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static void getDarkOakBlocks() {}
}
