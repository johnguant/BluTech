package com.johnguant.blutech.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class BluItems {
	
	public static Item bluDust;
	
	public static void init(){
		bluDust = new ItemDust(1001);
		GameRegistry.registerItem(bluDust, "BluDust");
		
	}

}