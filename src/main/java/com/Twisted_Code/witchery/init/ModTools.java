package com.Twisted_Code.witchery.init;
/* This class is not likely to contain many entries as this mod
 * isn't going to be very tool-heavy, or at least not at first,
 * but maybe I'll at least end up using it to implement poppets? 
 * In any case, implementing tools as part of the tutorial
 * I'm following, so without further ado...
 */

import com.Twisted_Code.witchery.Reference;
import com.Twisted_Code.witchery.items.ItemToolArthana;
import com.Twisted_Code.witchery.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	public static void init(){
		ItemToolArthana goldArthana = new ItemToolArthana(ToolMaterial.GOLD, "goldArthana"); //I'll probably change the material traits at a later date, but for now, gold's standard attributes will suffice
	}

	public static void register(){
		
	}

	public static void registerRenders(){
		
	}
	public static void registerItem(Item item){
		GameRegistry.register(item);
		Utils.getLogger().info("registered tool-item "+item.getUnlocalizedName().substring(5));
	}

	public static void registerRender(Item item){
		//tell modelloader where to find the model's model resource location... which is new model resource location... which is a new resource location... goddamnit boilerplate code!
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("registered renderer for "+item.getUnlocalizedName().substring(5));
	}

}
