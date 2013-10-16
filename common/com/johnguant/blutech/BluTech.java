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

import com.johnguant.blutech.block.BluBlocks;
import com.johnguant.blutech.gen.OreGen;
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
@NetworkMod(clientSideRequired=true)
public class BluTech {
	
	@Instance(Reference.MOD_ID)
	public static BluTech instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BluBlocks.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		GameRegistry.registerWorldGenerator(new OreGen());

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
