package net.origamiking.mcmods.oem.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib.GeckoLib;

public class ArmorRegistry {
    public static final VikingArmorItem VIKING_ARMOR_HELMET = registerItem("viking_helmet", new VikingArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Settings()));


    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void getArmor() {

    }
}
