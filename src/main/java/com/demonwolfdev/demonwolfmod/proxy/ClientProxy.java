package com.demonwolfdev.demonwolfmod.proxy;

import com.demonwolfdev.demonwolfmod.init.blocks.DemonWolfBlocks;
import com.demonwolfdev.demonwolfmod.init.items.DemonWolfItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		DemonWolfItems.registerRenders();
		DemonWolfBlocks.registerRenders();
	}
}