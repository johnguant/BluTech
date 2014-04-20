package com.johnguant.blutech.block;

import java.util.Random;

import com.johnguant.blutech.BluTech;
import com.johnguant.blutech.item.BluItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class BlockTree extends Block {

public BlockTree(int id) {
	super(id, Material.wood);
	setCreativeTab(BluTech.tabsBluTech);
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister) {
	this.blockIcon = iconRegister.registerIcon("blutech:"
			+ (this.getUnlocalizedName().substring(5)));
}

/**
 * Returns the ID of the items to drop on destruction.
 */
public int idDropped(int par1, Random par2Random, int par3) {
	return this.blockID == BluBlocks.bluLeaves.blockID ? BluItems.bluDust.itemID : this.blockID;
}

	/**
 * Returns the quantity of items to drop on block destruction.
 */
public int quantityDropped(Random par1Random) {
	return this.blockID == BluBlocks.bluLeaves.blockID ? 0 + par1Random.nextInt(1) : this.blockID;
}


}
