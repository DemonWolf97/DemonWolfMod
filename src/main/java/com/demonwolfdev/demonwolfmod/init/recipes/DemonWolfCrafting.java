package com.demonwolfdev.demonwolfmod.init.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.demonwolfdev.demonwolfmod.init.blocks.DemonWolfBlocks;
import com.demonwolfdev.demonwolfmod.init.items.DemonWolfItems;

public class DemonWolfCrafting {
	public static void register()
	{
		GameRegistry.addRecipe(new ItemStack(DemonWolfBlocks.demon_block), new Object[] {"CCC", "CCC", "CCC", 'C',DemonWolfItems.demon_crystal});
		GameRegistry.addShapelessRecipe(new ItemStack (DemonWolfItems.demon_crystal, 9), new Object[] {DemonWolfBlocks.demon_block});
		//Start of Crafting My Head with Diffent Skulls/Heads
		GameRegistry.addRecipe(new ItemStack(DemonWolfItems.demon_head_item), new Object[] {"FFF", "FHF", "FFF", 'F', Items.rotten_flesh, 'H', Items.skull});
		GameRegistry.addRecipe(new ItemStack(DemonWolfItems.demon_head_item), new Object[] {"FFF", "FHF", "FFF", 'F', Items.rotten_flesh, 'H', new ItemStack (Items.skull, 7, 1)});
		GameRegistry.addRecipe(new ItemStack(DemonWolfItems.demon_head_item), new Object[] {"FFF", "FHF", "FFF", 'F', Items.rotten_flesh, 'H', new ItemStack (Items.skull, 7, 2)});
		GameRegistry.addRecipe(new ItemStack(DemonWolfItems.demon_head_item), new Object[] {"FFF", "FHF", "FFF", 'F', Items.rotten_flesh, 'H', new ItemStack (Items.skull, 7, 3)});
		GameRegistry.addRecipe(new ItemStack(DemonWolfItems.demon_head_item), new Object[] {"FFF", "FHF", "FFF", 'F', Items.rotten_flesh, 'H', new ItemStack (Items.skull, 7, 4)});
		//End of Crafting My Head with Diffent Skulls/Heads
		GameRegistry.addRecipe(new ItemStack(DemonWolfBlocks.demon_head_block), new Object[] {"HHH", "HHH", "HHH", 'H', DemonWolfItems.demon_head_item});
	}

}
