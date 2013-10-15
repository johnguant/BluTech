package com.johnguant.blutech.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockOre extends Block {
	
	// Defines BlockOre
	public BlockOre(int par1, Material material){
		super(par1, material);
		setHardness(4.0F);
	}
	
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == Block.oreCoal.blockID ? Item.coal.itemID : (this.blockID == Block.oreDiamond.blockID ? Item.diamond.itemID : (this.blockID == Block.oreLapis.blockID ? Item.dyePowder.itemID : (this.blockID == Block.oreEmerald.blockID ? Item.emerald.itemID : (this.blockID == Block.oreNetherQuartz.blockID ? Item.netherQuartz.itemID : this.blockID))));
    }

}
