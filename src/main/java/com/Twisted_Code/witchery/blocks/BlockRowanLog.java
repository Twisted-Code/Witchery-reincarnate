package com.Twisted_Code.witchery.blocks;

import com.Twisted_Code.witchery.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockRowanLog extends Block{

	public BlockRowanLog(String unlocalizedName, String registryName) {
		super(Material.WOOD);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		this.setHardness(1);
		this.setResistance(5);
		this.setSoundType(SoundType.WOOD);
	}
	
}
