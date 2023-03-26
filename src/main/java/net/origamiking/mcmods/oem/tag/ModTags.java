package net.origamiking.mcmods.oem.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModTags {
    public static final TagKey<Block> AZALEA_PLANKS = TagKey.of(RegistryKeys.BLOCK, new Identifier(OemMain.MOD_ID, "azalea_planks"));

    public static void get() {

    }

}
