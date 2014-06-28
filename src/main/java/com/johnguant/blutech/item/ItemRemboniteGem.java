package com.johnguant.blutech.item;

import com.johnguant.blutech.BluTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemRemboniteGem extends Item{
	
	public ItemRemboniteGem() {
		super();
		setCreativeTab(BluTech.tabsBluTech);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
	         this.itemIcon = iconRegister.registerIcon("blutech:" + (this.getUnlocalizedName().substring(5)));
	}

}
