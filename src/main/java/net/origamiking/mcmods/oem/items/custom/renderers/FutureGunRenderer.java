package net.origamiking.mcmods.oem.items.custom.renderers;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.items.custom.FutureGunItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FutureGunRenderer extends GeoItemRenderer<FutureGunItem> {
    public FutureGunRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(OemMain.MOD_ID, "fut_gun")));
    }

}
