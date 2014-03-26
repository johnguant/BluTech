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

package com.johnguant.blutech;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.johnguant.blutech.block.BluBlocks;
import com.johnguant.blutech.configuration.ConfigurationHandler;
import com.johnguant.blutech.creativetab.CreativeTabBluTech;
import com.johnguant.blutech.gen.OreGen;
import com.johnguant.blutech.item.BluItems;
import com.johnguant.blutech.lib.Reference;
import com.johnguant.blutech.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true)
public class BluTech {

	@Instance(Reference.MOD_ID)
	public static BluTech instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static CreativeTabs tabsBluTech = new CreativeTabBluTech(
			CreativeTabs.getNextID(), Reference.MOD_ID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory()
				.getAbsolutePath()
				+ File.separator
				+ Reference.MOD_ID
				+ File.separator + Reference.MOD_ID + ".cfg"));
		BluItems.init();
		BluBlocks.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		GameRegistry.registerWorldGenerator(new OreGen());
		
		//Example 1:				ItemStack dirtStack 		= new ItemStack(Block.dirt);
        //Example 2:				ItemStack diamondsStack 	= new ItemStack(Item.diamond, 64);
        ItemStack aluminiumStack 	= new ItemStack(BluItems.aluminiumIngot, 1);
        ItemStack copperStack 		= new ItemStack(BluItems.copperIngot, 1);
        ItemStack tinStack 			= new ItemStack(BluItems.tinIngot, 1);
        ItemStack leadStack 		= new ItemStack(BluItems.leadIngot, 1);
        ItemStack silverStack		= new ItemStack(BluItems.silverIngot, 1);
        ItemStack nickelStack		= new ItemStack(BluItems.nickelIngot,1);
        ItemStack tungstenStack		= new ItemStack(BluItems.tungstenIngot, 1);
        ItemStack cocusStack		= new ItemStack(BluItems.cocusTablet, 1);
        ItemStack beefStack			= new ItemStack(Item.beefRaw, 1);
        ItemStack porkStack			= new ItemStack(Item.porkRaw, 1);
        ItemStack potatoStack		= new ItemStack(Item.potato, 1);
        ItemStack chickenStack		= new ItemStack(Item.chickenRaw, 1);
        ItemStack fishStack			= new ItemStack(Item.fishRaw, 1);
        ItemStack cookedCStack		= new ItemStack(Item.chickenCooked, 1);
        ItemStack cookedPStack		= new ItemStack(Item.porkCooked, 1);
        ItemStack cookedBStack		= new ItemStack(Item.beefCooked, 1);
        ItemStack bakedStack		= new ItemStack(Item.bakedPotato, 1);
        ItemStack cookedFStack		= new ItemStack(Item.fishCooked, 1);
        ItemStack coalStack			= new ItemStack(Item.coal, 1);
        ItemStack eridianStack 		= new ItemStack(BluItems.eridian, 1);
        ItemStack blualloyStack		= new ItemStack(BluItems.bluAlloyIngot, 1);
        ItemStack remboniteStack	= new ItemStack(BluItems.rembonite, 1);
        ItemStack diamondStack		= new ItemStack(Item.diamond, 1);
        ItemStack ironStack			= new ItemStack(Item.ingotIron, 1);
        ItemStack stoneStack		= new ItemStack(Block.stone, 1);
        ItemStack stoneBrickStack	= new ItemStack(BluItems.stoneBrick, 1);
        ItemStack nuggetIStack		= new ItemStack(BluItems.ironNugget, 1);
        ItemStack nuggetDStack		= new ItemStack(BluItems.diamondNugget, 1);
        ItemStack nuggetRStack		= new ItemStack(BluItems.remboniteNugget, 1);
        		
        		
		
        //Example Shaped:
		//Example Shapeless:	GameRegistry.addShapelessRecipe(diamondsStack, dirtStack); Makes diamonds from dirt
		//Example Smelting:  	GameRegistry.addSmelting(Block.dirt.blockID, diamondsStack, 0.7f); Smelts diamonds to dirt
                
        //Shaped Recipes:
        
        //Shapeless Recipes:
        GameRegistry.addShapelessRecipe(bakedStack, potatoStack, cocusStack);				//Potato Cooking WIP
        GameRegistry.addShapelessRecipe(cookedCStack, chickenStack, cocusStack);			//Chicken Cooking WIP
        GameRegistry.addShapelessRecipe(cookedBStack, beefStack, cocusStack);				//Beef Cooking WIP
        GameRegistry.addShapelessRecipe(cookedPStack, porkStack, cocusStack);				//Pork Cooking WIP
        GameRegistry.addShapelessRecipe(cookedFStack, fishStack, cocusStack);				//Fish Cooking WIP
        GameRegistry.addShapelessRecipe(cocusStack, coalStack, cocusStack);					//Cocus Tablet Refueling. WIP.
        GameRegistry.addShapelessRecipe(stoneBrickStack, stoneStack, stoneStack);			//Crafting for stone brick. TODO Make it a shaped recipe
        GameRegistry.addShapelessRecipe(nuggetIStack, ironStack);							//Iron Nuggets
        GameRegistry.addShapelessRecipe(nuggetRStack, remboniteStack);						//Rembonite Nuggets
        GameRegistry.addShapelessRecipe(nuggetDStack, diamondStack);						//Diamond Nuggets
        
        //Smelting Recipes:
		GameRegistry.addSmelting(BluBlocks.aluminiumOre.blockID, aluminiumStack, 0.7f);		//Aluminium Smelting
		GameRegistry.addSmelting(BluBlocks.copperOre.blockID, copperStack, 0.5f);			//Copper Smelting
		GameRegistry.addSmelting(BluBlocks.tinOre.blockID, tinStack, 0.5f);					//Tin Smelting
		GameRegistry.addSmelting(BluBlocks.leadOre.blockID, leadStack, 0.7f);				//Lead Smelting
		GameRegistry.addSmelting(BluBlocks.silverOre.blockID, silverStack, 1.0f);			//Silver Smelting
		GameRegistry.addSmelting(BluBlocks.nickelOre.blockID, nickelStack, 0.5f);			//Nickel Smelting
		GameRegistry.addSmelting(BluBlocks.tungstenOre.blockID, tungstenStack, 1.0f);		//Tungsten Smelting
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
