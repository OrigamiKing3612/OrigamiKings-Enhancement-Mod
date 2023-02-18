package net.origamiking.mcmods.oem.resource.featuretoggle;

import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureManager;

public class ModFeatureFlags extends FeatureFlags {
    public static final FeatureFlag OEM_UPDATE_0_6_0;


    static {
        FeatureManager.Builder builder = new FeatureManager.Builder("main");
        OEM_UPDATE_0_6_0= builder.addVanillaFlag("oem_update_0_6_0");
    }

}
