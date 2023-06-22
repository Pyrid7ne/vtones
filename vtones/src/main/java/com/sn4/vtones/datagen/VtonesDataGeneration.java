package com.sn4.vtones.datagen;

import com.sn4.vtones.Vtones;
import com.sn4.vtones.datagen.client.ModBlockstateProvider;
import com.sn4.vtones.datagen.client.ModItemModelProvider;
import com.sn4.vtones.datagen.client.lang.ModEnUsProvider;
import com.sn4.vtones.datagen.server.ModBlockTagsProvider;
import com.sn4.vtones.datagen.server.ModItemTagsProvider;
import com.sn4.vtones.datagen.server.ModLootTableProvider;
import com.sn4.vtones.datagen.server.ModRecipeProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Vtones.MOD_ID, bus = Bus.MOD)
public class VtonesDataGeneration {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper();
		
		if (event.includeClient()) {
			
			// Client Data Generation
			generator.addProvider(new ModBlockstateProvider(generator, helper));
			generator.addProvider(new ModItemModelProvider(generator, helper));
			generator.addProvider(new ModEnUsProvider(generator));
		}
		
		if (event.includeServer()) {
			
			ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);
			
			// Server Data Generation
			generator.addProvider(new ModRecipeProvider(generator));
			generator.addProvider(blockTags);
			generator.addProvider(new ModItemTagsProvider(generator, blockTags, helper));
			generator.addProvider(new ModLootTableProvider(generator));
			
		}
	}
}
