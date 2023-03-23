//package net.origamiking.mcmods.oem.azalea;
//
////import net.minecraft.core.BlockPos;
////import net.minecraft.core.Holder;
////import net.minecraft.core.registries.Registries;
////import net.minecraft.resources.ResourceKey;
////import net.minecraft.resources.ResourceLocation;
////import net.minecraft.server.level.ServerLevel;
////import net.minecraft.util.RandomSource;
////import net.minecraft.world.level.block.grower.AbstractTreeGrower;
////import net.minecraft.world.level.block.state.BlockState;
////import net.minecraft.world.level.chunk.ChunkGenerator;
////import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.block.BlockState;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.random.Random;
//import net.minecraft.world.gen.chunk.ChunkGenerator;
//import net.minecraft.world.gen.feature.ConfiguredFeature;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.Optional;
//
//public abstract class ModTreeGrower extends AbstractTreeGrower {
//    @Nullable
//    @Override
//    protected Registry<ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean hasFlowers) {
//        return null;
//    }
//
//    protected abstract Identifier getConfiguredFeatureLocation();
//
//    @Override
//    public boolean growTree(ServerLevel level, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, java.util.Random random) {
//        Optional<Holder.Reference<ConfiguredFeature<?, ?>>> optional = level.registryAccess().registryOrThrow(Registries.FEATURE).getHolder(
//                Registry.register(Registries.FEATURE, getConfiguredFeatureLocation()));
//        if (optional.isEmpty()) {
//            return false;
//        } else {
//            ConfiguredFeature<?, ?> configuredfeature = optional.get().value();
//            BlockState blockstate = level.getFluidState(pos).createLegacyBlock();
//            level.setBlock(pos, blockstate, 4);
//            if (configuredfeature.place(level, chunkGenerator, random, pos)) {
//                if (level.getBlockState(pos) == blockstate) {
//                    level.sendBlockUpdated(pos, state, blockstate, 2);
//                }
//
//                return true;
//            } else {
//                level.setBlock(pos, state, 4);
//                return false;
//            }
//        }
//    }
//}
