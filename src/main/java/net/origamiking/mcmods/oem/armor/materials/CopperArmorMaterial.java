package net.origamiking.mcmods.oem.armor.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class CopperArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {2, 3, 4, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 6;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
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
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return "copper";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }

    public class getCopperArmor {
        public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
        // If you made a new material, this is where you would note it.
        public static final Item COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
        public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
        public static final Item COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
        public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());

        public static void register() {
                Registry.register(Registries.ITEM, new Identifier("oem", "copper_helmet"), COPPER_HELMET);
                Registry.register(Registries.ITEM, new Identifier("oem", "copper_chestplate"), COPPER_CHESTPLATE);
                Registry.register(Registries.ITEM, new Identifier("oem", "copper_leggings"), COPPER_LEGGINGS);
                Registry.register(Registries.ITEM, new Identifier("oem", "copper_boots"), COPPER_BOOTS);
            };
        };
    }

