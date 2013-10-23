package com.johnguant.blutech.block;

import com.johnguant.blutech.BluTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockLeadOre extends Block {
	
	public BlockLeadOre(int id){
		super(id, Material.rock);
		setHardness(3.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("leadOre");
		setCreativeTab(BluTech.tabsBluTech);
		textureName = "leadOre";
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("blutech:"
				+ (this.getUnlocalizedName().substring(5)));
	}

}
