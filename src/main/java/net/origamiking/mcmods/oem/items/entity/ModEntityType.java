package net.origamiking.mcmods.oem.items.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.resource.featuretoggle.ToggleableFeature;
import net.minecraft.util.TypeFilter;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ModEntityType<T extends Entity>  implements ToggleableFeature, TypeFilter<Entity, T> {
    private final FeatureSet requiredFeatures;
    private final EntityType<?> type;
//    public static final EntityType<ArrowEntity> FUTURE_GUN_ARROW = ModEntityType.register("fut_gun_arrow", EntityType.Builder.create(ArrowEntity::new, SpawnGroup.MISC).setDimensions(0.5f, 0.5f).maxTrackingRange(4).trackingTickInterval(20));

    public ModEntityType(EntityType<?> type, World world, FeatureSet requiredFeatures) {
        this.type = type;
        this.requiredFeatures = requiredFeatures;
    }

    @Override
    public FeatureSet getRequiredFeatures() {
        return this.requiredFeatures;
    }
    public EntityType<?> getType() {
        return this.type;
    }
    @Nullable
    @Override
    public T downcast(Entity entity) {
        return /*(T)(entity.getType() == this ? entity : */null/*)*/;
    }

    @Override
    public Class<? extends Entity> getBaseClass() {
        return Entity.class;
    }
    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, id, type.build(id));
    }
}
