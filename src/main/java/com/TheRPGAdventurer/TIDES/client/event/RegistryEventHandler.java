package com.TheRPGAdventurer.TIDES.client.event;

import com.TheRPGAdventurer.TIDES.client.initialization.ModItems;
import com.TheRPGAdventurer.TIDES.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryEventHandler {
	
//	@SubscribeEvent
	//public static void registerBlocks(RegistryEvent.Register<Block> event) {	
	//	event.getRegistry().registerAll(ModBlocks.BLOCKS);
	//	Utils.getLogger().info("Block Registries Successfully Registered!");
//	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {	
		event.getRegistry().registerAll(ModItems.ITEMS);
		
		Utils.getLogger().info("Item Registries Successfully Registered!");
	}
	

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
//		for (Block block: ModBlocks.BLOCKS) {
//			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
		for (Item item: ModItems.ITEMS) {
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}		
		
//		ModTools.initRepairs();
//		ModArmour.initRepairs();
		
    	Utils.getLogger().info("Models Sucessfully Registered");
	}
  
}