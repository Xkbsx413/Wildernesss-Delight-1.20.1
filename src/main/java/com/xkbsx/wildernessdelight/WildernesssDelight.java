package com.xkbsx.wildernessdelight;

import com.xkbsx.wildernessdelight.item.ModItems;
import com.xkbsx.wildernessdelight.item.ModItemsGroup;
import com.xkbsx.wildernessdelight.block.ModBlock;
import com.xkbsx.wildernessdelight.block.ModBlockEntities;
import com.xkbsx.wildernessdelight.world.tree.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildernesssDelight implements ModInitializer {
	public static final String MOD_ID = "wildernesss-delight";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		ModItemsGroup.RegisterGroups();
		ModBlock.registerBlocks();
		ModItems.registerItems();
		ModBlockEntities.register();
		ModWorldGeneration.register();
		LOGGER.info("Hello Fabric world!");
	}
}