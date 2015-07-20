package com.demonwolfdev.demonwolfmod.proxy;

import com.demonwolfdev.demonwolfmod.init.DemonWolfItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		DemonWolfItems.registerRenders();
	}
}