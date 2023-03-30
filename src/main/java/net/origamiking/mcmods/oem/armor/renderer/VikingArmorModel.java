package net.origamiking.mcmods.oem.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.VikingArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VikingArmorModel extends AnimatedGeoModel<VikingArmorItem> {
    @Override
    public Identifier getModelResource(VikingArmorItem object) {
        return new Identifier(OemMain.MOD_ID, "geo/viking_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(VikingArmorItem object) {
        return new Identifier(OemMain.MOD_ID,"textures/item/viking_armor.png");
    }

    @Override
    public Identifier getAnimationResource(VikingArmorItem animatable) {
        return new Identifier(OemMain.MOD_ID,"animations/viking_armor.animation.json");
    }
}
