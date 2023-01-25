package net.origamiking.mcmods.oem.blocks.verticalstairs;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.verticalstairs.stone.StoneVStairs;

public class ModVerticalStairs {
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static Block registerBlock(String type, Block block) {
        registerBlockItem(type, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, type), block);
    }
    //TODO oak_vertical_stairs
    public static void registerVerticalStairs() {
        StoneVStairs.get();
    }
}
