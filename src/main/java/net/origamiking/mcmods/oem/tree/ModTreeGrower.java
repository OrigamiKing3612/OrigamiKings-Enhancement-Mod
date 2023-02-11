//package net.origamiking.mcmods.oem.tree;
//
////import net.minecraft.core.BlockPos;
////import net.minecraft.core.Holder;
//import net.minecraft.block.BlockState;
//import net.minecraft.registry.Registries;
////import net.minecraft.core.registries.Registries;
////import net.minecraft.ResourceLocation;
////import net.minecraft.server.level.ServerLevel;
////import net.minecraft.util.RandomSource;
////import net.minecraft.world.level.block.grower.AbstractTreeGrower;
////import net.minecraft.world.level.block.state.BlockState;
////import net.minecraft.world.level.chunk.ChunkGenerator;
////import net.minecraft.world.levelgen.feature.ConfiguredFeature;
//import net.minecraft.registry.Registry;
//import net.minecraft.registry.RegistryKey;
//import net.minecraft.registry.RegistryKeys;
//import net.minecraft.server.world.ServerWorld;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.random.Random;
//import net.minecraft.world.gen.chunk.ChunkGenerator;
//import net.minecraft.world.gen.feature.ConfiguredFeature;
//import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
//import net.minecraft.world.gen.feature.TreeFeature;
//import org.jetbrains.annotations.Nullable;
//
//public abstract class ModTreeGrower extends TreeConfiguredFeatures {
//    @Nullable
////    @Override
//    protected RegistryKey<ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean hasFlowers) {
//        return null;
//    }
//
//    protected abstract Identifier getConfiguredFeatureLocation();
//
//    @Override
//    public boolean generate(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {
//        Optional<Holder.Reference<ConfiguredFeature<?, ?>>> optional = world.getRegistryManager().getWrapperOrThrow(RegistryKeys.CONFIGURED_FEATURE).getClass(
//                RegistryKey.create(RegistryKeys.CONFIGURED_FEATURE, getConfiguredFeatureLocation()));
//        if (optional.isEmpty()) {
//            return false;
//        } else {
//            ConfiguredFeature<?, ?> configuredfeature = optional.get.value();
//            BlockState blockstate = world.getFluidState(pos).createLegacyBlock();
//            world.setBlockState(pos, blockstate, 4);
//            if (configuredfeature.generate(world, chunkGenerator, random, pos)) {
//                if (world.getBlockState(pos) == blockstate) {
//                    world.updateListeners(pos, state, blockstate, 2);
//                }
//
//                return true;
//            } else {
//                world.setBlockState(pos, state, 4);
//                return false;
//            }
//        }
//    }
//}