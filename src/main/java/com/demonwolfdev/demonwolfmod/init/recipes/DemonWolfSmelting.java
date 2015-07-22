package com.demonwolfdev.demonwolfmod.init.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.demonwolfdev.demonwolfmod.init.blocks.DemonWolfBlocks;
import com.demonwolfdev.demonwolfmod.init.items.DemonWolfItems;

public class DemonWolfSmelting {
	public static void register()
	{
		GameRegistry.addSmelting(DemonWolfBlocks.demon_ore, new ItemStack(DemonWolfItems.demon_crystal, 1) , 10);
	}

}
