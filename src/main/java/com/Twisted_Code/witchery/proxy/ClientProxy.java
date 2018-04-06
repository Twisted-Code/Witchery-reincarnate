package com.Twisted_Code.witchery.proxy;

import com.Twisted_Code.witchery.init.ModItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
	}
}
