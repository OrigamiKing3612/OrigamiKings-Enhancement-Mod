package net.origamiking.mcmods.oem.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;


public class ModBlocks {
    //public static final Block TEST = registerBlock("test", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block WHITE_CONCRETE_STAIR = registerBlock("white_concrete_stair", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block BLACK_CONCRETE_STAIR = registerBlock("black_concrete_stair", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));

    public static final Block WHITE_CONCRETE_STAIR = registerBlock("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));

    public static final Block OAK_BARREL = registerBlock("oak_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block WARPED_BARREL = registerBlock("warped_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));

    public static final Block OAK_LADDER = registerBlock("oak_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()));
    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));
    public static final Block WARPED_LADDER = registerBlock("warped_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool()));


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void register() {
        OemMain.LOGGER.info("Registering Blocks");
    }
}

