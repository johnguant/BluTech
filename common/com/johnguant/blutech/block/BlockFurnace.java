package com.johnguant.blutech.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.johnguant.blutech.BluTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFurnace extends Block {
	
	public BlockFurnace(int id) {
		super(id, Material.rock);
		setCreativeTab(BluTech.tabsBluTech);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("blutech:"
				+ (this.getUnlocalizedName().substring(5)));
	}


}
