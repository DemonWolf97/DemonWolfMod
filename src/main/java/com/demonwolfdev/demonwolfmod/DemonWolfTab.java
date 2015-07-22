package com.demonwolfdev.demonwolfmod;

import com.demonwolfdev.demonwolfmod.init.items.DemonWolfItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DemonWolfTab extends CreativeTabs {

	public DemonWolfTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return DemonWolfItems.demon_head_item;
	}

}
