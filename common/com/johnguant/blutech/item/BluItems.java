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

import com.johnguant.blutech.lib.ItemIds;
import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class BluItems {
	
	public static Item bluDust;
	public static Item bluAlloyIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item aluminiumIngot;
	public static Item leadIngot;	
	public static Item steelIngot;
	public static Item silverIngot;
	public static Item tungstenIngot;
	public static Item nickelIngot;
	public static Item rembonite;
	public static Item energizedIngot;
	public static Item eridian;	
	
	public static Item cocusTablet;
	public static Item headron;
	public static Item dpu;
	
	public static Item stoneBrick;
	public static Item ironBrick;
	public static Item goldBrick;
	public static Item diamondBrick;
	public static Item remboniteBrick;
	
	public static Item ironNugget;
	public static Item diamondNugget;
	public static Item remboniteNugget;
	
	public static Item bluAlloyBlend;
	public static Item eridianBlend;
	public static Item energizedBlend;
	

	public static void init() {
		bluDust = new ItemDust(ItemIds.BLUDUST_ID);
		GameRegistry.registerItem(bluDust, Strings.BLUDUST_NAME);
		OreDictionary.registerOre("dustBlu", new ItemStack(bluDust));
		bluAlloyIngot = new ItemIngot(ItemIds.BLUINGOT_ID)
				.setUnlocalizedName("bluAlloyIngot");
		GameRegistry.registerItem(bluAlloyIngot, Strings.BLUINGOT_NAME);
		OreDictionary.registerOre("ingotBluAlloy", new ItemStack(bluAlloyIngot));
		aluminiumIngot = new ItemIngot(ItemIds.ALUMINIUMINGOT_ID)
				.setUnlocalizedName("aluminiumIngot");
		GameRegistry.registerItem(aluminiumIngot, Strings.ALUMINIUMORE_NAME);
		OreDictionary.registerOre("ingotAluminium", new ItemStack(aluminiumIngot));
		leadIngot = new ItemIngot(ItemIds.LEADINGOT_ID)
				.setUnlocalizedName("leadIngot");
		GameRegistry.registerItem(leadIngot, Strings.LEADINGOT_NAME);
		OreDictionary.registerOre("ingotlead", new ItemStack(leadIngot));
		copperIngot = new ItemIngot(ItemIds.COPPERINGOT_ID)
				.setUnlocalizedName("copperIngot");
		GameRegistry.registerItem(copperIngot, Strings.COPPERINGOT_NAME);
		OreDictionary.registerOre("ingotCopper", new ItemStack(copperIngot));

		tinIngot = new ItemIngot(ItemIds.TININGOT_ID)
				.setUnlocalizedName("tinIngot");
		GameRegistry.registerItem(tinIngot, Strings.TININGOT_NAME);
		OreDictionary.registerOre("ingotTin", new ItemStack(tinIngot));
		rembonite = new ItemRemboniteGem(ItemIds.REMBONITE_ID)
				.setUnlocalizedName("rembonite");
		GameRegistry.registerItem(rembonite, Strings.REMBONITE_NAME);
		OreDictionary.registerOre("gemRembonite", new ItemStack(rembonite));		
		eridian = new ItemIngot(ItemIds.ERIDIAN_ID)
				.setUnlocalizedName("eridian");
		GameRegistry.registerItem(eridian, Strings.ERIDIAN_NAME);
		OreDictionary.registerOre("ingotEridian", new ItemStack(eridian));	
		energizedIngot = new ItemIngot(ItemIds.ENERGIZEDINGOT_ID)
				.setUnlocalizedName("energizedIngot");
		GameRegistry.registerItem(energizedIngot, Strings.ENERGIZEDINGOT_NAME);
		OreDictionary.registerOre("ingotEnergized", new ItemStack(energizedIngot));		
		steelIngot = new ItemIngot(ItemIds.STEELINGOT_ID)
				.setUnlocalizedName("steelIngot");
		GameRegistry.registerItem(steelIngot, Strings.STEELINGOT_NAME);
		OreDictionary.registerOre("ingotSteel", new ItemStack(steelIngot));		
		silverIngot = new ItemIngot(ItemIds.SILVERINGOT_ID)
				.setUnlocalizedName("silverIngot");
		GameRegistry.registerItem(silverIngot, Strings.SILVERINGOT_NAME);
		OreDictionary.registerOre("ingotSilver", new ItemStack(silverIngot));		
		tungstenIngot = new ItemIngot(ItemIds.TUNGSTENINGOT_ID)
				.setUnlocalizedName("tungstenIngot");
		GameRegistry.registerItem(tungstenIngot, Strings.TUGNSTENINGOT_NAME);
		OreDictionary.registerOre("ingotTungsten", new ItemStack(tungstenIngot));		
		nickelIngot = new ItemIngot(ItemIds.NICKELINGOT_ID)
				.setUnlocalizedName("nickelIngot");
		GameRegistry.registerItem(nickelIngot, Strings.NICKELINGOT_NAME);
		OreDictionary.registerOre("ingotNickel", new ItemStack(nickelIngot));
		
		
		cocusTablet = new ItemTablet(ItemIds.COCUSTABLET_ID)
				.setUnlocalizedName("cocusTablet");
		GameRegistry.registerItem(cocusTablet, Strings.COCUSTABLET_NAME);
		headron = new ItemHeadron(ItemIds.HEADRON_ID)
				.setUnlocalizedName("headron");
		GameRegistry.registerItem(headron, Strings.HEADRON_NAME);
		OreDictionary.registerOre("orbHeadron", new ItemStack(headron));
		dpu = new ItemDimPos(ItemIds.DPU_ID)
				.setUnlocalizedName("dimPosUnit");
		GameRegistry.registerItem(dpu, Strings.DPU_NAME);
		
		
		stoneBrick = new ItemIngot(ItemIds.STONEBRICK_ID)
				.setUnlocalizedName("stoneBrick");
		GameRegistry.registerItem(stoneBrick, Strings.STONEBRICK_NAME);
		ironBrick = new ItemIngot(ItemIds.IRONBRICK_ID)
				.setUnlocalizedName("ironBrick");
		GameRegistry.registerItem(ironBrick, Strings.IRONBRICK_NAME);		
		goldBrick = new ItemIngot(ItemIds.GOLDBRICK_ID)
				.setUnlocalizedName("goldBrick");
		GameRegistry.registerItem(goldBrick, Strings.GOLDBRICK_NAME);		
		diamondBrick = new ItemIngot(ItemIds.DIAMONDBRICK_ID)
				.setUnlocalizedName("diamondBrick");
		GameRegistry.registerItem(diamondBrick, Strings.DIAMONDBRICK_NAME);		
		remboniteBrick = new ItemIngot(ItemIds.REMBONITEBRICK_ID)
				.setUnlocalizedName("remboniteBrick");
		GameRegistry.registerItem(remboniteBrick, Strings.REMBONITEBRICK_NAME);
		
		
		ironNugget = new ItemIngot(ItemIds.IRONNUGGET_ID)
				.setUnlocalizedName("ironNugget");
		GameRegistry.registerItem(ironNugget, Strings.IRONNUGGET_NAME);
		OreDictionary.registerOre("nuggetIron", new ItemStack(ironNugget));
		diamondNugget = new ItemIngot(ItemIds.DIAMONDNUGGET_ID)
				.setUnlocalizedName("diamondNugget");
		GameRegistry.registerItem(diamondNugget, Strings.DIAMONDNUGGET_NAME);
		OreDictionary.registerOre("nuggetDiamond", new ItemStack(diamondNugget));
		remboniteNugget = new ItemIngot(ItemIds.REMBONITENUGGET_ID)
				.setUnlocalizedName("remboniteNugget");
		GameRegistry.registerItem(remboniteNugget, Strings.REMBONITENUGGET_NAME);
		OreDictionary.registerOre("nuggetRembonite", new ItemStack(remboniteNugget));
		
		bluAlloyBlend = new ItemDust(ItemIds.BLUALLOYBLEND_ID)
				.setUnlocalizedName("bluAlloyBlend");
		GameRegistry.registerItem(bluAlloyBlend, Strings.BLUALLOYBLEND_NAME);
		OreDictionary.registerOre("blendBluAlloy", new ItemStack(bluAlloyBlend));
		energizedBlend = new ItemDust(ItemIds.ENERGIZEDBLEND_ID)
				.setUnlocalizedName("energizedBlend");
		GameRegistry.registerItem(energizedBlend, Strings.ENERGIZEDBLEND_NAME);
		OreDictionary.registerOre("blendEnergized", new ItemStack(energizedBlend));
		eridianBlend = new ItemDust(ItemIds.ERIDIANBLEND_ID)
				.setUnlocalizedName("eridianBlend");
		GameRegistry.registerItem(eridianBlend, Strings.ERIDIANBLEND_NAME);
		OreDictionary.registerOre("blendEridian", new ItemStack(eridianBlend));
					
	}

	private static void setUnlocalizedName(String string) {
		// TODO Auto-generated method stub
		
	}

}
