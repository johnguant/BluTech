package com.johnguant.blutech.block;

import com.johnguant.blutech.BluTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockSilverOre extends Block {
	
	public BlockSilverOre(int id) {
		super(id, Material.rock);
		setHardness(3.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("silverOre");
		setCreativeTab(BluTech.tabsBluTech);
		textureName = "silverOre";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("blutech:"
				+ (this.getUnlocalizedName().substring(5)));
	}

}
