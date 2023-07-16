package net.origamiking.mcmods.oem.stats;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

import static net.minecraft.stat.Stats.CUSTOM;

public class ModStats {
    public static final Identifier INTERACT_WITH_WOODCUTTER = register(OemMain.MOD_ID, "interact_with_woodcutter", StatFormatter.DEFAULT);
    public static void register() {

    }
    //TODO get from oapi
    private static Identifier register(String modid, String id, StatFormatter formatter) {
        Identifier identifier = new Identifier(modid + ":" + id);
        Registry.register(Registries.CUSTOM_STAT, id, identifier);
        CUSTOM.getOrCreateStat(identifier, formatter);
        return identifier;
    }
}
