package com.sn4.vtones.item;

import net.minecraft.world.item.Item;

public class VtonesItem extends Item{

	public VtonesItem(Properties properties) {
		super(properties);
	}
	
	/*@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		
		//if (!world.isClientSide()) {
		//	System.out.println(player.getName().getString() + " has used item with hand " + hand.name());
		//}
		
		return super.use(world, player, hand);
	}*/
}
