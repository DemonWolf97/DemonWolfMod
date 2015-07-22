package com.demonwolfdev.demonwolfmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.demonwolfdev.demonwolfmod.init.blocks.DemonWolfBlocks;
import com.demonwolfdev.demonwolfmod.init.items.DemonWolfItems;
import com.demonwolfdev.demonwolfmod.init.recipes.DemonWolfCrafting;
import com.demonwolfdev.demonwolfmod.init.recipes.DemonWolfSmelting;
import com.demonwolfdev.demonwolfmod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class DemonWolfMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
		
	//Sets Creative Tab
	public static final DemonWolfTab tabDemonWolf = new DemonWolfTab("tabDemonWolf");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		DemonWolfItems.init();
		DemonWolfItems.register();
		DemonWolfBlocks.init();
		DemonWolfBlocks.register();
		DemonWolfCrafting.register();
		DemonWolfSmelting.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
