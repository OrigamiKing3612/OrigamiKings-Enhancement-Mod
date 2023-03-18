package net.origamiking.mcmods.oem.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.materials.VikingArmorMaterial;

public class ArmorRegistry {
    public static final VikingArmorItem VIKING_ARMOR_HELMET = registerItem("viking_armor", new VikingArmorItem(VikingArmorMaterial.getVikingArmor.VIKING_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()));

    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void getArmor() {

    }
}
