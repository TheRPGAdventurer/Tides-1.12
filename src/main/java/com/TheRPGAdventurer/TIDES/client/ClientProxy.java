package com.TheRPGAdventurer.TIDES.client;

import com.TheRPGAdventurer.TIDES.client.render.RenderStarfish;
import com.TheRPGAdventurer.TIDES.server.ServerProxy;
import com.TheRPGAdventurer.TIDES.server.entity.EntityStarfish;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends ServerProxy {
	
	@Override
	public void PreInitialization(FMLPreInitializationEvent event) {
		super.PreInitialization(event);
		RenderingRegistry.registerEntityRenderingHandler(EntityStarfish.class, RenderStarfish::new);
	}
	
	@Override
	public void Initialization(FMLInitializationEvent event) {
		super.Initialization(event);
	}
	
	@Override
	public void PostInitialization(FMLPostInitializationEvent event) {
		super.PostInitialization(event);
	}

}
