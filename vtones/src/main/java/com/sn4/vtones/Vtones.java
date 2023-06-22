package com.sn4.vtones;



import com.sn4.vtones.init.BlockInit;
import com.sn4.vtones.init.ItemInit;
import com.sn4.vtones.network.CycleHandler;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("vtones")
public class Vtones {
	public static final String MOD_ID = "vtones";
	
	public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.AGON_BLOCK_0.get());
		}
	};
	
	

	
	
	
	
	
	
	public Vtones() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(CycleHandler.class);

	}
	
	
	
}
