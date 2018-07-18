package com.TheRPGAdventurer.TIDES.server;

import com.TheRPGAdventurer.TIDES.Tides;
import com.TheRPGAdventurer.TIDES.client.initialization.ModEntities;
import com.TheRPGAdventurer.TIDES.server.entity.EntityStarfish;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ServerProxy {
	
	public void PreInitialization(FMLPreInitializationEvent event) {
		
	}
	
	public void Initialization(FMLInitializationEvent event) {
		
	}
	
	public void PostInitialization(FMLPostInitializationEvent event) {
		EntityRegistry.registerModEntity(new ResourceLocation(Tides.MODID, "seastar"), EntityStarfish.class, "seastar", 1, Tides.instance, 64, 3, true, 0x960b0f, 0x320b0f);
	}

}
