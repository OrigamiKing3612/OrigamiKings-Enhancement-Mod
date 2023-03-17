package net.origamiking.mcmods.oem.blocks.sculk;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class SculkBlocks {
    public static String id = OemMain.MOD_ID;
    public static final Block SCULK_STAIR = registerBlock(id, "sculk_stairs", new StairsBlock(Blocks.SCULK.getDefaultState(),FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static final Block SCULK_SLAB = registerBlock(id, "sculk_slab", new SlabBlock(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));
    public static final Block SCULK_WALL = registerBlock(id, "sculk_wall", new WallBlock(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));
    public static void getSculkBlocks() {}
}
