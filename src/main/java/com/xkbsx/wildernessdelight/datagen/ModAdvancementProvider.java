package com.xkbsx.wildernessdelight.datagen;

import com.xkbsx.wildernessdelight.item.ModItems;
import com.xkbsx.wildernessdelight.potion.ModPotions;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> exporter) {
        Advancement root = Advancement.Builder.create()
                .display(ModItems.SHEPHERD_PURSE,
                        Text.translatable("advancement.wildernesss-delight.root.title"),
                        Text.translatable("advancement.wildernesss-delight.root.desc"),
                        new Identifier("textures/gui/advancements/backgrounds/husbandry.png"),
                        AdvancementFrame.TASK, false, false, false)
                .criterion("pickup", InventoryChangedCriterion.Conditions.items(new net.minecraft.item.Item[0]))
                .build(exporter, "wildernesss-delight:root");

        Advancement.Builder.create()
                .parent(root)
                .display(ModItems.HOUTTUYNIA,
                        Text.translatable("advancement.wildernesss-delight.forager.title"),
                        Text.translatable("advancement.wildernesss-delight.forager.desc"),
                        null, AdvancementFrame.CHALLENGE, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(100).build())
                .criterion("shepherd_purse", InventoryChangedCriterion.Conditions.items(ModItems.SHEPHERD_PURSE))
                .criterion("houttuynia", InventoryChangedCriterion.Conditions.items(ModItems.HOUTTUYNIA))
                .criterion("bracken_fern", InventoryChangedCriterion.Conditions.items(ModItems.BRACKEN_FERN_SHOOT))
                .criterion("wild_garlic", InventoryChangedCriterion.Conditions.items(ModItems.WILD_GARLIC))
                .criterion("water_dropwort", InventoryChangedCriterion.Conditions.items(ModItems.WATER_DROPWORT))
                .criterion("purslane", InventoryChangedCriterion.Conditions.items(ModItems.PURSLANE))
                .criterion("mugwort", InventoryChangedCriterion.Conditions.items(ModItems.MUGWORT_SPROUT))
                .criterion("reed_shoot", InventoryChangedCriterion.Conditions.items(ModItems.REED_SHOOT))
                .criterion("cudweed", InventoryChangedCriterion.Conditions.items(ModItems.CUDWEED))
                .criterion("chinese_toon", InventoryChangedCriterion.Conditions.items(ModItems.CHINESE_TOON_SPROUT))
                .criterion("ginseng", InventoryChangedCriterion.Conditions.items(ModItems.GINSENG))
                .criterion("lingzhi", InventoryChangedCriterion.Conditions.items(ModItems.LINGZHI))
                .build(exporter, "wildernesss-delight:forager");

        Advancement.Builder.create()
                .parent(root)
                .display(ModItems.POISON_HEMLOCK,
                        Text.translatable("advancement.wildernesss-delight.toxicologist.title"),
                        Text.translatable("advancement.wildernesss-delight.toxicologist.desc"),
                        null, AdvancementFrame.TASK, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(50).build())
                .criterion("poison_hemlock", InventoryChangedCriterion.Conditions.items(ModItems.POISON_HEMLOCK))
                .criterion("lycoris", InventoryChangedCriterion.Conditions.items(ModItems.LYCORIS))
                .criterion("tree_of_heaven", InventoryChangedCriterion.Conditions.items(ModItems.TREE_OF_HEAVEN))
                .criterion("buttercup", InventoryChangedCriterion.Conditions.items(ModItems.BUTTERCUP))
                .build(exporter, "wildernesss-delight:toxicologist");

        Advancement cook = Advancement.Builder.create()
                .parent(root)
                .display(ModItems.COOKED_BRACKEN_FERN_SHOOT,
                        Text.translatable("advancement.wildernesss-delight.cook.title"),
                        Text.translatable("advancement.wildernesss-delight.cook.desc"),
                        null, AdvancementFrame.TASK, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(25).build())
                .criterion("cooked", InventoryChangedCriterion.Conditions.items(
                        ItemPredicate.Builder.create().items(
                                ModItems.COOKED_BRACKEN_FERN_SHOOT, ModItems.COOKED_REED_SHOOT,
                                ModItems.COOKED_PURSLANE, ModItems.COOKED_SHEPHERD_PURSE,
                                ModItems.COOKED_WATER_DROPWORT).build()))
                .build(exporter, "wildernesss-delight:cook");

        Advancement hundred_herbs = Advancement.Builder.create()
                .parent(cook)
                .display(ModItems.HUNDRED_HERBS_DELICACY,
                        Text.translatable("advancement.wildernesss-delight.hundred_herbs.title"),
                        Text.translatable("advancement.wildernesss-delight.hundred_herbs.desc"),
                        null, AdvancementFrame.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(100).build())
                .criterion("hundred_herbs_delicacy", InventoryChangedCriterion.Conditions.items(ModItems.HUNDRED_HERBS_DELICACY))
                .build(exporter, "wildernesss-delight:hundred_herbs");

        Advancement chef = Advancement.Builder.create()
                .parent(hundred_herbs)
                .display(ModItems.CHINESE_TOON_SCRAMBLED_EGGS,
                        Text.translatable("advancement.wildernesss-delight.chef.title"),
                        Text.translatable("advancement.wildernesss-delight.chef.desc"),
                        null, AdvancementFrame.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(250).build())
                .criterion("dish", InventoryChangedCriterion.Conditions.items(
                        ItemPredicate.Builder.create().items(
                                ModItems.CHINESE_TOON_SCRAMBLED_EGGS, ModItems.SHEPHERD_PURSE_DUMPLINGS,
                                ModItems.HOUTTUYNIA_SALAD, ModItems.PURSLANE_MOZZARELLA_SALAD,
                                ModItems.BRACKEN_FERN_WITH_BACON, ModItems.MUGWORT_WITH_CORN,
                                ModItems.WATER_DROPWORT_ONION_SALAD, ModItems.DANDELION_TOMATO_EGG_SOUP,
                                ModItems.REED_SHOOT_CHICKEN_LETTUCE, ModItems.WILD_GARLIC_CORN_PANCAKE,
                                ModItems.HORSEWEED_MOZZARELLA_HONEY, ModItems.MIXED_WILD_STIR_FRY,
                                ModItems.DOUBLE_WILD_VEG_SALAD, ModItems.WILD_VEG_PANCAKE,
                                ModItems.THREE_FRESH_SALAD, ModItems.WILD_VEGETABLE_SOUP,
                                ModItems.MINT_LAMB_HAM, ModItems.CUDWEED_RICE_DUMPLING,
                                ModItems.GINSENG_SOUP, ModItems.HERICIUM_COOKIE,
                                ModItems.LINGZHI_CHICKEN_SOUP, ModItems.HUNDRED_HERBS_DELICACY).build()))
                .build(exporter, "wildernesss-delight:chef");

        Advancement.Builder.create()
                .parent(chef)
                .display(ModItems.WILD_VEGETABLE_SOUP,
                        Text.translatable("advancement.wildernesss-delight.feast.title"),
                        Text.translatable("advancement.wildernesss-delight.feast.desc"),
                        null, AdvancementFrame.CHALLENGE, true, true, false)
                .rewards(new AdvancementRewards.Builder()
                        .setExperience(800)
                        .addLoot(new Identifier("wildernesss-delight", "advancements/feast_reward"))
                        .build())
                .criterion("chinese_toon_scrambled_eggs", InventoryChangedCriterion.Conditions.items(ModItems.CHINESE_TOON_SCRAMBLED_EGGS))
                .criterion("shepherd_purse_dumplings", InventoryChangedCriterion.Conditions.items(ModItems.SHEPHERD_PURSE_DUMPLINGS))
                .criterion("houttuynia_salad", InventoryChangedCriterion.Conditions.items(ModItems.HOUTTUYNIA_SALAD))
                .criterion("purslane_mozzarella_salad", InventoryChangedCriterion.Conditions.items(ModItems.PURSLANE_MOZZARELLA_SALAD))
                .criterion("bracken_fern_with_bacon", InventoryChangedCriterion.Conditions.items(ModItems.BRACKEN_FERN_WITH_BACON))
                .criterion("mugwort_with_corn", InventoryChangedCriterion.Conditions.items(ModItems.MUGWORT_WITH_CORN))
                .criterion("water_dropwort_onion_salad", InventoryChangedCriterion.Conditions.items(ModItems.WATER_DROPWORT_ONION_SALAD))
                .criterion("dandelion_tomato_egg_soup", InventoryChangedCriterion.Conditions.items(ModItems.DANDELION_TOMATO_EGG_SOUP))
                .criterion("reed_shoot_chicken_lettuce", InventoryChangedCriterion.Conditions.items(ModItems.REED_SHOOT_CHICKEN_LETTUCE))
                .criterion("wild_garlic_corn_pancake", InventoryChangedCriterion.Conditions.items(ModItems.WILD_GARLIC_CORN_PANCAKE))
                .criterion("horseweed_mozzarella_honey", InventoryChangedCriterion.Conditions.items(ModItems.HORSEWEED_MOZZARELLA_HONEY))
                .criterion("mixed_wild_stir_fry", InventoryChangedCriterion.Conditions.items(ModItems.MIXED_WILD_STIR_FRY))
                .criterion("double_wild_veg_salad", InventoryChangedCriterion.Conditions.items(ModItems.DOUBLE_WILD_VEG_SALAD))
                .criterion("wild_veg_pancake", InventoryChangedCriterion.Conditions.items(ModItems.WILD_VEG_PANCAKE))
                .criterion("three_fresh_salad", InventoryChangedCriterion.Conditions.items(ModItems.THREE_FRESH_SALAD))
                .criterion("wild_vegetable_soup", InventoryChangedCriterion.Conditions.items(ModItems.WILD_VEGETABLE_SOUP))
                .criterion("mint_lamb_ham", InventoryChangedCriterion.Conditions.items(ModItems.MINT_LAMB_HAM))
                .criterion("ice_flower_fruit_salad", InventoryChangedCriterion.Conditions.items(ModItems.ICE_FLOWER_FRUIT_SALAD))
                .criterion("cudweed_rice_dumpling", InventoryChangedCriterion.Conditions.items(ModItems.CUDWEED_RICE_DUMPLING))
                .criterion("ginseng_soup", InventoryChangedCriterion.Conditions.items(ModItems.GINSENG_SOUP))
                .criterion("hericium_cookie", InventoryChangedCriterion.Conditions.items(ModItems.HERICIUM_COOKIE))
                .criterion("lingzhi_chicken_soup", InventoryChangedCriterion.Conditions.items(ModItems.LINGZHI_CHICKEN_SOUP))
                .criterion("hundred_herbs_delicacy", InventoryChangedCriterion.Conditions.items(ModItems.HUNDRED_HERBS_DELICACY))
                .build(exporter, "wildernesss-delight:feast");

        Advancement.Builder.create()
                .parent(cook)
                .display(ModItems.MINT_TEA,
                        Text.translatable("advancement.wildernesss-delight.drink.title"),
                        Text.translatable("advancement.wildernesss-delight.drink.desc"),
                        null, AdvancementFrame.TASK, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(25).build())
                .criterion("drink", InventoryChangedCriterion.Conditions.items(
                        ItemPredicate.Builder.create().items(
                                ModItems.MINT_TEA, ModItems.DANDELION_ROOT_TEA, ModItems.ICE_FLOWER_MINT_SOUP).build()))
                .build(exporter, "wildernesss-delight:drink");

        Advancement.Builder.create()
                .parent(root)
                .display(ModItems.MINT,
                        Text.translatable("advancement.wildernesss-delight.refreshing.title"),
                        Text.translatable("advancement.wildernesss-delight.refreshing.desc"),
                        null, AdvancementFrame.TASK, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(25).build())
                .criterion("mint", InventoryChangedCriterion.Conditions.items(ModItems.MINT))
                .build(exporter, "wildernesss-delight:refreshing");

        Advancement.Builder.create()
                .parent(root)
                .display(ModItems.FOXTAIL_GRASS,
                        Text.translatable("advancement.wildernesss-delight.grass_wolf_trail.title"),
                        Text.translatable("advancement.wildernesss-delight.grass_wolf_trail.desc"),
                        null, AdvancementFrame.GOAL, true, true, false)
                .rewards(AdvancementRewards.Builder.experience(100).build())
                .criterion("fluffy_tail", InventoryChangedCriterion.Conditions.items(
                        ItemPredicate.Builder.create()
                                .items(Items.POTION, Items.SPLASH_POTION, Items.LINGERING_POTION)
                                .potion(ModPotions.FLUFFY_TAIL)
                                .build()))
                .build(exporter, "wildernesss-delight:grass_wolf_trail");
    }
}