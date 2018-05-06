package com.Twisted_Code.witchery.proxy;

import com.Twisted_Code.witchery.init.*;
//import com.Twisted_Code.witchery.init.ModBlocks;
//import com.Twisted_Code.witchery.init.ModItems;
//import com.Twisted_Code.witchery.init.ModTools;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModBlocks.registerRenders();
	}
}
