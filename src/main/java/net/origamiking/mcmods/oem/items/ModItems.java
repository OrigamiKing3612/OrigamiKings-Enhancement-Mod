package net.origamiking.mcmods.oem.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void register() {

    }
}
