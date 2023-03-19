package net.origamiking.mcmods.oem.blocks.wood.azalea;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.OemMain;
import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class AzaleaWoodBlocks {
    public static final Block AZALEA_BARREL = registerBlock(OemMain.MOD_ID, "azalea_barrel", new BarrelBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_BOOKSHELF = registerBlock(OemMain.MOD_ID, "azalea_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_LADDER = registerBlock(OemMain.MOD_ID, "azalea_ladder", new LadderBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));
    public static final Block AZALEA_LOG = registerBlock(OemMain.MOD_ID, "azalea_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock(OemMain.MOD_ID, "stripped_azalea_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_WOOD = registerBlock(OemMain.MOD_ID, "azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock(OemMain.MOD_ID, "stripped_azalea_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_PLANKS = registerBlock(OemMain.MOD_ID, "azalea_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_STAIR = registerBlock(OemMain.MOD_ID, "azalea_plank_stair", new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_SLAB = registerBlock(OemMain.MOD_ID, "azalea_plank_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_FENCE = registerBlock(OemMain.MOD_ID, "azalea_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block AZALEA_FENCE_GATE = registerBlock(OemMain.MOD_ID, "azalea_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.OAK));
    public static final Block AZALEA_DOOR = registerBlock(OemMain.MOD_ID, "azalea_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block AZALEA_TRAPDOOR = registerBlock(OemMain.MOD_ID, "azalea_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock(OemMain.MOD_ID, "azalea_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block AZALEA_BUTTON = registerBlock(OemMain.MOD_ID, "azalea_button", new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final Block AZALEA_CHEST = registerBlock(OemMain.MOD_ID, "azalea_chest", new ChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), () -> BlockEntityType.CHEST));
    public static final Block AZALEA_TRAPPED_CHEST = registerBlock(OemMain.MOD_ID, "azalea_trapped_chest", new TrappedChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));

    public static void getAzaleaBlocks() {}
}
