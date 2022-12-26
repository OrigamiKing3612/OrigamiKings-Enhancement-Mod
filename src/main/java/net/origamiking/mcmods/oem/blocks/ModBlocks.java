package net.origamiking.mcmods.oem.blocks;

import com.sun.source.tree.LambdaExpressionTree;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;


public class ModBlocks {
    //public static final Block TEST = registerBlock("test", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block WHITE_CONCRETE_STAIR = registerBlock("white_concrete_stair", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block BLACK_CONCRETE_STAIR = registerBlock("black_concrete_stair", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    //public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));

    public static final Block WHITE_CONCRETE_STAIR = registerBlock("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_CONCRETE_STAIR = registerBlock("black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIR = registerBlock("light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_CONCRETE_STAIR = registerBlock("gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_CONCRETE_STAIR = registerBlock("brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RED_CONCRETE_STAIR = registerBlock("red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CONCRETE_STAIR = registerBlock("orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_CONCRETE_STAIR = registerBlock("yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_CONCRETE_STAIR = registerBlock("lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_CONCRETE_STAIR = registerBlock("green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_CONCRETE_STAIR = registerBlock("cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIR = registerBlock("light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_CONCRETE_STAIR = registerBlock("blue_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_CONCRETE_STAIR = registerBlock("purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_CONCRETE_STAIR = registerBlock("magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CONCRETE_STAIR = registerBlock("pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SCULK_STAIR = registerBlock("sculk_stairs", new StairsBlock(Blocks.SCULK.getDefaultState(),FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));
    public static final Block OAK_BARREL = registerBlock("oak_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_BARREL = registerBlock("warped_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block OAK_LADDER = registerBlock("oak_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block WARPED_LADDER = registerBlock("warped_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));

    public  static final Block GOLD_LANTERN = registerBlock("gold_lantern", new LanternBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(10).sounds(BlockSoundGroup.STONE).sounds(BlockSoundGroup.LANTERN)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SCULK_SLAB = registerBlock("sculk_slab", new SlabBlock(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));

    //public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane.json", new StainedGlassPaneBlock(FabricBlockSettings.of(Material.GLASS).strength(4f).requiresTool().sounds(BlockSoundGroup.GLASS)));

    public static final Block GOLD_CHAIN = registerBlock("gold_chain", new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().sounds(BlockSoundGroup.CHAIN)));

    public static final Block GLASS_STAIR = registerBlock("glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GLASS_SLAB = registerBlock("glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_GLASS_STAIR = registerBlock("white_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_GLASS_SLAB = registerBlock("white_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_GLASS_STAIR = registerBlock("light_gray_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_GLASS_SLAB = registerBlock("light_gray_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_GLASS_STAIR = registerBlock("gray_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_GLASS_SLAB = registerBlock("gray_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_GLASS_SLAB = registerBlock("black_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_GLASS_STAIR = registerBlock("black_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_GLASS_SLAB = registerBlock("brown_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_GLASS_STAIR = registerBlock("brown_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_GLASS_SLAB = registerBlock("red_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_GLASS_STAIR = registerBlock("red_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_GLASS_SLAB = registerBlock("orange_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_GLASS_STAIR = registerBlock("orange_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_GLASS_SLAB = registerBlock("yellow_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_GLASS_STAIR = registerBlock("yellow_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_GLASS_SLAB = registerBlock("lime_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_GLASS_STAIR = registerBlock("lime_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_GLASS_SLAB = registerBlock("green_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_GLASS_STAIR = registerBlock("green_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_GLASS_SLAB = registerBlock("cyan_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_GLASS_STAIR = registerBlock("cyan_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_GLASS_SLAB = registerBlock("light_blue_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_GLASS_STAIR = registerBlock("light_blue_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_GLASS_SLAB = registerBlock("blue_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_GLASS_STAIR = registerBlock("blue_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_GLASS_SLAB = registerBlock("purple_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_GLASS_STAIR = registerBlock("purple_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_GLASS_SLAB = registerBlock("magenta_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_GLASS_STAIR = registerBlock("magenta_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_GLASS_SLAB = registerBlock("pink_glass_slab", new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_GLASS_STAIR = registerBlock("pink_glass_stairs", new StairsBlock(Blocks.GLASS.getDefaultState(), FabricBlockSettings.of(Material.GLASS).strength(0.3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GLASS)));

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

