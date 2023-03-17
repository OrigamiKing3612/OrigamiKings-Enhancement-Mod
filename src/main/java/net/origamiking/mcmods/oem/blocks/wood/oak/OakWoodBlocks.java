package net.origamiking.mcmods.oem.blocks.wood.oak;

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


public class OakWoodBlocks {
    public static final Block OAK_BARREL = registerBlock(OemMain.MOD_ID, "oak_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_LADDER = registerBlock(OemMain.MOD_ID, "oak_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).nonOpaque().requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block OAK_CHEST = registerBlock(OemMain.MOD_ID, "oak_chest", new ChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> BlockEntityType.CHEST));
    public static final Block OAK_TRAPPED_CHEST = registerBlock(OemMain.MOD_ID, "oak_trapped_chest", new TrappedChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
    
    public static void getOakBlocks() {}
}
