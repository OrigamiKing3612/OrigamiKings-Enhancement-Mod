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

public class ModBlocksSculk {
    public static final Block SCULK_STAIR = registerBlock("sculk_stairs", new StairsBlock(Blocks.SCULK.getDefaultState(),FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static final Block SCULK_SLAB = registerBlock("sculk_slab", new SlabBlock(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK)));
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, name), block);
    }
    public static void getSculkBlocks() {}
}
