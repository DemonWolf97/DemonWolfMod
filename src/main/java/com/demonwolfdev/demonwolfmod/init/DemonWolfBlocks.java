package com.demonwolfdev.demonwolfmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.demonwolfdev.demonwolfmod.DemonWolfMod;
import com.demonwolfdev.demonwolfmod.Reference;
import com.demonwolfdev.demonwolfmod.blocks.Blocks;

public class DemonWolfBlocks {
	
	public static Block demon_ore;
	public static Block demon_block;
		
	public static void init()
	{
		demon_ore = new Blocks(Material.ground).setUnlocalizedName("demon_ore");
		demon_block = new Blocks(Material.ground).setUnlocalizedName("demon_block");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(demon_ore, demon_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(demon_block, demon_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(demon_ore);
		registerRender(demon_block);		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
