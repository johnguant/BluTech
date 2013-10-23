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

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

import com.johnguant.blutech.lib.BlockIds;
import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class BluBlocks {

	public static Block bluOre;
	public static Block aluminiumOre;
	public static Block copperOre;
	public static Block tinOre;
	public static Block leadOre;
	
	public static void init() {
		bluOre = new BlockOre(BlockIds.BLUORE_ID);
		GameRegistry.registerBlock(bluOre, Strings.BLUORE_NAME);
		MinecraftForge.setBlockHarvestLevel(bluOre, "pickaxe", 2);
		OreDictionary.registerOre("oreBlu", new ItemStack(bluOre));
		
		aluminiumOre = new BlockAluminiumOre(BlockIds.ALUMINIUMORE_ID);
		GameRegistry.registerBlock(aluminiumOre, "aluminiumOre");
		MinecraftForge.setBlockHarvestLevel(aluminiumOre, "pickaxe", 1);
		OreDictionary.registerOre("oreAluminium", new ItemStack(aluminiumOre));
		
		copperOre = new BlockCopperOre(BlockIds.COPPERORE_ID);
		GameRegistry.registerBlock(copperOre, "copperOre");
		MinecraftForge.setBlockHarvestLevel(copperOre, "pickaxe", 1);
		OreDictionary.registerOre("oreCopper", new ItemStack(copperOre));
		
		tinOre = new BlockTinOre(BlockIds.TINORE_ID);
		GameRegistry.registerBlock(tinOre, "tinOre");
		MinecraftForge.setBlockHarvestLevel(tinOre, "pickaxe", 1);
		OreDictionary.registerOre("oreTin", new ItemStack(tinOre));
		
		leadOre = new BlockLeadOre(BlockIds.LEADORE_ID);
		GameRegistry.registerBlock(leadOre, "leadOre");
		MinecraftForge.setBlockHarvestLevel(leadOre, "pickaxe", 1);
		OreDictionary.registerOre("oreLead", new ItemStack(leadOre));
	}

}
