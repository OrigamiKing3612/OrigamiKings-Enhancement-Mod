package net.origamiking.mcmods.oem.armor;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;

public class ArmorRegistry {

    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registry.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void getArmor() {
        OemMain.LOGGER.info("Registering Extra Armor for " + OemMain.NAME);
    }
}
