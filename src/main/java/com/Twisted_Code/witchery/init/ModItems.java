package com.Twisted_Code.witchery.init;

import com.Twisted_Code.witchery.Reference;
import com.Twisted_Code.witchery.items.ItemMutandis;
import com.Twisted_Code.witchery.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item Mutandis;
	
	public static void init(){
		Mutandis = new ItemMutandis("mutandis", "mutandis");
	}

	public static void register(){
		registerItem(Mutandis);
	}

	public static void registerRenders(){
		registerRender(Mutandis);
	}
	public static void registerItem(Item item){
		GameRegistry.register(item);
		Utils.getLogger().info("registered item "+item.getUnlocalizedName().substring(5));
	}

	public static void registerRender(Item item){
		//tell modelloader where to find the model...
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("registered renderer for "+item.getUnlocalizedName().substring(5));
	}

}
