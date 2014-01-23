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

	public static Item bluAlloyIngot;
	public static Item bluDust;
	public static Item aluminiumIngot;
	public static Item leadIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item rembonite;
	public static Item eridian;
	public static Item headron;
	public static Item steelIngot;
	public static Item silverIngot;

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

		rembonite = new ItemRemboniteGem(ItemIds.REMBONITE_ID);
		GameRegistry.registerItem(rembonite, Strings.REMBONITE_NAME);
		OreDictionary.registerOre("gemRembonite", new ItemStack(rembonite));
		
		eridian = new ItemIngot(ItemIds.ERIDIAN_ID)
			.setUnlocalizedName("aeridium");
		GameRegistry.registerItem(eridian, Strings.ERIDIAN_NAME);
		OreDictionary.registerOre("ingotEridian", new ItemStack(eridian));
		
		headron = new ItemHeadron(ItemIds.HEADRON_ID)
				.setUnlocalizedName("headron");
		GameRegistry.registerItem(headron, Strings.HEADRON_NAME);
		OreDictionary.registerOre("orbHeadron", new ItemStack(headron));
		
		steelIngot = new ItemIngot(ItemIds.STEELINGOT_ID)
				.setUnlocalizedName("steelIngot");
		GameRegistry.registerItem(steelIngot, Strings.STEELINGOT_NAME);
		OreDictionary.registerOre("ingotSteel", new ItemStack(steelIngot));
		
		silverIngot = new ItemIngot(ItemIds.SILVERINGOT_ID)
				.setUnlocalizedName("silverIngot");
		GameRegistry.registerItem(silverIngot, Strings.SILVERINGOT_NAME);
		OreDictionary.registerOre("ingotSilver", new ItemStack(silverIngot));
						
	}

}
