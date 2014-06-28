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

package com.johnguant.blutech.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.config.Configuration;

import com.johnguant.blutech.lib.BlockIds;
import com.johnguant.blutech.lib.ItemIds;
import com.johnguant.blutech.lib.Reference;
import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {


	public static Configuration config;
	public static boolean tinGenerationEnabled = true;
	public static boolean copperGenerationEnabled = true;
	public static boolean silverGenerationEnabled = true;
	public static boolean leadGenerationEnabled = true;
	public static boolean bluOreGenerationEnabled = true;
	public static boolean rhodiumGenerationEnabled = true;
	public static boolean fossilOreGenerationEnabled = true;
	public static boolean aluminiumGenerationEnabled = true;
	public static boolean nickelGenerationEnabled = true;
	public static boolean tungstenGenerationEnabled = true;
	public static boolean abyssStoneGenerationEnabled = true;
	public static boolean remboniteGenerationEnabled = true;
	

	public static void init(File file) {
		config = new Configuration(file);

		try {
			config.load();
			
			//boolean bluOre = config.get("Worldgen Disabler", "Generate Copper", true).getBoolean(true);
			
								
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID
					+ "Has a problem loading the config file");
		} finally {
			config.save();
		}
	}

}
