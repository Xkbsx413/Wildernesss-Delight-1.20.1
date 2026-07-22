package com.xkbsx.wildernessdelight.datagen;

import com.xkbsx.wildernessdelight.block.ModBlock;
import com.xkbsx.wildernessdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {super(output);}

    //public static final List<ItemConvertible> CHINESE_TOON_SPROUT=List.of(ModItems.CHINESE_TOON_SPROUT);

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, 1)//无序合成
                .input(ModItems.ICE_FLOWERS)
                .criterion("has_ice_flowers", conditionsFromItem(ModItems.ICE_FLOWERS))
                .offerTo(consumer);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.CHINESE_TOON_SAPLING_ITEM, 1)//有序合成
                .pattern("##")
                .pattern("##")
                .input('#',ModItems.CHINESE_TOON_SPROUT)
                .criterion("has_chinese_toon_sprout",conditionsFromItem(ModItems.CHINESE_TOON_SPROUT))
                .offerTo(consumer);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlock.TREE_OF_HEAVEN_SAPLING_ITEM,1)
                .pattern("##")
                .pattern("##")
                .input('#',ModItems.TREE_OF_HEAVEN)
                .criterion("has_tree_of_heaven",conditionsFromItem(ModItems.TREE_OF_HEAVEN))
                .offerTo(consumer);
        offerSmelting(consumer,List.of(ModItems.BRACKEN_FERN_SHOOT),RecipeCategory.FOOD,
                ModItems.COOKED_BRACKEN_FERN_SHOOT,0.35f,200,"has_bracken_fern_shoot");
        offerSmelting(consumer,List.of(ModItems.REED_SHOOT),RecipeCategory.FOOD,
                ModItems.COOKED_REED_SHOOT,0.35f,200,"has_reed_shoot");
        offerSmelting(consumer,List.of(ModItems.PURSLANE),RecipeCategory.FOOD,
                ModItems.COOKED_PURSLANE,0.35f,200,"has_purslane");
        offerSmelting(consumer,List.of(ModItems.SHEPHERD_PURSE),RecipeCategory.FOOD,
                ModItems.COOKED_SHEPHERD_PURSE,0.35f,200,"has_shepherd_purse");
        offerSmelting(consumer,List.of(ModItems.WATER_DROPWORT),RecipeCategory.FOOD,
                ModItems.COOKED_WATER_DROPWORT,0.35f,200,"has_water_dropwort");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.BRACKEN_FERN_SHOOT), RecipeCategory.FOOD, ModItems.COOKED_BRACKEN_FERN_SHOOT, 0.35f, 100)
                .criterion("has_bracken_fern_shoot", conditionsFromItem(ModItems.BRACKEN_FERN_SHOOT))
                .offerTo(consumer, "cooked_bracken_fern_shoot_from_smoking");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.REED_SHOOT), RecipeCategory.FOOD, ModItems.COOKED_REED_SHOOT, 0.35f, 100)
                .criterion("has_reed_shoot", conditionsFromItem(ModItems.REED_SHOOT))
                .offerTo(consumer, "cooked_reed_shoot_from_smoking");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.PURSLANE), RecipeCategory.FOOD, ModItems.COOKED_PURSLANE, 0.35f, 100)
                .criterion("has_purslane", conditionsFromItem(ModItems.PURSLANE))
                .offerTo(consumer, "cooked_purslane_from_smoking");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.SHEPHERD_PURSE), RecipeCategory.FOOD, ModItems.COOKED_SHEPHERD_PURSE, 0.35f, 100)
                .criterion("has_shepherd_purse", conditionsFromItem(ModItems.SHEPHERD_PURSE))
                .offerTo(consumer, "cooked_shepherd_purse_from_smoking");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.WATER_DROPWORT), RecipeCategory.FOOD, ModItems.COOKED_WATER_DROPWORT, 0.35f, 100)
                .criterion("has_water_dropwort", conditionsFromItem(ModItems.WATER_DROPWORT))
                .offerTo(consumer, "cooked_water_dropwort_from_smoking");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.BRACKEN_FERN_SHOOT), RecipeCategory.FOOD, ModItems.COOKED_BRACKEN_FERN_SHOOT, 0.35f, 600)
                .criterion("has_bracken_fern_shoot", conditionsFromItem(ModItems.BRACKEN_FERN_SHOOT))
                .offerTo(consumer, "cooked_bracken_fern_shoot_from_campfire");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.REED_SHOOT), RecipeCategory.FOOD, ModItems.COOKED_REED_SHOOT, 0.35f, 600)
                .criterion("has_reed_shoot", conditionsFromItem(ModItems.REED_SHOOT))
                .offerTo(consumer, "cooked_reed_shoot_from_campfire");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.PURSLANE), RecipeCategory.FOOD, ModItems.COOKED_PURSLANE, 0.35f, 600)
                .criterion("has_purslane", conditionsFromItem(ModItems.PURSLANE))
                .offerTo(consumer, "cooked_purslane_from_campfire");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.SHEPHERD_PURSE), RecipeCategory.FOOD, ModItems.COOKED_SHEPHERD_PURSE, 0.35f, 600)
                .criterion("has_shepherd_purse", conditionsFromItem(ModItems.SHEPHERD_PURSE))
                .offerTo(consumer, "cooked_shepherd_purse_from_campfire");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.WATER_DROPWORT), RecipeCategory.FOOD, ModItems.COOKED_WATER_DROPWORT, 0.35f, 600)
                .criterion("has_water_dropwort", conditionsFromItem(ModItems.WATER_DROPWORT))
                .offerTo(consumer, "cooked_water_dropwort_from_campfire");

    }
}
