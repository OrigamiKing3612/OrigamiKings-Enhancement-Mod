package net.origamiking.mcmods.oem.blocks.server_specific;

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
import net.origamiking.mcmods.oem.blocks.custom.PrimBlock;
//import net.origamiking.mcmods.oem.blocks.custom.BoomboxBlock;

public class ServerSpecificBlocks {
    public  static final Block GOLD_LANTERN = registerBlock("gold_lantern", new LanternBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(10).sounds(BlockSoundGroup.LANTERN)));
    public static final Block GOLD_CHAIN = registerBlock("gold_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().sounds(BlockSoundGroup.CHAIN)));
    public static final Block CAVERNS_BLOCK_ONE = registerBlock("caverns_block_one", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_TWO = registerBlock("caverns_block_two", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_THREE = registerBlock("caverns_block_three", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_FOUR = registerBlock("caverns_block_four", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_FIVE = registerBlock("caverns_block_five", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_SIX = registerBlock("caverns_block_six", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block PRIM = registerBlock("prim", new PrimBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).noCollision().nonOpaque().breakInstantly()));
    public static final Block IRON_BAR_DOOR = registerBlock("iron_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));
    public static final Block GOLD_BAR_DOOR = registerBlock("gold_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));
    public static final Block COPPER_BAR_DOOR = registerBlock("copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));
    public static final Block EXPOSED_COPPER_BAR_DOOR = registerBlock("exposed_copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));
    public static final Block WEATHERED_COPPER_BAR_DOOR = registerBlock("weathered_copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));
    public static final Block OXIDIZED_COPPER_BAR_DOOR = registerBlock("oxidized_copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN));
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getServerSpecific() {}
}
