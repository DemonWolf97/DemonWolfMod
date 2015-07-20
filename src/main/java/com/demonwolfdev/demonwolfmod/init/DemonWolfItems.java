package com.demonwolfdev.demonwolfmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.demonwolfdev.demonwolfmod.DemonWolfMod;
import com.demonwolfdev.demonwolfmod.Reference;

public class DemonWolfItems {
	
	public static Item demon_crystal;
	
	public static void init() {
		demon_crystal = new Item().setUnlocalizedName("demon_crystal");
	}

	public static void register()
	{
		GameRegistry.registerItem(demon_crystal, demon_crystal.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(demon_crystal);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}