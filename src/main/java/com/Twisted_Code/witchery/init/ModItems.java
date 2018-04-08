package com.Twisted_Code.witchery.init;

import com.Twisted_Code.witchery.Reference;
import com.Twisted_Code.witchery.items.*;
import com.Twisted_Code.witchery.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item Mutandis;
	public static Item ClayJar;
	public static Item IngredientExhale;
	public static Item MandrakeRoot;
	public static Item WoodAsh;
	
	public static void init(){
		Mutandis = new ItemMutandis					("mutandis", "mutandis");
		ClayJar = new ItemClayJar					("clayjar", "clayjar");
		IngredientExhale = new ItemIngredientExhale	("ingredientexhale", "ingredientexhale");
		MandrakeRoot = new ItemMandrakeRoot			("mandrakeroot", "mandrakeroot");
		WoodAsh = new ItemWoodAsh					("woodash", "woodash");
	}

	public static void register(){
		//as this list gets longer, it may be worth considering a for loop "for I in itemarray: registerItem(I)"
		registerItem(Mutandis);
		registerItem(ClayJar);
		registerItem(IngredientExhale);
		registerItem(MandrakeRoot);
		registerItem(WoodAsh);
	}

	public static void registerRenders(){
		registerRender(Mutandis);
		registerRender(ClayJar);
		registerRender(IngredientExhale);
		registerRender(MandrakeRoot);
		registerRender(WoodAsh);
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
