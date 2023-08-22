package net.origamiking.mcmods.oemextra.extra.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.painting.PaintingUtils.registerPainting;

public class ModPaintings {
    public static final PaintingVariant SUS = registerPainting(OemMain.MOD_ID, "sus", new PaintingVariant(32, 32));

    public static void register() {
        OemMain.LOGGER.info("Registering Extra Paintings for " + OemMain.VERSION);
    }
}
