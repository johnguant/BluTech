package com.johnguant.blutech.block;

import com.johnguant.blutech.BluTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class Blocks extends Block {
	
	public Blocks() {
		super(Material.rock);
		setCreativeTab(BluTech.tabsBluTech);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("blutech:"
				+ (this.getUnlocalizedName().substring(5)));
	}

}
