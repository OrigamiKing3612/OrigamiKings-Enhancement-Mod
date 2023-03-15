//package net.origamiking.mcmods.oem.mixin;
//
////import net.minecraft.core.BlockPos;
////import net.minecraft.core.Holder;
////import net.minecraft.data.worldgen.features.TreeFeatures;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.registry.RegistryKey;
////import net.minecraft.util.RandomSource;
////import net.minecraft.world.gen.blockpredicate.grower.AbstractTreeGrower;
//import net.minecraft.server.world.ServerWorld;
//import net.minecraft.util.collection.DataPool;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.intprovider.ConstantIntProvider;
//import net.minecraft.util.math.intprovider.UniformIntProvider;
//import net.minecraft.util.math.random.Random;
//import net.minecraft.world.gen.chunk.ChunkGenerator;
//import net.minecraft.world.gen.feature.*;
////import net.minecraft.world.level.block.grower.AzaleaTreeGrower;
////import net.minecraft.world.level.block.state.BlockState;
////import net.minecraft.world.level.chunk.ChunkGenerator;
////import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.world.gen.stateprovider.BlockStateProvider;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
////@Mixin(TreeConfiguredFeatures.class)
////public class AzaleaTreeMixin extends TreeConfiguredFeatures {
////    @Inject(method = "Lnet/minecraft/world/gen/feature/", at = @At(""))
////    private void injectMethod(METHOD ARGS, CallbackInfo info) {
////        ConfiguredFeatures.register(featureRegisterable, MOD_AZALEA_TREE, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(Blocks.OAK_LOG), new BendingTrunkPlacer(4, 2, 0, 3,UniformIntProvider.create(1, 2)), new WeightedBlockStateProvider(DataPool.builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)), new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());
////
////    }
//
//
////    public RegistryKey<ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean hasFlowers) {
////            return TreeConfiguredFeatures.AZALEA_TREE;
////    }
//
////    @Override
////    public boolean growTree(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {
////            ModAzaleaTreeGrower grower = new ModAzaleaTreeGrower();
////            return grower.growTree(world, chunkGenerator, pos, state, random);
////    }
////}