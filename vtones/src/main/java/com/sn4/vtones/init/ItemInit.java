package com.sn4.vtones.init;

import com.sn4.vtones.Vtones;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Vtones.MOD_ID);

	/*public static final RegistryObject<Item> CINNAMON_ROLL = register("cinnamon_roll", 
			() -> new VtonesItem(new Item.Properties().tab(Vtones.CREATIVE_TAB)
					.food(new FoodProperties.Builder().nutrition(4).saturationMod(2.0f).build())));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}*/
}
