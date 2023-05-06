//package net.origamiking.mcmods.oem.recipe;
//
//import net.minecraft.entity.ItemEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.inventory.SimpleInventory;
//import net.minecraft.item.ItemStack;
//import net.minecraft.recipe.*;
//import net.minecraft.registry.DynamicRegistryManager;
//import net.minecraft.registry.Registries;
//import net.minecraft.server.network.ServerPlayerEntity;
//import net.minecraft.util.Identifier;
//import net.minecraft.registry.Registry;
//import net.minecraft.world.World;
//import net.origamiking.mcmods.oem.OemMain;
//
//public record WoodcutterRecipe(Ingredient input, boolean replicate, ItemStack result, Identifier id) implements Recipe<CuttingRecipe> {
//
//    public static final Identifier ID = new Identifier(OemMain.MOD_ID,"woodcutting");
//
//    public boolean isValid() {
//        return replicate || !result.isEmpty();
//    }
//
////    public void triggerCriterion(ItemEntity itemEntity, World world) {
////        if (itemEntity.getThrower() != null) {
////            PlayerEntity player = world.getPlayerByUuid(itemEntity.getThrower());
////            if (player != null) {
////                ModCriteria.VOID_CRAFT_SUCCESS.trigger((ServerPlayerEntity) player, id, itemEntity.getStack().getCount());
////            }
////        }
////    }
//
////    public void activate(World world, ItemEntity itemEntity) {
////        if (isValid()) {
////            World target = position.dropItems(world, itemEntity, replicate, result, id);
////            if (target != null) {
////                triggerCriterion(itemEntity, target);
////            }
////        }
////    }
//
////    @Override
////    public boolean matches(SimpleInventory inventory, World world) {
////        return inventory.size() >= 1 && input.test(inventory.getStack(0));
////    }
////
////    @Override
////    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
////        return null;
////    }
//
////    @Override
////    public ItemStack craft(SimpleInventory inventory) {
////        return null;
////    }
//
//    @Override
//    public boolean matches(CuttingRecipe inventory, World world) {
//        return false;
//    }
//
//    @Override
//    public ItemStack craft(CuttingRecipe inventory, DynamicRegistryManager registryManager) {
//        return null;
//    }
//
//    @Override
//    public boolean fits(int width, int height) {
//        return false;
//    }
//
//    @Override
//    public ItemStack getOutput(DynamicRegistryManager registryManager) {
//        return null;
//    }
//
////    @Override
////    public ItemStack getOutput() {
////        return result;
////    }
//
//    @Override
//    public Identifier getId() {
//        return id;
//    }
//
//    @Override
//    public RecipeType<?> getType() {
//        return Type.INSTANCE;
//    }
//
//    @Override
//    public RecipeSerializer<?> getSerializer() {
//        return WoodcutterRecipeSerializer.INSTANCE;
//    }
//
//    public static class Type implements RecipeType<WoodcutterRecipe> {
//        public static final Type INSTANCE = new Type();
//    }
//
//    public static void register() {
//        Registry.register(Registries.RECIPE_TYPE, ID, Type.INSTANCE);
//        Registry.register(Registries.RECIPE_SERIALIZER, ID, WoodcutterRecipeSerializer.INSTANCE);
//    }
//}