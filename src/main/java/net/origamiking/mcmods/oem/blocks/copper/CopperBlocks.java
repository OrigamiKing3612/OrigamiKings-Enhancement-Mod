package net.origamiking.mcmods.oem.blocks.copper;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.blocks.custom.copper.oxidiziable.*;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.copper.oxidiziable.*;

public class CopperBlocks {
    public static final Block COPPER_BARS = registerCopperBlock("copper_bars", new OxidizableCopperBarBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_BARS = registerCopperBlock("exposed_copper_bars", new OxidizableCopperBarBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_BARS = registerCopperBlock("weathered_copper_bars", new OxidizableCopperBarBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_BARS = registerCopperBlock("oxidized_copper_bars", new OxidizableCopperBarBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block COPPER_CHAIN = registerCopperBlock("copper_chain", new OxidizableCopperChainBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_CHAIN = registerCopperBlock("exposed_copper_chain", new OxidizableCopperChainBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_CHAIN = registerCopperBlock("weathered_copper_chain", new OxidizableCopperChainBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_CHAIN = registerCopperBlock("oxidized_copper_chain", new OxidizableCopperChainBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block COPPER_LANTERN = registerCopperBlock("copper_lantern", new OxidizableCopperLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block EXPOSED_COPPER_LANTERN = registerCopperBlock("exposed_copper_lantern", new OxidizableCopperLanternBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WEATHERED_COPPER_LANTERN = registerCopperBlock("weathered_copper_lantern", new OxidizableCopperLanternBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block OXIDIZED_COPPER_LANTERN = registerCopperBlock("oxidized_copper_lantern", new OxidizableCopperLanternBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block COPPER_PRESSURE_PLATE = registerCopperBlock("copper_pressure_plate", new OxidizableCopperPresurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision()));
    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerCopperBlock("exposed_copper_pressure_plate", new OxidizableCopperPresurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision()));
    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerCopperBlock("weathered_copper_pressure_plate", new OxidizableCopperPresurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision()));
    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerCopperBlock("oxidized_copper_pressure_plate", new OxidizableCopperPresurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision()));
    public static final Block COPPER_BUTTON = registerCopperBlock("copper_button", new OxidizableCopperButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool()));
    public static final Block EXPOSED_COPPER_BUTTON = registerCopperBlock("exposed_copper_button", new OxidizableCopperButtonBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool()));
    public static final Block WEATHERED_COPPER_BUTTON = registerCopperBlock("weathered_copper_button", new OxidizableCopperButtonBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool()));
    public static final Block OXIDIZED_COPPER_BUTTON = registerCopperBlock("oxidized_copper_button", new OxidizableCopperButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).noCollision().strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool()));
    public static final Block COPPER_DOOR = registerCopperBlock("copper_door", new OxidizableCopperDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));
    public static final Block COPPER_TRAPDOOR = registerCopperBlock("copper_trapdoor", new OxidizableCopperTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));
    public static final Block EXPOSED_COPPER_DOOR = registerCopperBlock("exposed_copper_door", new OxidizableCopperDoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));
    public static final Block EXPOSED_COPPER_TRAPDOOR = registerCopperBlock("exposed_copper_trapdoor", new OxidizableCopperTrapdoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));
    public static final Block WEATHERED_COPPER_DOOR = registerCopperBlock("weathered_copper_door", new OxidizableCopperDoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));
    public static final Block WEATHERED_COPPER_TRAPDOOR = registerCopperBlock("weathered_copper_trapdoor", new OxidizableCopperTrapdoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));
    public static final Block OXIDIZED_COPPER_DOOR = registerCopperBlock("oxidized_copper_door", new OxidizableCopperDoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));
    public static final Block OXIDIZED_COPPER_TRAPDOOR = registerCopperBlock("oxidized_copper_trapdoor", new OxidizableCopperTrapdoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(0.5f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()));


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static Block registerCopperBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getCopperBlocks() {
        WaxedCopperBlocks.get();
        OtherCopperStuff.pairWaxedAndNotWaxed();
        OtherCopperStuff.pairTypesofCopper();
    }
}
