package net.origamiking.mcmods.oem.items.custom.renderers;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.items.custom.FutureGunArrowEntity;

public class FutureGunArrowEntityRenderer extends ProjectileEntityRenderer<FutureGunArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("textures/entity/projectiles/arrow.png");

    public FutureGunArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(FutureGunArrowEntity entity) {
        return TEXTURE;
    }

}
