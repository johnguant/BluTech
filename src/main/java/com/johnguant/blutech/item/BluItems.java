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

package com.johnguant.blutech.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class BluItems {
	
	public static Item bluDust;
	public static Item bluAlloyIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item leadIngot;
	public static Item silverIngot;
	public static Item eridian;	
	
	public static Item cocusTablet;
	
	public static Item stoneBrick;
	public static Item ironBrick;
	public static Item goldBrick;
	public static Item diamondBrick;

	public static Item ironNugget;
	public static Item diamondNugget;

	public static void init() {
		bluDust = new ItemDust();
		GameRegistry.registerItem(bluDust, Strings.BLUDUST_NAME);
		OreDictionary.registerOre("dustBlu", new ItemStack(bluDust));

		bluAlloyIngot = new ItemIngot()
				.setUnlocalizedName("bluAlloyIngot");
		GameRegistry.registerItem(bluAlloyIngot, Strings.BLUINGOT_NAME);
		OreDictionary.registerOre("ingotBluAlloy", new ItemStack(bluAlloyIngot));

		leadIngot = new ItemIngot()
				.setUnlocalizedName("leadIngot");
		GameRegistry.registerItem(leadIngot, Strings.LEADINGOT_NAME);
		OreDictionary.registerOre("ingotlead", new ItemStack(leadIngot));

		copperIngot = new ItemIngot()
				.setUnlocalizedName("copperIngot");
		GameRegistry.registerItem(copperIngot, Strings.COPPERINGOT_NAME);
		OreDictionary.registerOre("ingotCopper", new ItemStack(copperIngot));

		tinIngot = new ItemIngot()
				.setUnlocalizedName("tinIngot");
		GameRegistry.registerItem(tinIngot, Strings.TININGOT_NAME);
		OreDictionary.registerOre("ingotTin", new ItemStack(tinIngot));

		eridian = new ItemIngot()
				.setUnlocalizedName("eridian");
		GameRegistry.registerItem(eridian, Strings.ERIDIAN_NAME);
		OreDictionary.registerOre("ingotEridian", new ItemStack(eridian));	

		silverIngot = new ItemIngot()
				.setUnlocalizedName("silverIngot");
		GameRegistry.registerItem(silverIngot, Strings.SILVERINGOT_NAME);
		OreDictionary.registerOre("ingotSilver", new ItemStack(silverIngot));		

		cocusTablet = new ItemTablet()
				.setUnlocalizedName("cocusTablet");
		GameRegistry.registerItem(cocusTablet, Strings.COCUSTABLET_NAME);

		stoneBrick = new ItemIngot()
				.setUnlocalizedName("stoneBrick");
		GameRegistry.registerItem(stoneBrick, Strings.STONEBRICK_NAME);

		ironBrick = new ItemIngot()
				.setUnlocalizedName("ironBrick");
		GameRegistry.registerItem(ironBrick, Strings.IRONBRICK_NAME);

		goldBrick = new ItemIngot()
				.setUnlocalizedName("goldBrick");
		GameRegistry.registerItem(goldBrick, Strings.GOLDBRICK_NAME);

		diamondBrick = new ItemIngot()
				.setUnlocalizedName("diamondBrick");
		GameRegistry.registerItem(diamondBrick, Strings.DIAMONDBRICK_NAME);
		
		ironNugget = new ItemIngot()
				.setUnlocalizedName("ironNugget");
		GameRegistry.registerItem(ironNugget, Strings.IRONNUGGET_NAME);
		OreDictionary.registerOre("nuggetIron", new ItemStack(ironNugget));

		diamondNugget = new ItemIngot()
				.setUnlocalizedName("diamondNugget");
		GameRegistry.registerItem(diamondNugget, Strings.DIAMONDNUGGET_NAME);
		OreDictionary.registerOre("nuggetDiamond", new ItemStack(diamondNugget));

	}

	private static void setUnlocalizedName(String string) {
		// TODO Auto-generated method stub
		
	}

}
