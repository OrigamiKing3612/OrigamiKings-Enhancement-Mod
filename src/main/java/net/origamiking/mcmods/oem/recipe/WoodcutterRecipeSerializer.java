//package net.origamiking.mcmods.oem.recipe;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonSyntaxException;
//import net.minecraft.item.ItemStack;
//import net.minecraft.network.PacketByteBuf;
//import net.minecraft.recipe.Ingredient;
//import net.minecraft.recipe.RecipeSerializer;
//import net.minecraft.recipe.ShapedRecipe;
//import net.minecraft.util.Identifier;
//
//public class WoodcutterRecipeSerializer implements RecipeSerializer<WoodcutterRecipe> {
//
//    public static class JsonFormat {
//        JsonObject input;
//        float x;
//        float z;
//        float radius;
//        String world;
//        boolean absolute;
//        boolean replicate;
//        JsonObject result;
//    }
//
//    public static final WoodcutterRecipeSerializer INSTANCE = new WoodcutterRecipeSerializer();
//
//    @Override
//    public WoodcutterRecipe read(Identifier id, JsonObject json) {
//        JsonFormat recipeJson = new Gson().fromJson(json, JsonFormat.class);
//        if (recipeJson.input == null) {
//            throw new JsonSyntaxException("Missing field 'input'");
//        }
//        if (recipeJson.result == null && !recipeJson.replicate) {
//            throw new JsonSyntaxException("Missing field 'result'");
//        }
//        Ingredient input = Ingredient.fromJson(recipeJson.input);
////        PositionBuilder builder = new PositionBuilder()
////                .coordinates(recipeJson.x, recipeJson.z)
////                .absolute(recipeJson.absolute);
////        if (recipeJson.world != null) {
////            builder = builder.worldKey(recipeJson.world);
////        }
////        if (recipeJson.radius > 0.0f) {
////            builder = builder.radius(recipeJson.radius);
////        }
//        ItemStack result = !recipeJson.replicate ? ShapedRecipe.outputFromJson(recipeJson.result) : null;
//        return new WoodcutterRecipe(input/*, builder.build()*/, recipeJson.replicate, result, id);
//    }
//
//    @Override
//    public WoodcutterRecipe read(Identifier id, PacketByteBuf buf) {
//        Ingredient input = Ingredient.fromPacket(buf);
////        Position position = Position.read(buf);
//        boolean replicate = buf.readBoolean();
//        ItemStack result = !replicate ? buf.readItemStack() : null;
//        return new WoodcutterRecipe(input/*, position*/, replicate, result, id);
//    }
//
//    @Override
//    public void write(PacketByteBuf buf, WoodcutterRecipe recipe) {
//        recipe.input().write(buf);
////        recipe/*.position()*/.write(buf);
//        buf.writeBoolean(recipe.replicate());
//        if (recipe.result() != null) {
//            buf.writeItemStack(recipe.result());
//        }
//    }
//}
