package net.origamiking.mcmods.oem.armor.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class VikingArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {2, 3, 4, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getArmorStandSlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getArmorStandSlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }

    @Override
    public String getName() {
        return "viking";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }

    public class getVikingArmor {
        public static final ArmorMaterial VIKING_ARMOR_MATERIAL = new VikingArmorMaterial();
        // If you made a new material, this is where you would note it.
        //public static final Item VIKING_HELMET = new ArmorItem(VIKING_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
//        public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
//        public static final Item COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
//        public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());

        public static void register() {
                //Registry.register(Registries.ITEM, new Identifier("oem", "viking_helmet"), VIKING_HELMET);
//                Registry.register(Registries.ITEM, new Identifier("oem", "copper_chestplate"), COPPER_CHESTPLATE);
//                Registry.register(Registries.ITEM, new Identifier("oem", "copper_leggings"), COPPER_LEGGINGS);
//                Registry.register(Registries.ITEM, new Identifier("oem", "copper_boots"), COPPER_BOOTS);
            }
        }
    }

