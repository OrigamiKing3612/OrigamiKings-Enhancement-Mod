package net.origamiking.mcmods.oem.blocks.entity;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.TrappedChestBlockEntity;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Util;
import net.origamiking.mcmods.oem.OemMain;
//import net.origamiking.mcmods.oem.blocks.entity.types.AcaciaChestBlockEntity;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;

import java.util.Set;

public class ModBlockEntityType<T extends BlockEntity>{

//    public static final BlockEntityType<ChestBlockEntity> ACACIA_CHEST = ModBlockEntityType.create("acacia_chest_entity", ModBlockEntityType.Builder.create(ChestBlockEntity::new, AcaciaWoodBlocks.ACACIA_CHEST));

//    public static final BlockEntityType<TrappedChestBlockEntity> TRAPPED_CHEST = ModBlockEntityType.create("trapped_chest", ModBlockEntityType.Builder.create(TrappedChestBlockEntity::new, Blocks.TRAPPED_CHEST));




    public static final class Builder<T extends BlockEntity> {
        private final BlockEntityType.BlockEntityFactory<? extends T> factory;
        final Set<Block> blocks;

        private Builder(BlockEntityType.BlockEntityFactory<? extends T> factory, Set<Block> blocks) {
            this.factory = factory;
            this.blocks = blocks;
        }

        public static <T extends BlockEntity> ModBlockEntityType.Builder<T> create(BlockEntityType.BlockEntityFactory<? extends T> factory, Block ... blocks) {
            return new ModBlockEntityType.Builder<T>(factory, ImmutableSet.copyOf(blocks));
        }

        public BlockEntityType<T> build(Type<?> type) {
            return new BlockEntityType<T>(this.factory, this.blocks, type);
        }
    }
    private static <T extends BlockEntity> BlockEntityType<T> create(String id, ModBlockEntityType.Builder<T> builder) {
        if (builder.blocks.isEmpty()) {
            OemMain.LOGGER.warn("Block entity type {} requires at least one valid block to be defined!", (Object)id);
        }
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, id, builder.build(type));
    }
}
