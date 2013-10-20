package com.johnguant.blutech.item;

import net.minecraft.item.Item;

import com.johnguant.blutech.lib.ItemIds;
import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class BluItems {

	public static Item bluAlloyIngot;
	public static Item bluDust;

	public static void init() {
		bluDust = new ItemDust(ItemIds.BLUDUST_ID);
		GameRegistry.registerItem(bluDust, Strings.BLUDUST_NAME);
		bluAlloyIngot = new ItemIngot(ItemIds.BLUINGOT_ID);
		GameRegistry.registerItem(bluAlloyIngot, Strings.BLUINGOT_NAME);

	}

}
