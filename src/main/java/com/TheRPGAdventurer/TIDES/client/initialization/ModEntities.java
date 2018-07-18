package com.TheRPGAdventurer.TIDES.client.initialization;

import com.TheRPGAdventurer.TIDES.Tides;
import com.TheRPGAdventurer.TIDES.server.entity.EntityStarfish;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static void registerSpawnable(Class entityClass, String name, int id, int mainColor, int subColor) {
		EntityRegistry.registerModEntity(new ResourceLocation(Tides.MODID, name), entityClass, name, id, Tides.instance, 64, 3, true, mainColor, subColor);
	}

	public static void registerUnspawnable(Class entityClass, String name, int id) {
		EntityRegistry.registerModEntity(new ResourceLocation(Tides.MODID, name), entityClass, name, id, Tides.instance, 64, 3, true);
	}

	public static void init() {
		registerSpawnable(EntityStarfish.class, "starfish", 1, 0X340000, 0XA52929);
	
	}
}
