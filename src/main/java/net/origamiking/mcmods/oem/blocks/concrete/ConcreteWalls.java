package net.origamiking.mcmods.oem.blocks.concrete;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ConcreteWalls {
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getConcreteWalls() {}
}
