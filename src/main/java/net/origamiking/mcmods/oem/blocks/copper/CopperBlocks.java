package net.origamiking.mcmods.oem.blocks.copper;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class CopperBlocks {
    public static final Block COPPER_BARS = registerOxidizableBlock("copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f).sounds(BlockSoundGroup.COPPER).nonOpaque()), new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).nonOpaque().requiresTool().strength(5.0f).sounds(BlockSoundGroup.COPPER)));
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerOxidizableBlock(String name, Block block, OxidizableBlock oxidizableBlock) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getCopperBlocks() {}
}
