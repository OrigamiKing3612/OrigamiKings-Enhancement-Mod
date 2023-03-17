package net.origamiking.mcmods.oem.blocks.server_specific;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.PrimBlock;
import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class ServerSpecificBlocks {
    public  static final Block GOLD_LANTERN = registerBlock(OemMain.MOD_ID, "gold_lantern", new LanternBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(10).sounds(BlockSoundGroup.LANTERN)));
    public static final Block GOLD_CHAIN = registerBlock(OemMain.MOD_ID, "gold_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().sounds(BlockSoundGroup.CHAIN)));
    public static final Block CAVERNS_BLOCK_ONE = registerBlock(OemMain.MOD_ID, "caverns_block_one", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_TWO = registerBlock(OemMain.MOD_ID, "caverns_block_two", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_THREE = registerBlock(OemMain.MOD_ID, "caverns_block_three", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_FOUR = registerBlock(OemMain.MOD_ID, "caverns_block_four", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_FIVE = registerBlock(OemMain.MOD_ID, "caverns_block_five", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_SIX = registerBlock(OemMain.MOD_ID, "caverns_block_six", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block PRIM = registerBlock(OemMain.MOD_ID, "prim", new PrimBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).noCollision().nonOpaque().breakInstantly()));
    public static final Block IRON_BAR_DOOR = registerBlock(OemMain.MOD_ID, "iron_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block GOLD_BAR_DOOR = registerBlock(OemMain.MOD_ID, "gold_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block EXPOSED_COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "exposed_copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block WEATHERED_COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "weathered_copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block OXIDIZED_COPPER_BAR_DOOR = registerBlock(OemMain.MOD_ID, "oxidized_copper_bar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static void getServerSpecific() {}
}
