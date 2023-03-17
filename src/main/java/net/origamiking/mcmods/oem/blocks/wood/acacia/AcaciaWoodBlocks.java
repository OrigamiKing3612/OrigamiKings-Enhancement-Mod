package net.origamiking.mcmods.oem.blocks.wood.acacia;

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


public class AcaciaWoodBlocks {
    public static final Block ACACIA_BARREL = registerBlock(OemMain.MOD_ID, "acacia_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_BOOKSHELF = registerBlock(OemMain.MOD_ID, "acacia_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_LADDER = registerBlock(OemMain.MOD_ID, "acacia_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block ACACIA_CHEST = registerBlock(OemMain.MOD_ID, "acacia_chest", new ChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> BlockEntityType.CHEST));
    public static final Block ACACIA_TRAPPED_CHEST = registerBlock(OemMain.MOD_ID, "acacia_trapped_chest", new TrappedChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));

    public static void getAcaciaBlocks() {}
}
