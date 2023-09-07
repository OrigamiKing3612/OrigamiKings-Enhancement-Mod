package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.AdvancementEntry;
import net.origamiking.mcmods.oem.datagen.advancement.OemAdvancements;

import java.util.function.Consumer;

public class ModAdvancementGenerator extends FabricAdvancementProvider {
    protected ModAdvancementGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        new OemAdvancements().accept(consumer);
    }
}