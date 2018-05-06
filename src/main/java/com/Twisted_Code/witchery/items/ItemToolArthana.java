package com.Twisted_Code.witchery.items;

import com.Twisted_Code.witchery.Reference;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemToolArthana extends ItemSword{

	public ItemToolArthana(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	//eventually I'll figure out how to make this boost magical drops, possibly dependent on the material intractability?	
}
