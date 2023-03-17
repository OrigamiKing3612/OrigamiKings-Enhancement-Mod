package net.origamiking.mcmods.oem.blocks.vercticalslabs;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.copper.CopperVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.stone.StoneVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.wood.WoodVSlabs;

public class ModVericalSlabs {
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static Block registerBlock(String type, Block block) {
        registerBlockItem(type, block);
        return Registry.register(Registries.BLOCK, new Identifier(OemMain.MOD_ID, type), block);
    }
    public static void registerVerticalSlabs() {
        StoneVSlabs.get();
        WoodVSlabs.get();
        ConcreteVSlabs.get();
        GlassVSlabs.get();
        CopperVSlabs.get();
    }
}
