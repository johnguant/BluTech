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
        
		
		//Example Shapeless:	GameRegistry.addShapelessRecipe(diamondsStack, dirtStack);
		//Example Smelting:  	GameRegistry.addSmelting(Block.dirt.blockID, diamondsStack, 0.7f);
		GameRegistry.addSmelting(BluBlocks.aluminiumOre.blockID, aluminiumStack, 0.7f);
		GameRegistry.addSmelting(BluBlocks.copperOre.blockID, copperStack, 0.5f);
		GameRegistry.addSmelting(BluBlocks.tinOre.blockID, tinStack, 0.5f);
		GameRegistry.addSmelting(BluBlocks.leadOre.blockID, leadStack, 0.7f);	
		GameRegistry.addSmelting(BluBlocks.silverOre.blockID, silverStack, 1.0f);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
