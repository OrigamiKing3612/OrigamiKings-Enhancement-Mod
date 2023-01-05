package net.origamiking.mcmods.oem.armor.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.VikingArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class VikingArmorRenderer extends GeoArmorRenderer<VikingArmorItem>{
        public VikingArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OemMain.MOD_ID, "armor/viking_armor")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


