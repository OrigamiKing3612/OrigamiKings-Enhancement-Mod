package net.origamiking.mcmods.oem.blocks.wood.azalea;

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
public class AzaleaWoodBlocks {
    public static final Block AZALEA_BARREL = registerBlock("azalea_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_BOOKSHELF = registerBlock("azalea_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_LADDER = registerBlock("azalea_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block AZALEA_LOG = registerBlock("azalea_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AZALEA_STAIR = registerBlock("azalea_plank_stair", new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AZALEA_SLAB = registerBlock("azalea_plank_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AZALEA_FENCE = registerBlock("azalea_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN));
    public static final Block AZALEA_DOOR = registerBlock("azalea_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN));
    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getAzaleaBlocks() {}
}
