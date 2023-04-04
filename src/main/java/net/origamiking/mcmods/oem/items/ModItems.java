package net.origamiking.mcmods.oem.items;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.entity.boat.api.OrigamiBoatType;
import net.origamiking.mcmods.oapi.entity.boat.api.OrigamiBoatTypeRegistry;
import net.origamiking.mcmods.oapi.entity.boat.api.item.OrigamiBoatItemHelper;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
import net.origamiking.mcmods.oem.items.custom.FutureGunArrowEntity;

import static net.origamiking.mcmods.oapi.items.ItemsUtils.registerItem;

public class ModItems {
    public static final Identifier CUSTOM_BOAT_ID = new Identifier(OemMain.MOD_ID, "azalea_boat");
    public static final Identifier CUSTOM_CHEST_BOAT_ID = new Identifier(OemMain.MOD_ID, "azalea_chest_boat");
    private static final RegistryKey<OrigamiBoatType> AZALEA_BOAT_KEY = OrigamiBoatTypeRegistry.createKey(CUSTOM_BOAT_ID);
    public static final Item COPPER_NUGGET = registerItem(OemMain.MOD_ID,"copper_nugget", new Item(new OrigamiItemSettings()));
    public static final EntityType<FutureGunArrowEntity> FutureGunArrowEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(OemMain.MOD_ID, "fut_gun_arrow"),
            FabricEntityTypeBuilder.<FutureGunArrowEntity>create(SpawnGroup.MISC, FutureGunArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)) // dimensions in Minecraft units of the projectile
                    .trackRangeBlocks(4).trackedUpdateRate(10) // necessary for all thrown projectiles
                    .build());

    public static void register() {
        CopperArmorMaterial.getCopperArmor.register();
        OemMain.LOGGER.info("Registering Items for " + OemMain.NAME);

        Item boatItem = OrigamiBoatItemHelper.registerBoatItem(CUSTOM_BOAT_ID, AZALEA_BOAT_KEY, false);
        Item chestBoatItem = OrigamiBoatItemHelper.registerBoatItem(CUSTOM_CHEST_BOAT_ID, AZALEA_BOAT_KEY, true);

        OrigamiBoatType boat = new OrigamiBoatType.Builder()
                .item(boatItem)
                .chestItem(chestBoatItem)
                .planks(Item.fromBlock(AzaleaWoodBlocks.AZALEA_PLANKS))
                .build();

        Registry.register(OrigamiBoatTypeRegistry.INSTANCE, AZALEA_BOAT_KEY, boat);

    }
}
