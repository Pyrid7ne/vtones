package com.sn4.vtones.block;

import net.minecraft.world.level.block.Block;

public class VtonesBlock extends Block{
	
	public 	VtonesBlock(Properties properties) {
		super(properties);	
	}
	
	/*@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand,
			BlockHitResult result) {

		if (!world.isClientSide()) {
			if (player.getItemInHand(hand).getItem().equals(ItemInit.CINNAMON_ROLL.get())) {
				System.out.println(player.getName().getString() + " interacted with block at pos " + pos.toShortString()
						+ " using a cinnamon_roll.");
				return InteractionResult.CONSUME;
			}
		}

		return super.use(state, world, pos, player, hand, result);
	}*/
}
