package com.TheRPGAdventurer.TIDES;

import com.TheRPGAdventurer.TIDES.server.ServerProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 * Main control class for Forge.
 * 
 */
@Mod(
//	    dependencies = "required-after:llibrary@[" + Tides.LLIBRARY_VERSION + ",)",
	    modid = Tides.MODID,
	    name = Tides.NAME,
	    version = Tides.VERSION,
	    useMetadata = true
//	    guiFactory = DragonMounts.GUI_FACTORY
)
public class Tides {
	
	public static SimpleNetworkWrapper NETWORK_WRAPPER;
	
	public static final String NAME = "TIDES";
	public static final String MODID = "tides";
	public static final String VERSION = "1.12-1.0";
	
	@SidedProxy(serverSide = "com.TheRPGAdventurer.TIDES.server.ServerProxy", 
			    clientSide = "com.TheRPGAdventurer.TIDES.client.ClientProxy")
	public static ServerProxy proxy;
	
	@Instance(value = MODID)
	public static Tides instance;
	
    private ModMetadata metadata;
	
    public ModMetadata getMetadata() {
        return metadata;
    }
    
	@EventHandler
	public void PreInitialization(FMLPreInitializationEvent event) {
		proxy.PreInitialization(event);
		metadata = event.getModMetadata();
	}
	
	@EventHandler
	public void Initialization(FMLInitializationEvent event) {
		proxy.Initialization(event);
	}
	
	@EventHandler
	public void PostInitialization(FMLPostInitializationEvent event) {
		proxy.PostInitialization(event);
	}
	
	

}
