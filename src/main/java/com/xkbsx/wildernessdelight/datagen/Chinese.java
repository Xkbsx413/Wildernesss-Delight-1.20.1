package com.xkbsx.wildernessdelight.datagen;

import com.xkbsx.wildernessdelight.block.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class Chinese extends FabricLanguageProvider {
    public Chinese(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlock.HORSEWEEDBLOCK, "飞蓬草");
        translationBuilder.add("item.wildernesss-delight.horseweed", "飞蓬草");
        translationBuilder.add(ModBlock.SHEPHERD_PURSE, "野生荠菜");
        translationBuilder.add("item.wildernesss-delight.shepherd_purse_block", "荠菜");
        translationBuilder.add("item.wildernesss-delight.shepherd_purse", "荠菜");
        translationBuilder.add(ModBlock.CROP_DANDELION, "野生蒲公英");
        translationBuilder.add("item.wildernesss-delight.crop_dandelion_block", "作物蒲公英");
        translationBuilder.add("item.wildernesss-delight.crop_dandelion", "蒲公英叶");
        translationBuilder.add(ModBlock.HOUTTUYNIA,"野生折耳根");
        translationBuilder.add("item.wildernesss-delight.houttuynia_block","折耳根");
        translationBuilder.add("item.wildernesss-delight.houttuynia","折耳根");
        translationBuilder.add(ModBlock.BRACKEN_FERN_SHOOT,"野生蕨菜");
        translationBuilder.add("item.wildernesss-delight.bracken_fern_shoot_block","蕨菜");
        translationBuilder.add("item.wildernesss-delight.bracken_fern_shoot","蕨菜");
        translationBuilder.add(ModBlock.WILD_GARLIC,"野葱");
        translationBuilder.add("item.wildernesss-delight.wild_garlic_block","野葱");
        translationBuilder.add("item.wildernesss-delight.wild_garlic","野葱");
        translationBuilder.add(ModBlock.WATER_DROPWORT,"野生水芹");
        translationBuilder.add("item.wildernesss-delight.water_dropwort_block","水芹");
        translationBuilder.add("item.wildernesss-delight.water_dropwort","水芹茎");
        translationBuilder.add(ModBlock.PURSLANE,"野生马齿苋");
        translationBuilder.add("item.wildernesss-delight.purslane_block","马齿苋");
        translationBuilder.add("item.wildernesss-delight.purslane","马齿苋");
        translationBuilder.add(ModBlock.MUGWORT_SPROUT,"野生蒌蒿");
        translationBuilder.add("item.wildernesss-delight.mugwort_sprout_block","蒌蒿");
        translationBuilder.add("item.wildernesss-delight.mugwort_sprout","蒌蒿");
        translationBuilder.add(ModBlock.REED_SHOOT,"野生芦苇笋");
        translationBuilder.add("item.wildernesss-delight.reed_shoot_block","芦苇笋");
        translationBuilder.add("item.wildernesss-delight.reed_shoot","芦苇笋");
        translationBuilder.add(ModBlock.MINT,"野生薄荷");
        translationBuilder.add("item.wildernesss-delight.mint_block","薄荷");
        translationBuilder.add("item.wildernesss-delight.mint","薄荷叶");
        translationBuilder.add(ModBlock.POISON_HEMLOCK,"野生毒芹");
        translationBuilder.add("item.wildernesss-delight.poison_hemlock_block","毒芹");
        translationBuilder.add("item.wildernesss-delight.poison_hemlock","毒芹");
        translationBuilder.add(ModBlock.LYCORIS,"野生石蒜");
        translationBuilder.add("item.wildernesss-delight.lycoris_block","石蒜");
        translationBuilder.add("item.wildernesss-delight.lycoris","石蒜");
        translationBuilder.add(ModBlock.TREE_OF_HEAVEN,"野生臭椿");
        translationBuilder.add("item.wildernesss-delight.tree_of_heaven_block","臭椿");
        translationBuilder.add("item.wildernesss-delight.tree_of_heaven","臭椿");
        translationBuilder.add(ModBlock.BUTTERCUP,"野生石龙芮");
        translationBuilder.add("item.wildernesss-delight.buttercup_block","石龙芮");
        translationBuilder.add("item.wildernesss-delight.buttercup","石龙芮");
        translationBuilder.add(ModBlock.CUDWEED,"野生鼠曲草");
        translationBuilder.add("item.wildernesss-delight.cudweed_block","鼠曲草");
        translationBuilder.add("item.wildernesss-delight.cudweed","鼠曲草");
        translationBuilder.add(ModBlock.ICE_FLOWERS,"寒霜花");
        translationBuilder.add("item.wildernesss-delight.ice_flowers","寒霜花");
        translationBuilder.add(ModBlock.POTTED_ICE_FLOWERS,"寒霜花盆栽");
        translationBuilder.add("item.wildernesss-delight.potted_ice_flowers","寒霜花盆栽");
        translationBuilder.add(ModBlock.CHINESE_TOON_LEAVES,"香椿树叶");
        translationBuilder.add("item.wildernesss-delight.chinese_toon_leaves_block","香椿树叶");
        translationBuilder.add(ModBlock.CHINESE_TOON_SAPLING,"香椿树苗");
        translationBuilder.add("item.wildernesss-delight.chinese_toon_sapling_block","香椿树苗");
        translationBuilder.add("item.wildernesss-delight.chinese_toon_sprout","香椿");

        translationBuilder.add("itemGroup.wilderness-delight.wilderness-delight", "原野拾穗");
    }
}