package com.johnguant.blutech.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOre extends Block {
	
	// Defines BlockOre
	public BlockOre(int par1, Material material){
		super(par1, material);
		setHardness(3.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("bluOre");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
    /**
     * Returns the ID of the items to drop on destruction.
     */

}
