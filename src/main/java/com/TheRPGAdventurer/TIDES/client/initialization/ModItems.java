package com.TheRPGAdventurer.TIDES.client.initialization;

import com.TheRPGAdventurer.TIDES.client.items.buket.ItemStarfishBucket;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final Item itemStarFishBucket;
	
	public static final Item[] ITEMS = {
			itemStarFishBucket = new ItemStarfishBucket("bucket_starfish", Blocks.WATER),
		};

}
