package net.origamiking.mcmods.oem.blocks.concrete;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class ConcreteWalls {
    public static String id = OemMain.MOD_ID;
    public static final Block WHITE_CONCRETE_WALL = registerBlock(id, "white_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock(id, "black_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock(id, "light_gray_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock(id, "gray_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock(id, "brown_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RED_CONCRETE_WALL = registerBlock(id, "red_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock(id, "orange_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock(id, "yellow_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock(id, "lime_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock(id, "green_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock(id, "cyan_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock(id, "light_blue_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock(id, "blue_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock(id, "purple_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock(id, "magenta_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock(id, "pink_concrete_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static void getConcreteWalls() {}
}
