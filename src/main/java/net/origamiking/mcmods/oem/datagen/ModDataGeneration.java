package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.origamiking.mcmods.oem.datagen.ModModelProvider;

import static net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.*;

public class ModDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBlockLootTableGenerator::new);
    }
}
