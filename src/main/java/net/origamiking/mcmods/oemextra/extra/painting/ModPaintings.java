package net.origamiking.mcmods.oemextra.extra.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;

public class ModPaintings {
    public static final PaintingMotive SUS = registerPainting("sus", new PaintingMotive(32, 32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingVariant) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(OemMain.MOD_ID, name), paintingVariant);
    }
    public static void register() {
        OemMain.LOGGER.info("Registering Extra Paintings for " + OemMain.NAME);
    }
}
