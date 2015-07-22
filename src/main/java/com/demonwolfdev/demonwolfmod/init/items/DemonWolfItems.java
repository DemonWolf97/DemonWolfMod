package com.demonwolfdev.demonwolfmod.init.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.demonwolfdev.demonwolfmod.DemonWolfMod;
import com.demonwolfdev.demonwolfmod.Reference;
import com.demonwolfdev.demonwolfmod.init.blocks.DemonWolfBlocks;

public class DemonWolfItems {
	
	//Items
	public static Item demon_crystal;
	public static Item demon_head_item;
	
	//DemonArmor
	//public static ArmorMaterial demon_armor = EnumHelper.addArmorMaterial("demon_armor", "dwn:demon_armor", 33, new int[] {3, 8, 6, 3}, 30);
	//public static Item demon_helmet;
	//public static Item demon_chestplate;
	//public static Item demon_leggings;
	
	public static void init() {
		demon_crystal = new Item().setUnlocalizedName("demon_crystal").setCreativeTab(DemonWolfMod.tabDemonWolf);
		demon_head_item = new Item().setUnlocalizedName("demon_head_item").setCreativeTab(DemonWolfMod.tabDemonWolf);
	}

	public static void register()
	{
		GameRegistry.registerItem(demon_crystal, demon_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(demon_head_item, demon_head_item.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(demon_crystal);
		registerRender(demon_head_item);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}