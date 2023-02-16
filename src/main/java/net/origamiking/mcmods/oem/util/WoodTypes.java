package net.origamiking.mcmods.oem.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum WoodTypes {
        OAK(true),
        SPRUCE(true),
        BIRCH(true),
        JUNGLE(true),
        ACACIA(true),
        DARK_OAK(true),
        AZALEA(true),
        CRIMSON(false),
        WARPED(false);

        private final boolean flammable;

        WoodTypes(boolean flammable) {
            this.flammable = flammable;
        }

//        @Override
//        public boolean isFlammable() {
//            return flammable;
//        }

//        public static List<IWoodMaterial> getTypes() {
//            return Arrays.stream(values()).collect(Collectors.toList());
//        }
//
//        public static List<IWoodMaterial> getTypesWithout(IWoodMaterial... types) {
//            List<IWoodMaterial> typesList = new ArrayList<>(Arrays.asList(types));
//            return Arrays.stream(values()).filter(t -> !typesList.contains(t)).collect(Collectors.toList());
//        }
//    }

}
