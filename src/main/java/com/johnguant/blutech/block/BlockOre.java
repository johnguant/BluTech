/*******************************************************************************
 * This file is part of BluTech.
 *
 * BluTech is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BluTech is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with BluTech.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

package com.johnguant.blutech.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;

import com.johnguant.blutech.BluTech;
import com.johnguant.blutech.item.BluItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOre extends Block {

	// Defines BlockOre
	public BlockOre() {
		super(Material.rock);
		setCreativeTab(BluTech.tabsBluTech);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("blutech:"
                + (this.getUnlocalizedName().substring(5)));
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return this == BluBlocks.bluOre ? BluItems.bluDust : (this == BluBlocks.fossilOre ? Items.bone : Item.getItemFromBlock(this) );
	}
	
		/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random) {
		return this == BluBlocks.bluOre ? 4 + par1Random.nextInt(2) : this == BluBlocks.fossilOre ? 2 + par1Random.nextInt(4) : 1;
	}
	
	
}


