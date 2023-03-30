package net.origamiking.mcmods.oem.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.materials.VikingArmorMaterial;

public class ArmorRegistry {
    public static final VikingArmorItem VIKING_ARMOR_HELMET = registerItem("viking_armor", new VikingArmorItem(VikingArmorMaterial.getVikingArmor.VIKING_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings()));

    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registry.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void getArmor() {
        OemMain.LOGGER.info("Registering Extra Armor for " + OemMain.NAME);
    }
}
