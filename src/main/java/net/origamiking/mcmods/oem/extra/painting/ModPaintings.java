package net.origamiking.mcmods.oem.extra.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;

public class ModPaintings {
    public static final PaintingVariant SUS = registerPainting("sus", new PaintingVariant(32, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(OemMain.MOD_ID, name), paintingVariant);
    }
    public static void register() {}
}
