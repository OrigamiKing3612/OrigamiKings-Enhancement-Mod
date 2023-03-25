package net.origamiking.mcmods.oem.blocks.vercticalslabs;

import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.copper.CopperVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.stone.StoneVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.wood.WoodVSlabs;

public class ModVericalSlabs {
    public static void registerVerticalSlabs() {
        StoneVSlabs.get();
        WoodVSlabs.get();
        ConcreteVSlabs.get();
        GlassVSlabs.get();
        CopperVSlabs.get();
    }
}
