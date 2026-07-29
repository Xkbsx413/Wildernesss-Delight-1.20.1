package com.xkbsx.wildernessdelight.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xkbsx.wildernessdelight.WildernesssDelight;
import com.xkbsx.wildernessdelight.block.ModBlock;
import com.xkbsx.wildernessdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

/**
 * 荒野乐事模组的配方数据生成器
 * Mod recipe data generator - automatically generates all recipe JSON files during datagen
 * 继承 FabricRecipeProvider，在数据生成阶段自动输出所有配方 JSON 到 generated 目录
 */
public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {super(output);}

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        // ═══════════ 无序合成 (Shapeless Crafting) ═══════════
        // 冰花 → 淡蓝色染料，用于将冰花合成为染料
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, 1)//无序合成
                .input(ModItems.ICE_FLOWERS)
                .criterion("has_ice_flowers", conditionsFromItem(ModItems.ICE_FLOWERS))
                .offerTo(consumer);

        // ═══════════ 有序合成 (Shaped Crafting) ═══════════
        // 香椿芽 2×2 → 香椿树苗方块
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.CHINESE_TOON_SAPLING_ITEM, 1)//有序合成
                .pattern("##")
                .pattern("##")
                .input('#',ModItems.CHINESE_TOON_SPROUT)
                .criterion("has_chinese_toon_sprout",conditionsFromItem(ModItems.CHINESE_TOON_SPROUT))
                .offerTo(consumer);
        // 臭椿 2×2 → 臭椿树苗方块
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlock.TREE_OF_HEAVEN_SAPLING_ITEM,1)
                .pattern("##")
                .pattern("##")
                .input('#',ModItems.TREE_OF_HEAVEN)
                .criterion("has_tree_of_heaven",conditionsFromItem(ModItems.TREE_OF_HEAVEN))
                .offerTo(consumer);

        // ═══════════ 熔炉烧炼 (Smelting) ═══════════
        // 5种野菜在熔炉中烤熟，经验 0.35，耗时 200 tick（10秒）
        // 括号参数: consumer, 输入列表, 配方分类, 输出物品, 经验值, 烧炼时间(tick), 解锁条件ID
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

        // ═══════════ 烟熏炉 (Smoking) ═══════════
        // 速度是熔炉的2倍（100 tick = 5秒），经验相同
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

        // ═══════════ 营火烹饪 (Campfire Cooking) ═══════════
        // 速度最慢（600 tick = 30秒），无需燃料，经验相同
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

        // ═══════════════════════════════════════════════════════════════════════════════
        // 🥘 锅料理 — 单菜类（1种野菜 + 配菜）
        // ═══════════════════════════════════════════════════════════════════════════════

        // 1. 香椿炒蛋（饥饿5/饱和0.50）
        offerPotCooking(consumer, "chinese_toon_scrambled_eggs",
                List.of(IngredientEntry.of(ModItems.CHINESE_TOON_SPROUT), IngredientEntry.of(Items.EGG),
                        IngredientEntry.of(ModItems.WILD_GARLIC)),
                Items.BOWL, ModItems.CHINESE_TOON_SCRAMBLED_EGGS, 2);
        // 2. 荠菜饺子（饥饿6/饱和0.55）
        offerPotCooking(consumer, "shepherd_purse_dumplings",
                List.of(IngredientEntry.of(ModItems.SHEPHERD_PURSE), IngredientEntry.of(fromId("farm_and_charm:dough")),
                        IngredientEntry.of(ModItemTagProvider.MEAT)),
                Items.BOWL, ModItems.SHEPHERD_PURSE_DUMPLINGS, 3);
        // 3. 凉拌折耳根（饥饿6/饱和0.55）x2
        offerCraftingBowl(consumer, "houttuynia_salad",
                List.of(IngredientEntry.of(ModItems.HOUTTUYNIA), IngredientEntry.of(fromId("farm_and_charm:tomato")),
                        IngredientEntry.of(ModItems.WILD_GARLIC)),
                ModItems.HOUTTUYNIA_SALAD, 2);
        // 4. 马齿苋沙拉（饥饿6/饱和0.55）x2
        offerCraftingBowl(consumer, "purslane_mozzarella_salad",
                List.of(IngredientEntry.of(ModItems.PURSLANE), IngredientEntry.of(fromId("farm_and_charm:lettuce")),
                        IngredientEntry.of(fromId("candlelight:mozzarella"))),
                ModItems.PURSLANE_MOZZARELLA_SALAD, 2);
        // 5. 蕨菜炒培根（饥饿5/饱和0.50）
        offerRoaster(consumer, "bracken_fern_with_bacon",
                List.of(IngredientEntry.of(ModItems.BRACKEN_FERN_SHOOT), IngredientEntry.of(fromId("farm_and_charm:bacon")),
                        IngredientEntry.of(fromId("candlelight:mozzarella")), IngredientEntry.of(ModItems.WILD_GARLIC)),
                Items.BOWL, ModItems.BRACKEN_FERN_WITH_BACON, 1);
        // 6. 芦蒿玉米粒（饥饿6/饱和0.55）
        offerRoaster(consumer, "mugwort_with_corn",
                List.of(IngredientEntry.of(ModItems.MUGWORT_SPROUT), IngredientEntry.of(fromId("farm_and_charm:kernels")),
                        IngredientEntry.of(fromId("farm_and_charm:butter"))),
                Items.BOWL, ModItems.MUGWORT_WITH_CORN, 1);
        // 7. 水芹洋葱沙拉（饥饿6/饱和0.55）x2
        offerCraftingBowl(consumer, "water_dropwort_onion_salad",
                List.of(IngredientEntry.of(ModItems.WATER_DROPWORT), IngredientEntry.of(fromId("farm_and_charm:onion")),
                        IngredientEntry.of(fromId("candlelight:mozzarella"))),
                ModItems.WATER_DROPWORT_ONION_SALAD, 2);
        // 8. 蒲公英番茄汤（饥饿7/饱和0.55）
        offerPotCooking(consumer, "dandelion_tomato_egg_soup",
                List.of(IngredientEntry.of(ModItems.CROP_DANDELION), IngredientEntry.of(fromId("farm_and_charm:tomato")),
                        IngredientEntry.of(fromId("farm_and_charm:tomato")), IngredientEntry.of(Items.EGG),
                        IngredientEntry.of(ModItemTagProvider.POTIONS),
                        IngredientEntry.of(fromId("candlelight:mozzarella"))),
                Items.BOWL, ModItems.DANDELION_TOMATO_EGG_SOUP, 5);
        // 9. 芦苇笋鸡丁（饥饿6/饱和0.55）
        offerRoaster(consumer, "reed_shoot_chicken_lettuce",
                List.of(IngredientEntry.of(ModItems.REED_SHOOT), IngredientEntry.of(fromId("farm_and_charm:chicken_parts")),
                        IngredientEntry.of(fromId("farm_and_charm:lettuce"))),
                Items.BOWL, ModItems.REED_SHOOT_CHICKEN_LETTUCE, 3);
        // 10. 野葱玉米烙（饥饿6/饱和0.55）
        offerPotCooking(consumer, "wild_garlic_corn_pancake",
                List.of(IngredientEntry.of(ModItems.WILD_GARLIC), IngredientEntry.of(fromId("farm_and_charm:kernels")),
                        IngredientEntry.of(Items.WHEAT)),
                Items.BOWL, ModItems.WILD_GARLIC_CORN_PANCAKE, 3);
        // 11. 飞蓬芝士焗（饥饿6/饱和0.55）
        offerStove(consumer, "horseweed_mozzarella_honey",
                List.of(IngredientEntry.of(ModItems.HORSEWEED), IngredientEntry.of(fromId("candlelight:mozzarella")),
                        IngredientEntry.of(Items.HONEY_BOTTLE)),
                Items.BOWL, ModItems.HORSEWEED_MOZZARELLA_HONEY, 1);

        // ═══════════════════════════════════════════════════════════════════════════════
        // 🥘 锅料理 — 混合类（2-3种野菜）
        // ═══════════════════════════════════════════════════════════════════════════════

        // 12. 山野炒时蔬（饥饿6/饱和0.55）
        offerPotCooking(consumer, "mixed_wild_stir_fry",
                List.of(IngredientEntry.of(ModItems.BRACKEN_FERN_SHOOT), IngredientEntry.of(ModItems.MUGWORT_SPROUT),
                        IngredientEntry.of(ModItems.WATER_DROPWORT)),
                Items.BOWL, ModItems.MIXED_WILD_STIR_FRY, 1);
        // 13. 凉拌双蔬（饥饿6/饱和0.55）x2
        offerCraftingBowl(consumer, "double_wild_veg_salad",
                List.of(IngredientEntry.of(ModItems.HOUTTUYNIA), IngredientEntry.of(ModItems.CROP_DANDELION),
                        IngredientEntry.of(fromId("farm_and_charm:onion"))),
                ModItems.DOUBLE_WILD_VEG_SALAD, 2);
        // 14. 野菜薄饼（饥饿6/饱和0.55）
        offerStove(consumer, "wild_veg_pancake",
                List.of(IngredientEntry.of(ModItemTagProvider.WILD_VEGETABLES), IngredientEntry.of(ModItems.WILD_GARLIC),
                        IngredientEntry.of(fromId("farm_and_charm:dough"))),
                Items.BOWL, ModItems.WILD_VEG_PANCAKE, 3);
        // 15. 三鲜沙拉（饥饿7/饱和0.60）x3
        offerCraftingBowl(consumer, "three_fresh_salad",
                List.of(IngredientEntry.of(ModItems.PURSLANE), IngredientEntry.of(ModItems.REED_SHOOT),
                        IngredientEntry.of(fromId("farm_and_charm:lettuce")),
                        IngredientEntry.of(fromId("candlelight:mozzarella"))),
                ModItems.THREE_FRESH_SALAD, 3);
        // 16. 野菜浓汤（饥饿7/饱和0.65）
        offerPotCooking(consumer, "wild_vegetable_soup",
                List.of(IngredientEntry.of(ModItemTagProvider.WILD_VEGETABLES),
                        IngredientEntry.of(ModItemTagProvider.WILD_VEGETABLES),
                        IngredientEntry.of(ModItemTagProvider.WILD_VEGETABLES)),
                Items.BOWL, ModItems.WILD_VEGETABLE_SOUP, 1);

        // ═══════════════════════════════════════════════════════════════════════════════
        // 🔥 炉灶料理（stove）— 飞蓬芝士焗/野菜薄饼/薄荷羊肉/鼠曲草青团 已并入各自类别
        // ═══════════════════════════════════════════════════════════════════════════════

        // 17. 薄荷羊肉（饥饿8/饱和0.70）
        offerStove(consumer, "mint_lamb_ham",
                List.of(IngredientEntry.of(ModItems.MINT), IngredientEntry.of(fromId("farm_and_charm:lamb_ham")),
                        IngredientEntry.of(fromId("farm_and_charm:butter"))),
                Items.BOWL, ModItems.MINT_LAMB_HAM, 1);

        // ═══════════════════════════════════════════════════════════════════════════════
        // 🧃 饮品（pot_cooking）
        // ═══════════════════════════════════════════════════════════════════════════════

        // 18. 薄荷茶（饥饿5/饱和0.45）
        offerPotCooking(consumer, "mint_tea",
                List.of(IngredientEntry.of(ModItems.MINT), IngredientEntry.of(ModItems.MINT),
                        IngredientEntry.of(ModItemTagProvider.POTIONS)),
                Items.GLASS_BOTTLE, ModItems.MINT_TEA, 1);
        // 19. 蒲公英根茶（饥饿4/饱和0.45）
        offerPotCooking(consumer, "dandelion_root_tea",
                List.of(IngredientEntry.of(ModItems.CROP_DANDELION),IngredientEntry.of(Items.SUGAR),
                        IngredientEntry.of(ModItemTagProvider.POTIONS)),
                Items.GLASS_BOTTLE, ModItems.DANDELION_ROOT_TEA, 1);
        // 20. 寒霜花汤（饥饿4/饱和0.45）
        offerPotCooking(consumer, "ice_flower_mint_soup",
                List.of(IngredientEntry.of(ModItems.ICE_FLOWERS), IngredientEntry.of(ModItems.MINT),
                        IngredientEntry.of(Items.SUGAR)),
                Items.GLASS_BOTTLE, ModItems.ICE_FLOWER_MINT_SOUP, 1);

        // ═══════════════════════════════════════════════════════════════════════════════
        // 🍡 甜点（pot_cooking）
        // ═══════════════════════════════════════════════════════════════════════════════

        // 21. 鼠曲草青团（饥饿6/饱和0.55）
        offerStove(consumer, "cudweed_rice_dumpling",
                List.of(IngredientEntry.of(ModItems.CUDWEED), IngredientEntry.of(fromId("farm_and_charm:dough")),
                        IngredientEntry.of(Items.SUGAR)),
                Items.BOWL, ModItems.CUDWEED_RICE_DUMPLING, 2);

        // ═══════════════════════════════════════════════════════════════════════════════
        // ⚒️ 合成台 — 无序合成（shapeless）
        // ═══════════════════════════════════════════════════════════════════════════════

        // 23. 冰花水果沙拉（饥饿6/饱和0.55）x2
        offerCraftingBowl(consumer, "ice_flower_fruit_salad",
                List.of(IngredientEntry.of(ModItems.ICE_FLOWERS), IngredientEntry.of(fromId("farm_and_charm:lettuce")),
                        IngredientEntry.of(ModItemTagProvider.FRUITS)),
                ModItems.ICE_FLOWER_FRUIT_SALAD, 2);

        // ═══════════════════════════════════════════════════════════════════════════════
        // 🌿 新食材料理
        // ═══════════════════════════════════════════════════════════════════════════════

        // 22. 百草灵膳（饥饿15/饱和0.80）
        offerPotCooking(consumer, "hundred_herbs_delicacy",
                List.of(IngredientEntry.of(ModItems.GINSENG), IngredientEntry.of(ModItems.LINGZHI),
                        IngredientEntry.of(ModItems.ICE_FLOWERS), IngredientEntry.of(ModItemTagProvider.MEAT),
                        IngredientEntry.of(ModItemTagProvider.WILD_VEGETABLES), IngredientEntry.of(fromId("farm_and_charm:butter"))),
                Items.BOWL, ModItems.HUNDRED_HERBS_DELICACY, 1);

        // 人参汤（饥饿9/饱和0.55）
        offerRoaster(consumer, "ginseng_soup",
                List.of(IngredientEntry.of(ModItems.GINSENG), IngredientEntry.of(Items.CARROT),
                        IngredientEntry.of(Items.POTATO), IngredientEntry.of(fromId("farm_and_charm:tomato"))),
                Items.BOWL, ModItems.GINSENG_SOUP, 2);
        // 猴头菇饼干（饥饿5/饱和0.40）
        offerStove(consumer, "hericium_cookie",
                List.of(IngredientEntry.of(ModItems.HERICIUM), IngredientEntry.of(fromId("farm_and_charm:dough")),
                        IngredientEntry.of(Items.SUGAR)),
                Items.BOWL, ModItems.HERICIUM_COOKIE, 4);
        // 灵芝鸡汤（饥饿11/饱和0.60）
        offerRoaster(consumer, "lingzhi_chicken_soup",
                List.of(IngredientEntry.of(ModItems.LINGZHI), IngredientEntry.of(Items.CHICKEN),
                        IngredientEntry.of(fromId("farm_and_charm:lettuce")), IngredientEntry.of(ModItems.WILD_GARLIC)),
                Items.BOWL, ModItems.LINGZHI_CHICKEN_SOUP, 1);

        // ═══════════════ 锻造台 (Smithing Transform) ═══════════════
        // 原野旗帜 × 1 + 下界合金升级模板 + 下界合金锭 → 原野旗帜 × 2
        offerSmithingTransform(consumer, "wilderness_banner_smithing",
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,
                ModBlock.WILDERNESS_BANNER,
                Items.NETHERITE_INGOT,
                ModBlock.WILDERNESS_BANNER, 2);
    }

    // ═══════════════════════════════════════════════════════════════
    // IngredientEntry：表示配方原料，可以是一个具体物品或一个 tag 分组
    //   IngredientEntry.of(item)  → 输出 {"item": "mod:item_id"}
    //   IngredientEntry.of(tag)   → 输出 {"tag": "mod:tag_name"}
    // ═══════════════════════════════════════════════════════════════
    private record IngredientEntry(boolean isTag, String id) {
        static IngredientEntry of(ItemConvertible item) {
            return new IngredientEntry(false, Registries.ITEM.getId(item.asItem()).toString());
        }
        static IngredientEntry of(TagKey<Item> tag) {
            return new IngredientEntry(true, tag.id().toString());
        }
    }

    // 通过物品 ID 字符串获取 Item，用于引用外部模组（farm_and_charm / candlelight 等）的物品
    // 用法: fromId("farm_and_charm:onion")  → 返回洋葱的 Item 实例（未加载时返回默认值 AIR）
    private static Item fromId(String id) {
        return Registries.ITEM.get(new Identifier(id));
    }

    // ═══════════════════════════════════════════════════════════════
    // 底层通用方法：三个烹饪设备共用同一套 JSON 结构，仅 type 和路径不同
    //  recipeType: 配方类型标识（pot_cooking / roaster / stove）
    // ═══════════════════════════════════════════════════════════════
    private static void offerFarmCharmRecipe(Consumer<RecipeJsonProvider> consumer,
                                              String recipeType, String name,
                                              List<IngredientEntry> inputs,
                                              ItemConvertible container,
                                              ItemConvertible result, int count) {
        // 输出路径: data/farm_and_charm/recipes/<recipeType>/<name>.json
        Identifier recipeId = new Identifier("farm_and_charm", recipeType + "/" + name);

        consumer.accept(new RecipeJsonProvider() {
            @Override
            public void serialize(JsonObject json) {
                // 配方类型，如 farm_and_charm:pot_cooking / farm_and_charm:roaster 等
                json.addProperty("type", "farm_and_charm:" + recipeType);

                JsonArray ingredients = new JsonArray();
                for (IngredientEntry input : inputs) {
                    JsonObject obj = new JsonObject();
                    if (input.isTag())
                        obj.addProperty("tag", input.id());
                    else
                        obj.addProperty("item", input.id());
                    ingredients.add(obj);
                }
                json.add("ingredients", ingredients);

                JsonObject containerObj = new JsonObject();
                containerObj.addProperty("item", Registries.ITEM.getId(container.asItem()).toString());
                json.add("container", containerObj);

                JsonObject resultObj = new JsonObject();
                resultObj.addProperty("item", Registries.ITEM.getId(result.asItem()).toString());
                resultObj.addProperty("count", count);
                json.add("result", resultObj);
            }

            @Override
            public Identifier getRecipeId() {
                return recipeId;
            }

            @Override
            // 从注册表获取对应的 RecipeSerializer
            public RecipeSerializer<?> getSerializer() {
                return Registries.RECIPE_SERIALIZER.get(new Identifier("farm_and_charm", recipeType));
            }

            @Override
            public @Nullable JsonObject toAdvancementJson() {
                return null;
            }

            @Override
            public Identifier getAdvancementId() {
                return null;
            }
        });
    }

    // 生成锅（Cooking Pot / Large Cooking Pot）配方
    // 输出到 data/farm_and_charm/recipes/pot_cooking/   type: farm_and_charm:pot_cooking
    private static void offerPotCooking(Consumer<RecipeJsonProvider> consumer, String name,
                                         List<IngredientEntry> inputs, ItemConvertible container,
                                         ItemConvertible result, int count) {
        offerFarmCharmRecipe(consumer, "pot_cooking", name, inputs, container, result, count);
    }

    // 生成烤炉（Roaster）配方
    // 输出到 data/farm_and_charm/recipes/roaster/      type: farm_and_charm:roaster
    private static void offerRoaster(Consumer<RecipeJsonProvider> consumer, String name,
                                      List<IngredientEntry> inputs, ItemConvertible container,
                                      ItemConvertible result, int count) {
        offerFarmCharmRecipe(consumer, "roaster", name, inputs, container, result, count);
    }

    // 生成炉灶（Stove）配方
    // 输出到 data/farm_and_charm/recipes/stove/        type: farm_and_charm:stove
    // 注意：stove 的 JSON 格式与 pot_cooking/roaster 不同——使用扁平 item/count，无 container 字段，有 experience
    private static void offerStove(Consumer<RecipeJsonProvider> consumer, String name,
                                     List<IngredientEntry> inputs, ItemConvertible container,
                                     ItemConvertible result, int count) {
        Identifier recipeId = new Identifier("farm_and_charm", "stove/" + name);

        consumer.accept(new RecipeJsonProvider() {
            @Override
            public void serialize(JsonObject json) {
                json.addProperty("type", "farm_and_charm:stove");

                JsonArray ingredients = new JsonArray();
                for (IngredientEntry input : inputs) {
                    JsonObject obj = new JsonObject();
                    if (input.isTag())
                        obj.addProperty("tag", input.id());
                    else
                        obj.addProperty("item", input.id());
                    ingredients.add(obj);
                }
                json.add("ingredients", ingredients);

                json.addProperty("item", Registries.ITEM.getId(result.asItem()).toString());
                json.addProperty("count", count);
                json.addProperty("experience", 0.35);
            }

            @Override
            public Identifier getRecipeId() {
                return recipeId;
            }

            @Override
            public RecipeSerializer<?> getSerializer() {
                return Registries.RECIPE_SERIALIZER.get(new Identifier("farm_and_charm", "stove"));
            }

            @Override
            public @Nullable JsonObject toAdvancementJson() {
                return null;
            }

            @Override
            public Identifier getAdvancementId() {
                return null;
            }
        });
    }

    // ═══════════════════════════════════════════════════════════════
    // 搅拌碗 (Crafting Bowl) 配方
    // 输出到 data/farm_and_charm/recipes/crafting_bowl/   type: farm_and_charm:crafting_bowl
    // ═══════════════════════════════════════════════════════════════
    private static void offerCraftingBowl(Consumer<RecipeJsonProvider> consumer, String name,
                                           List<IngredientEntry> inputs,
                                           ItemConvertible result, int count) {
        Identifier recipeId = new Identifier("farm_and_charm", "crafting_bowl/" + name);

        consumer.accept(new RecipeJsonProvider() {
            @Override
            public void serialize(JsonObject json) {
                json.addProperty("type", "farm_and_charm:crafting_bowl");

                JsonArray ingredients = new JsonArray();
                for (IngredientEntry input : inputs) {
                    JsonObject obj = new JsonObject();
                    if (input.isTag())
                        obj.addProperty("tag", input.id());
                    else
                        obj.addProperty("item", input.id());
                    ingredients.add(obj);
                }
                json.add("ingredients", ingredients);

                JsonObject resultObj = new JsonObject();
                resultObj.addProperty("item", Registries.ITEM.getId(result.asItem()).toString());
                resultObj.addProperty("count", count);
                json.add("result", resultObj);
            }

            @Override
            public Identifier getRecipeId() {
                return recipeId;
            }

            @Override
            public RecipeSerializer<?> getSerializer() {
                return Registries.RECIPE_SERIALIZER.get(new Identifier("farm_and_charm", "crafting_bowl"));
            }

            @Override
            public @Nullable JsonObject toAdvancementJson() {
                return null;
            }

            @Override
            public Identifier getAdvancementId() {
                return null;
            }
        });
    }

    // ═══════════════════════════════════════════════════════════════
    // 锻造台合成 (Smithing Transform)
    // 输出到 data/wildernesss-delight/recipes/   type: minecraft:smithing_transform
    // ═══════════════════════════════════════════════════════════════
    private static void offerSmithingTransform(Consumer<RecipeJsonProvider> consumer, String name,
                                                ItemConvertible template, ItemConvertible base,
                                                ItemConvertible addition, ItemConvertible result, int count) {
        Identifier recipeId = new Identifier(WildernesssDelight.MOD_ID, name);

        consumer.accept(new RecipeJsonProvider() {
            @Override
            public void serialize(JsonObject json) {
                json.addProperty("type", "minecraft:smithing_transform");// 锻造台转换配方类型

                JsonObject templateObj = new JsonObject();
                templateObj.addProperty("item", Registries.ITEM.getId(template.asItem()).toString());// 锻造模板：下界合金升级模板
                json.add("template", templateObj);

                JsonObject baseObj = new JsonObject();
                baseObj.addProperty("item", Registries.ITEM.getId(base.asItem()).toString());// 基底：原野旗帜
                json.add("base", baseObj);

                JsonObject additionObj = new JsonObject();
                additionObj.addProperty("item", Registries.ITEM.getId(addition.asItem()).toString());// 附加材料：下界合金锭
                json.add("addition", additionObj);

                JsonObject resultObj = new JsonObject();
                resultObj.addProperty("item", Registries.ITEM.getId(result.asItem()).toString());// 输出物：原野旗帜
                resultObj.addProperty("count", count);// 输出数量：2 个
                json.add("result", resultObj);
            }

            @Override
            public Identifier getRecipeId() {
                return recipeId;
            }

            @Override
            public RecipeSerializer<?> getSerializer() {
                return RecipeSerializer.SMITHING_TRANSFORM;
            }

            @Override
            public @Nullable JsonObject toAdvancementJson() {
                return null;
            }

            @Override
            public Identifier getAdvancementId() {
                return null;
            }
        });
    }
}
