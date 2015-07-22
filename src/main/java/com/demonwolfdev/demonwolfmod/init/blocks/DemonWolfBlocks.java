package com.demonwolfdev.demonwolfmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.demonwolfdev.demonwolfmod.DemonWolfMod;
import com.demonwolfdev.demonwolfmod.Reference;
import com.demonwolfdev.demonwolfmod.blocks.Blocks;
import com.demonwolfdev.demonwolfmod.init.items.DemonWolfItems;

public class DemonWolfBlocks {
	
	public static Block demon_ore;
	public static Block demon_block;
	public static Block demon_head_block;
		
	public static void init()
	{
		demon_ore = new Blocks(Material.ground).setUnlocalizedName("demon_ore").setCreativeTab(DemonWolfMod.tabDemonWolf);
		demon_block = new Blocks(Material.ground).setUnlocalizedName("demon_block").setCreativeTab(DemonWolfMod.tabDemonWolf);
		demon_head_block =new Blocks(Material.ground).setUnlocalizedName("demon_head_block").setCreativeTab(DemonWolfMod.tabDemonWolf);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(demon_ore, demon_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(demon_block, demon_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(demon_head_block, demon_head_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(demon_ore);
		registerRender(demon_block);
		registerRender(demon_head_block);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
