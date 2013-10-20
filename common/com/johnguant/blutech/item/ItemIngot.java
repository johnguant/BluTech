package com.johnguant.blutech.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.johnguant.blutech.BluTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIngot extends Item {

	public ItemIngot(int par1) 
	{
		super(par1);
		setUnlocalizedName("bluAlloyIngot");
		setCreativeTab(BluTech.tabsBluTech);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
	         this.itemIcon = iconRegister.registerIcon("blutech:" + (this.getUnlocalizedName().substring(5)));
	}
}
