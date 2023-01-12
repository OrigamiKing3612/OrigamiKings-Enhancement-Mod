package net.origamiking.mcmods.oem.blocks.copper;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class CopperBlocks {//ALL NEED BLOCKSTATE AND MODEL FILES but copper plate
    public static final Block COPPER_BARS = registerBlock("copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars", new PaneBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block COPPER_CHAIN = registerBlock("copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block COPPER_LANTERN = registerBlock("copper_lantern", new LanternBlock(FabricBlockSettings.of(Material.METAL).luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision(), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF));
    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("exposed_copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision(), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF));
    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("weathered_copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision(), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF));
    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_copper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision(), SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF));
    public static final Block COPPER_BUTTON = registerBlock("copper_button", new ButtonBlock(FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool(), 30, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button", new ButtonBlock(FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool(), 30, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button", new ButtonBlock(FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool(), 30, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button", new ButtonBlock(FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool(), 30, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final Block COPPER_DOOR = registerBlock("copper_door", new DoorBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(BlockSoundGroup.COPPER).requiresTool(), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));
    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool(), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block/*, OxidizableBlock oxidizableBlock*/) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getCopperBlocks() {}
}
