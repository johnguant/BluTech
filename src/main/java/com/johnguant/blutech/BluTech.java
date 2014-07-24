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

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BluTech {

	@Instance(Reference.MOD_ID)
	public static BluTech instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static CreativeTabs tabsBluTech = new CreativeTabBluTech(
			CreativeTabs.getNextID(), Reference.MOD_ID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init((event.getSuggestedConfigurationFile()));
		BluItems.init();
		BluBlocks.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		
		//Example 1:				ItemStack dirtStack 		= new ItemStack(Block.dirt);
        //Example 2:				ItemStack diamondsStack 	= new ItemStack(Item.diamond, 64);
        ItemStack copperStack 		= new ItemStack(BluItems.copperIngot, 1);
        ItemStack tinStack 			= new ItemStack(BluItems.tinIngot, 1);
        ItemStack leadStack 		= new ItemStack(BluItems.leadIngot, 1);
        ItemStack silverStack		= new ItemStack(BluItems.silverIngot, 1);
        ItemStack cocusStack		= new ItemStack(BluItems.cocusTablet, 1);
        ItemStack beefStack			= new ItemStack(Items.beef, 1);
        ItemStack porkStack			= new ItemStack(Items.porkchop, 1);
        ItemStack potatoStack		= new ItemStack(Items.potato, 1);
        ItemStack chickenStack		= new ItemStack(Items.chicken, 1);
        ItemStack fishStack			= new ItemStack(Items.fish, 1);
        ItemStack cookedCStack		= new ItemStack(Items.cooked_chicken, 1);
        ItemStack cookedPStack		= new ItemStack(Items.cooked_porkchop, 1);
        ItemStack cookedBStack		= new ItemStack(Items.cooked_beef, 1);
        ItemStack bakedStack		= new ItemStack(Items.baked_potato, 1);
        ItemStack cookedFStack		= new ItemStack(Items.cooked_fished, 1);
        ItemStack coalStack			= new ItemStack(Items.coal, 1);
        ItemStack eridianStack 		= new ItemStack(BluItems.eridian, 1);
        ItemStack blualloyStack		= new ItemStack(BluItems.bluAlloyIngot, 1);
        ItemStack diamondStack		= new ItemStack(Items.diamond, 1);
        ItemStack ironStack			= new ItemStack(Items.iron_ingot, 1);
        ItemStack stoneStack		= new ItemStack(Blocks.stone, 1);
        ItemStack stoneBrickStack	= new ItemStack(BluItems.stoneBrick, 1);
        ItemStack nuggetIStack		= new ItemStack(BluItems.ironNugget, 9);
        ItemStack nuggetDStack		= new ItemStack(BluItems.diamondNugget, 9);

        		
		
        //Example Shaped:		GameRegistry.addRecipe(diamondStack, new Object[] { "DDD", "DDD", "DDD", 'D', Block.dirt }); Makes a diamond from a grid full of dirt
        //Example Complex:		GameRegistry.addRecipe(new ItemStack(Block.whiteStone, 64), new Object[] { "W $", " S ", "s E", 'W', new ItemStack(Block.wood, 1, 2),
        								//'$', Item.stick, 'S', Block.sand, 's', Block.sapling, 'E', Item.enderPearl });
		//Example Shapeless:	GameRegistry.addShapelessRecipe(diamondsStack, dirtStack); Makes diamonds from dirt
		//Example Smelting:  	GameRegistry.addSmelting(Block.dirt.blockID, diamondsStack, 0.7f); Smelts diamonds to dirt
                
        //Shaped Recipes:
        
        GameRegistry.addRecipe(diamondStack, new Object[] { "DDD", "DDD", "DDD", 'D', BluItems.diamondNugget});
        GameRegistry.addRecipe(ironStack, new Object[] { "DDD", "DDD", "DDD", 'D', BluItems.ironNugget});
        GameRegistry.addRecipe(stoneBrickStack, new Object[] { "D", 'D', Blocks.stonebrick});
                
        //Complex Recipies:
                
        GameRegistry.addRecipe(cocusStack, new Object[] { "D D", " F ", "D D",
        		'D', Items.iron_ingot, 'F', Blocks.furnace});
        
        //Shapeless Recipes:
        GameRegistry.addShapelessRecipe(bakedStack, potatoStack, cocusStack);				//Potato Cooking WIP
        GameRegistry.addShapelessRecipe(cookedCStack, chickenStack, cocusStack);			//Chicken Cooking WIP
        GameRegistry.addShapelessRecipe(cookedBStack, beefStack, cocusStack);				//Beef Cooking WIP
        GameRegistry.addShapelessRecipe(cookedPStack, porkStack, cocusStack);				//Pork Cooking WIP
        GameRegistry.addShapelessRecipe(cookedFStack, fishStack, cocusStack);				//Fish Cooking WIP
        GameRegistry.addShapelessRecipe(cocusStack, coalStack, cocusStack);					//Cocus Tablet Refueling. WIP.
        GameRegistry.addShapelessRecipe(nuggetIStack, ironStack);							//Iron Nuggets
        GameRegistry.addShapelessRecipe(nuggetDStack, diamondStack);						//Diamond Nuggets
        
        //Smelting Recipes:
		GameRegistry.addSmelting(BluBlocks.copperOre, copperStack, 0.5f);			//Copper Smelting
		GameRegistry.addSmelting(BluBlocks.tinOre, tinStack, 0.5f);					//Tin Smelting
		GameRegistry.addSmelting(BluBlocks.leadOre, leadStack, 0.7f);				//Lead Smelting
		GameRegistry.addSmelting(BluBlocks.silverOre, silverStack, 1.0f);			//Silver Smelting
		
		
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
