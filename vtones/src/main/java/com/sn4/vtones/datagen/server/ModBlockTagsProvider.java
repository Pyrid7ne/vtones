package com.sn4.vtones.datagen.server;

import com.sn4.vtones.Vtones;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider{

	public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, Vtones.MOD_ID, helper);
	}
	
	@Override
	protected void addTags() {
		
		
		
	}
}
