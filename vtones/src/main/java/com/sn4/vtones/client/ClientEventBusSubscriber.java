package com.sn4.vtones.client;

import com.sn4.vtones.Vtones;
import com.sn4.vtones.init.BlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Vtones.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {


    @SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_0.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_1.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_2.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_3.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_4.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_5.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_6.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_7.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_8.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_9.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_10.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_11.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_12.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_13.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_14.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLAXX_BLOCK_15.get(), RenderType.translucent());

	}
}

