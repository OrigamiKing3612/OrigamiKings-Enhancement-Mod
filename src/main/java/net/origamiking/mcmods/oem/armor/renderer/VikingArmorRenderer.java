package net.origamiking.mcmods.oem.armor.renderer;

import net.origamiking.mcmods.oem.armor.VikingArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class VikingArmorRenderer extends GeoArmorRenderer<VikingArmorItem> {
        public VikingArmorRenderer() {
            super(new VikingArmorModel());

            this.headBone = "helmet";
            this.bodyBone = "chestplate";
            this.rightArmBone = "rightArm";
            this.leftArmBone = "leftArm";
            this.rightLegBone = "rightLeg";
            this.leftLegBone = "leftLeg";
            this.rightBootBone = "rightBoot";
            this.leftBootBone = "leftBoot";

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


