package com.Twisted_Code.witchery.items;

import net.minecraft.item.Item;

public class ItemMutandis extends Item{
	//when complete, this item will, on right-click, 'mutate' the targeted plant (or block?) into another. Valid results defined by configuration file
	public ItemMutandis(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
	}

}
