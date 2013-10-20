package com.johnguant.blutech.block;

import com.johnguant.blutech.BluTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAluminiumOre extends Block {
	
	public BlockAluminiumOre(int id) {
		super(id, Material.rock);
		setHardness(2.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("aluminiumOre");
		setCreativeTab(BluTech.tabsBluTech);
		textureName = "aluminiumOre";

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		this.blockIcon = iconRegister.registerIcon("blutech:"+ (this.getUnlocalizedName().substring(5)));
	}
	
}
