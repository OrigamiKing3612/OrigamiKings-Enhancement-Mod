package net.origamiking.mcmods.oem.blocks.wood.warped;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class WarpedWoodBlocks {
    public static final Block WARPED_BARREL = registerBlock(OemMain.MOD_ID, "warped_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_BOOKSHELF = registerBlock(OemMain.MOD_ID, "warped_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_LADDER = registerBlock(OemMain.MOD_ID, "warped_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block WARPED_CHEST = registerBlock(OemMain.MOD_ID, "warped_chest", new ChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> BlockEntityType.CHEST));
    public static final Block WARPED_TRAPPED_CHEST = registerBlock(OemMain.MOD_ID, "warped_trapped_chest", new TrappedChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
    
    public static void getWarpedBlocks() {}
}
