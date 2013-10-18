package com.johnguant.blutech.creativetab;

import com.johnguant.blutech.item.BluItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabBluTech extends CreativeTabs {

	public CreativeTabBluTech(int tabID, String tabLabel) {
		super(tabID, tabLabel);
		// TODO Auto-generated constructor stub
	}
	
	public int getTabIconItemIndex()
    {
        return BluItems.bluDust.itemID;
    }
	
	

}
