package net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.stone.StoneVStairs;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.wood.WoodVStairs;

public class ModVerticalStairs {
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static Block registerBlock(String type, Block block) {
        registerBlockItem(type, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, type), block);
    }
    public static void registerVerticalStairs() {
        OemMain.LOGGER.info("Registering Vertical Stairs for " + OemMain.NAME);
        StoneVStairs.get();
        WoodVStairs.get();
    }
}
