package com.Twisted_Code.witchery;
import com.Twisted_Code.witchery.init.ModBlocks;
import com.Twisted_Code.witchery.init.ModItems;
//This class is the mod-level equivalent of the class containing a Java program's "public static void main"
import com.Twisted_Code.witchery.proxy.CommonProxy;
import com.Twisted_Code.witchery.util.Utils;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//(Yes there's a lot of imports. What do you expect from a "main" class?)
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTEDMCVERSIONS)
public class WitcheryReincarnate {
	//...and this is essentially the mod's "public static void main" method, I think?
	@Mod.Instance(Reference.MODID)
	public static WitcheryReincarnate instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy Proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info ("pre-initializing");
		
		Utils.getLogger().debug("registering items");
		ModItems.init();
		ModBlocks.init();
		ModItems.register();
		ModBlocks.register();
		Utils.getLogger().debug("registering renders");
		Proxy.registerRenders();
		
		Utils.getLogger().info ("pre-init finished");
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("initializing");
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("post-initializing");
		
		Utils.getLogger().info("Witchery successfully loaded!");		
	}
	
}
