/*
 *   This file is part of BluTech.
 *
 *  BluTech is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  BluTech is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with BluTech.  If not, see <http://www.gnu.org/licenses/>.
 *  
 */

package com.johnguant.blutech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

import com.johnguant.blutech.block.BlockOre;
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
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BluTech {
	
	public final static Block bluOre = new BlockOre(501, Material.rock);
	
	@Instance(Reference.MOD_ID)
	public static BluTech instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		LanguageRegistry.addName(bluOre, "Blu Ore");
		MinecraftForge.setBlockHarvestLevel(bluOre, "pickaxe", 2);
		GameRegistry.registerBlock(bluOre, "bluOre");

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
