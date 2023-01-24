package net.origamiking.mcmods.oem.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class NewCowEntity extends PathAwareEntity {
    protected NewCowEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
        public static final EntityType<NewCowEntity> NEW_COW_ENTITY = Registry.register(
                Registries.ENTITY_TYPE,
                new Identifier("oem", "new_cow_entity"),
                FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, NewCowEntity::new)
                        .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
        );
    public static void getNewCowEntity() {
        FabricDefaultAttributeRegistry.register(NEW_COW_ENTITY, NewCowEntity.createMobAttributes());
    }
}
