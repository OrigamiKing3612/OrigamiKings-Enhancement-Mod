package net.origamiking.mcmods.oem.blocks.copper;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;

public class WaxedCopperBlocks extends CopperBlocks {
    public static final Block WAXED_COPPER_BARS = registerCopperBlock("waxed_copper_bars", new PaneBlock(OrigamiBlockSettings.create().requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerCopperBlock("waxed_exposed_copper_bars", new PaneBlock(OrigamiBlockSettings.create().requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerCopperBlock("waxed_weathered_copper_bars", new PaneBlock(OrigamiBlockSettings.create().requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerCopperBlock("waxed_oxidized_copper_bars", new PaneBlock(OrigamiBlockSettings.create().requiresTool().strength(4f).nonOpaque().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_CHAIN = registerCopperBlock("waxed_copper_chain", new ChainBlock(OrigamiBlockSettings.create().strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerCopperBlock("waxed_exposed_copper_chain", new ChainBlock(OrigamiBlockSettings.create().strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerCopperBlock("waxed_weathered_copper_chain", new ChainBlock(OrigamiBlockSettings.create().strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerCopperBlock("waxed_oxidized_copper_chain", new ChainBlock(OrigamiBlockSettings.create().strength(0.4f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_LANTERN = registerCopperBlock("waxed_copper_lantern", new LanternBlock(OrigamiBlockSettings.create().luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerCopperBlock("waxed_exposed_copper_lantern", new LanternBlock(OrigamiBlockSettings.create().luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerCopperBlock("waxed_weathered_copper_lantern", new LanternBlock(OrigamiBlockSettings.create().luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerCopperBlock("waxed_oxidized_copper_lantern", new LanternBlock(OrigamiBlockSettings.create().luminance(8).strength(0.2f).requiresTool().sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_PRESSURE_PLATE = registerCopperBlock("waxed_copper_pressure_plate", createCopperPressurePlate());
    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerCopperBlock("waxed_exposed_copper_pressure_plate", createCopperPressurePlate());
    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerCopperBlock("waxed_weathered_copper_pressure_plate", createCopperPressurePlate());
    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerCopperBlock("waxed_oxidized_copper_pressure_plate", createCopperPressurePlate());
    public static final Block WAXED_COPPER_BUTTON = registerCopperBlock("waxed_copper_button", createCopperButton());
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerCopperBlock("waxed_exposed_copper_button", createCopperButton());
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerCopperBlock("waxed_weathered_copper_button", createCopperButton());
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerCopperBlock("waxed_oxidized_copper_button", createCopperButton());
    public static final Block WAXED_COPPER_DOOR = registerCopperBlock("waxed_copper_door", createCopperDoor());
    public static final Block WAXED_COPPER_TRAPDOOR = registerCopperBlock("waxed_copper_trapdoor", createCopperTrapdoor());
    public static final Block WAXED_EXPOSED_COPPER_DOOR = registerCopperBlock("waxed_exposed_copper_door", createCopperDoor());
    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = registerCopperBlock("waxed_exposed_copper_trapdoor", createCopperTrapdoor());
    public static final Block WAXED_WEATHERED_COPPER_DOOR = registerCopperBlock("waxed_weathered_copper_door", createCopperDoor());
    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = registerCopperBlock("waxed_weathered_copper_trapdoor", createCopperTrapdoor());
    public static final Block WAXED_OXIDIZED_COPPER_DOOR = registerCopperBlock("waxed_oxidized_copper_door", createCopperDoor());
    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = registerCopperBlock("waxed_oxidized_copper_trapdoor", createCopperTrapdoor());

    public static PressurePlateBlock createCopperPressurePlate() {
        return new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, OrigamiBlockSettings.create().requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision(), BlockSetType.IRON);
    }

    public static ButtonBlock createCopperButton() {
        return new ButtonBlock(OrigamiBlockSettings.create().requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).noCollision(), BlockSetType.IRON, 30, false);
    }

    public static DoorBlock createCopperDoor() {
        return new DoorBlock(OrigamiBlockSettings.create().requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).nonOpaque(), BlockSetType.IRON);
    }

    public static TrapdoorBlock createCopperTrapdoor() {
        return new TrapdoorBlock(OrigamiBlockSettings.create().requiresTool().strength(0.5f).sounds(BlockSoundGroup.COPPER).nonOpaque(), BlockSetType.IRON);
    }

    public static void get() {
    }
}
