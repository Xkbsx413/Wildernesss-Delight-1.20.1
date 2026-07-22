package com.xkbsx.wildernessdelight.datagen;

import com.xkbsx.wildernessdelight.block.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class English extends FabricLanguageProvider {
    public English(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
           translationBuilder.add(ModBlock.HORSEWEEDBLOCK,"horseweed");
           translationBuilder.add("item.wildernesss-delight.horseweed","horseweed");
           translationBuilder.add(ModBlock.SHEPHERD_PURSE,"wild shepherd purse");
           translationBuilder.add("item.wildernesss-delight.shepherd_purse_block","shepherd purse");
           translationBuilder.add("item.wildernesss-delight.shepherd_purse","shepherd purse leaves");
           translationBuilder.add(ModBlock.CROP_DANDELION,"wild dandelion");
           translationBuilder.add("item.wildernesss-delight.crop_dandelion_block","dandelion crop");
           translationBuilder.add("item.wildernesss-delight.crop_dandelion","dandelion leaves");
           translationBuilder.add(ModBlock.HOUTTUYNIA,"wild houttuynia");
           translationBuilder.add("item.wildernesss-delight.houttuynia_block","houttuynia");
           translationBuilder.add("item.wildernesss-delight.houttuynia","houttuynia leaves");
           translationBuilder.add(ModBlock.BRACKEN_FERN_SHOOT,"wild bracken fern");
           translationBuilder.add("item.wildernesss-delight.bracken_fern_shoot_block","bracken fern shoot");
           translationBuilder.add("item.wildernesss-delight.bracken_fern_shoot","bracken fern leaves");
           translationBuilder.add(ModBlock.WILD_GARLIC,"wild garlic");
           translationBuilder.add("item.wildernesss-delight.wild_garlic_block","wild garlic");
           translationBuilder.add("item.wildernesss-delight.wild_garlic","wild garlic leaves");
           translationBuilder.add(ModBlock.WATER_DROPWORT,"wild water dropwort");
           translationBuilder.add("item.wildernesss-delight.water_dropwort_block","water dropwort");
           translationBuilder.add("item.wildernesss-delight.water_dropwort","water dropwort leaves");
           translationBuilder.add(ModBlock.PURSLANE,"wild purslane");
           translationBuilder.add("item.wildernesss-delight.purslane_block","purslane");
           translationBuilder.add("item.wildernesss-delight.purslane","purslane leaves");
           translationBuilder.add(ModBlock.MUGWORT_SPROUT,"wild mugwort");
           translationBuilder.add("item.wildernesss-delight.mugwort_sprout_block","mugwort sprout");
           translationBuilder.add("item.wildernesss-delight.mugwort_sprout","mugwort leaves");
           translationBuilder.add(ModBlock.REED_SHOOT,"wild reed shoot");
           translationBuilder.add("item.wildernesss-delight.reed_shoot_block","reed shoot");
           translationBuilder.add("item.wildernesss-delight.reed_shoot","reed leaves");
           translationBuilder.add(ModBlock.MINT,"wild mint");
           translationBuilder.add("item.wildernesss-delight.mint_block","mint");
           translationBuilder.add("item.wildernesss-delight.mint","mint leaves");
           translationBuilder.add(ModBlock.POISON_HEMLOCK,"wild poison hemlock");
           translationBuilder.add("item.wildernesss-delight.poison_hemlock_block","poison hemlock");
           translationBuilder.add("item.wildernesss-delight.poison_hemlock","poison hemlock leaves");
           translationBuilder.add(ModBlock.LYCORIS,"wild lycoris");
           translationBuilder.add("item.wildernesss-delight.lycoris_block","lycoris");
           translationBuilder.add("item.wildernesss-delight.lycoris","lycoris leaves");
           translationBuilder.add("item.wildernesss-delight.tree_of_heaven_block","tree of heaven");
           translationBuilder.add("item.wildernesss-delight.tree_of_heaven","tree of heaven leaves");
           translationBuilder.add(ModBlock.BUTTERCUP,"wild buttercup");
           translationBuilder.add("item.wildernesss-delight.buttercup_block","buttercup");
           translationBuilder.add("item.wildernesss-delight.buttercup","buttercup leaves");
           translationBuilder.add(ModBlock.CUDWEED,"wild cudweed");
           translationBuilder.add("item.wildernesss-delight.cudweed_block","cudweed");
           translationBuilder.add("item.wildernesss-delight.cudweed","cudweed leaves");
           translationBuilder.add(ModBlock.ICE_FLOWERS,"ice flowers");
           translationBuilder.add("item.wildernesss-delight.ice_flowers","ice flowers");
           translationBuilder.add(ModBlock.POTTED_ICE_FLOWERS,"potted ice flowers");
           translationBuilder.add("item.wildernesss-delight.potted_ice_flowers","potted ice flowers");
            translationBuilder.add(ModBlock.CHINESE_TOON_LEAVES,"chinese toon leaves");
            translationBuilder.add("item.wildernesss-delight.chinese_toon_leaves_block","chinese toon leaves");
            translationBuilder.add(ModBlock.CHINESE_TOON_SAPLING,"chinese toon sapling");
            translationBuilder.add("item.wildernesss-delight.chinese_toon_sapling_block","chinese toon sapling");
            translationBuilder.add(ModBlock.TREE_OF_HEAVEN_LEAVES,"tree of heaven leaves");
            translationBuilder.add("item.wildernesss-delight.tree_of_heaven_leaves_block","tree of heaven leaves");
            translationBuilder.add(ModBlock.TREE_OF_HEAVEN_SAPLING,"tree of heaven sapling");
            translationBuilder.add("item.wildernesss-delight.tree_of_heaven_sapling_block","tree of heaven sapling");
            translationBuilder.add("item.wildernesss-delight.chinese_toon_sprout","toon leaves");
            translationBuilder.add("item.wildernesss-delight.cooked_bracken_fern_shoot","cooked bracken fern");
            translationBuilder.add("item.wildernesss-delight.cooked_reed_shoot","cooked reed shoot");
            translationBuilder.add("item.wildernesss-delight.cooked_purslane","cooked purslane");
            translationBuilder.add("item.wildernesss-delight.cooked_shepherd_purse","cooked shepherd purse");
            translationBuilder.add("item.wildernesss-delight.cooked_water_dropwort","cooked water dropwort");

            translationBuilder.add("itemGroup.wilderness-delight.wilderness-delight","Wilderness Delight");
    }
}