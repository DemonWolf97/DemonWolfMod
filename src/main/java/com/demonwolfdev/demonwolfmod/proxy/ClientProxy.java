package com.demonwolfdev.demonwolfmod.proxy;

import com.demonwolfdev.demonwolfmod.init.DemonWolfItems;
import com.demonwolfdev.demonwolfmod.init.DemonWolfBlocks;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		DemonWolfItems.registerRenders();
		DemonWolfBlocks.registerRenders();
	}
}