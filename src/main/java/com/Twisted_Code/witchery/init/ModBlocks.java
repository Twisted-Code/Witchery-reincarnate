package com.Twisted_Code.witchery.init;

import com.Twisted_Code.witchery.Reference;
import com.Twisted_Code.witchery.blocks.*;
import com.Twisted_Code.witchery.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block rowanLog;
	
	public static void init() {
		rowanLog = new BlockRowanLog("rowanlog", "rowanlog");
	}
	public static void register() {
		registerBlock(rowanLog);
	}
	public static void registerRenders() {
		registerRender(rowanLog);
	}
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		Utils.getLogger().info("registered block: " + block.getUnlocalizedName().substring(5));
	}
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("registered render for " + block.getUnlocalizedName().substring(5));
	}
	
}
