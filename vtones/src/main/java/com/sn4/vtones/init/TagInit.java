package com.sn4.vtones.init;

import com.sn4.vtones.Vtones;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagInit {
	public static final class Blocks {
		
		public static TagKey<Block> FORCED_CHISELABLE = Blocks.mod("chiselable/forced");

		
		
		private static TagKey<Block> mod(String path) {
			return BlockTags.create(new ResourceLocation(Vtones.MOD_ID, path));
		}
		
	}
	
	public static final class Items {
		
		public static final TagKey<Item> CARK_BLOCKS_ITEMS = mod("cark_items");
		public static final TagKey<Item> AGON_BLOCKS_ITEMS = mod("agon_items");
		public static final TagKey<Item> AZUR_BLOCKS_ITEMS = mod("azur_items");
		public static final TagKey<Item> GLAXX_BLOCKS_ITEMS = mod("glaxx_items");
		public static final TagKey<Item> ISZM_BLOCKS_ITEMS = mod("iszm_items");
		public static final TagKey<Item> JELT_BLOCKS_ITEMS = mod("jelt_items");
		public static final TagKey<Item> KORP_BLOCKS_ITEMS = mod("korp_items");
		public static final TagKey<Item> KRYP_BLOCKS_ITEMS = mod("kryp_items");
		public static final TagKey<Item> LAIR_BLOCKS_ITEMS = mod("lair_items");
		public static final TagKey<Item> LAVE_BLOCKS_ITEMS = mod("lave_items");
		public static final TagKey<Item> MINT_BLOCKS_ITEMS = mod("mint_items");
		public static final TagKey<Item> MYST_BLOCKS_ITEMS = mod("myst_items");
		public static final TagKey<Item> REDS_BLOCKS_ITEMS = mod("reds_items");
		public static final TagKey<Item> REED_BLOCKS_ITEMS = mod("reed_items");
		public static final TagKey<Item> ROEN_BLOCKS_ITEMS = mod("roen_items");
		public static final TagKey<Item> SOLS_BLOCKS_ITEMS = mod("sols_items");
		public static final TagKey<Item> SYNC_BLOCKS_ITEMS = mod("sync_items");
		public static final TagKey<Item> TANK_BLOCKS_ITEMS = mod("tank_items");
		public static final TagKey<Item> VECT_BLOCKS_ITEMS = mod("vect_items");
		public static final TagKey<Item> VENA_BLOCKS_ITEMS = mod("vena_items");
		public static final TagKey<Item> ZEST_BLOCKS_ITEMS = mod("zest_items");
		public static final TagKey<Item> ZETA_BLOCKS_ITEMS = mod("zeta_items");
		public static final TagKey<Item> ZION_BLOCKS_ITEMS = mod("zion_items");
		public static final TagKey<Item> ZONE_BLOCKS_ITEMS = mod("zone_items");
		public static final TagKey<Item> ZORG_BLOCKS_ITEMS = mod("zorg_items");
		public static final TagKey<Item> ZTYL_BLOCKS_ITEMS = mod("ztyl_items");
		public static final TagKey<Item> ZYTH_BLOCKS_ITEMS = mod("zyth_items");
		public static final TagKey<Item> FLAT_LAMPS = mod("flat_lamps");

		private static TagKey<Item> mod(String path) {
			return ItemTags.create(new ResourceLocation(Vtones.MOD_ID, path));
		}
		
	}
}
