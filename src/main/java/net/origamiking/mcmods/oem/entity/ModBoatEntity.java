//package net.origamiking.mcmods.oem.entity;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.Blocks;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.VariantHolder;
//import net.minecraft.entity.vehicle.BoatEntity;
//import net.minecraft.nbt.NbtCompound;
//import net.minecraft.util.StringIdentifiable;
//import net.minecraft.util.function.ValueLists;
//import net.minecraft.world.World;
//import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
//
//import java.util.function.IntFunction;
//
//public class ModBoatEntity extends Entity /*implements VariantHolder<Type>*/
//
//    public ModBoatEntity(EntityType<?> type, World world) {
//        super(type, world);
//    }
//
//    public ModBoatEntity(World world, double x, double y, double z) {
//        super(world, x, y, z);
//    }
//
//    @Override
//    protected void initDataTracker() {
//
//    }
//
//    @Override
//    protected void readCustomDataFromNbt(NbtCompound nbt) {
//
//    }
//
//    @Override
//    protected void writeCustomDataToNbt(NbtCompound nbt) {
//
//    }
//
//    @Override
//    public void setVariant(Type variant) {
//
//    }
//
//    @Override
//    public Type getVariant() {
//        return null;
//    }
//
//
//    public static enum Type implements StringIdentifiable {
////        OAK(Blocks.OAK_PLANKS, "oak"),
////        SPRUCE(Blocks.SPRUCE_PLANKS, "spruce"),
////        BIRCH(Blocks.BIRCH_PLANKS, "birch"),
////        JUNGLE(Blocks.JUNGLE_PLANKS, "jungle"),
////        ACACIA(Blocks.ACACIA_PLANKS, "acacia"),
////        DARK_OAK(Blocks.DARK_OAK_PLANKS, "dark_oak"),
////        MANGROVE(Blocks.MANGROVE_PLANKS, "mangrove"),
////        BAMBOO(Blocks.BAMBOO_PLANKS, "bamboo");
//        AZALEA(AzaleaWoodBlocks.AZALEA_PLANKS, "azalea");
//
//        private final String name;
//        private final Block baseBlock;
//        public static final StringIdentifiable.Codec<BoatEntity.Type> CODEC;
////        private static final IntFunction<BoatEntity.Type> BY_ID;
//
//        private Type(Block baseBlock, String name) {
//            this.name = name;
//            this.baseBlock = baseBlock;
//        }
//
//        @Override
//        public String asString() {
//            return this.name;
//        }
//
//        static {
//            CODEC = StringIdentifiable.createCodec(BoatEntity.Type::values);
////            BY_ID = ValueLists.createIdToValueFunction(Enum::ordinal, BoatEntity.Type.values(), ValueLists.OutOfBoundsHandling.ZERO);
//        }
//    }
//}
