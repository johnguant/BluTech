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

import net.minecraftforge.common.Configuration;

import com.johnguant.blutech.lib.BlockIds;
import com.johnguant.blutech.lib.ItemIds;
import com.johnguant.blutech.lib.Reference;
import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	public static Configuration config;

	public static void init(File file) {
		config = new Configuration(file);

		try {
			config.load();

			BlockIds.BLUORE_ID = config.getBlock(Strings.BLUORE_NAME,
					BlockIds.BLUORE_ID_DEFAULT).getInt(
					BlockIds.BLUORE_ID_DEFAULT);
			
			BlockIds.ALUMINIUMORE_ID = config.getBlock(Strings.ALUMINIUMORE_NAME,
					BlockIds.ALUMINIUMORE_ID_DEFAULT).getInt(
					BlockIds.ALUMINIUMORE_ID_DEFAULT);

			BlockIds.COPPERORE_ID = config.getBlock(Strings.COPPERORE_NAME,
					BlockIds.COPPERORE_ID_DEFAULT).getInt(
					BlockIds.COPPERORE_ID_DEFAULT);
			
			BlockIds.TINORE_ID = config.getBlock(Strings.TINORE_NAME,
					BlockIds.TINORE_ID_DEFAULT).getInt(
					BlockIds.TINORE_ID_DEFAULT);
			
			BlockIds.LEADORE_ID = config.getBlock(Strings.LEADORE_NAME,
					BlockIds.LEADORE_ID_DEFAULT).getInt(
					BlockIds.LEADORE_ID_DEFAULT);
			
			BlockIds.RHODIUMORE_ID = config.getBlock(Strings.RHODIUMORE_NAME,
					BlockIds.RHODIUMORE_ID_DEFAULT).getInt(
					BlockIds.RHODIUMORE_ID_DEFAULT);
			
			BlockIds.REMBONITEORE_ID = config.getBlock(Strings.REMBONITEORE_NAME,
					BlockIds.REMBONITEORE_ID_DEFAULT).getInt(
					BlockIds.REMBONITEORE_ID_DEFAULT);
			
			BlockIds.SILVERORE_ID = config.getBlock(Strings.SILVERORE_NAME,
					BlockIds.SILVERORE_ID_DEFAULT).getInt(
					BlockIds.SILVERORE_ID_DEFAULT);
			
			ItemIds.BLUDUST_ID = config.getItem(Strings.BLUDUST_NAME,
					ItemIds.BLUDUST_ID_DEFAULT).getInt(
					ItemIds.BLUDUST_ID_DEFAULT);
			
			ItemIds.BLUINGOT_ID = config.getItem(Strings.BLUINGOT_NAME,
					ItemIds.BLUINGOT_ID_DEFAULT).getInt(
					ItemIds.BLUINGOT_ID_DEFAULT);
			
			ItemIds.ALUMINIUMINGOT_ID = config.getItem(Strings.ALUMINIUMINGOT_NAME,
					ItemIds.ALUMINIUMINGOT_ID_DEFAULT).getInt(
					ItemIds.ALUMINIUMINGOT_ID_DEFAULT);
			
			ItemIds.LEADINGOT_ID = config.getItem(Strings.LEADINGOT_NAME,
					ItemIds.LEADINGOT_ID_DEFAULT).getInt(
					ItemIds.LEADINGOT_ID_DEFAULT);
			
			ItemIds.COPPERINGOT_ID = config.getItem(Strings.COPPERINGOT_NAME,
					ItemIds.COPPERINGOT_ID_DEFAULT).getInt(
					ItemIds.COPPERINGOT_ID_DEFAULT);
			
			ItemIds.TININGOT_ID = config.getItem(Strings.TININGOT_NAME,
					ItemIds.TININGOT_ID_DEFAULT).getInt(
					ItemIds.TININGOT_ID_DEFAULT);
			
			ItemIds.REMBONITE_ID = config.getItem(Strings.REMBONITE_NAME,
					ItemIds.REMBONITE_ID_DEFAULT).getInt(
					ItemIds.REMBONITE_ID_DEFAULT);
			
			ItemIds.ERIDIAN_ID = config.getItem(Strings.ERIDIAN_NAME,
					ItemIds.ERIDIAN_ID_DEFAULT).getInt(
					ItemIds.ERIDIAN_ID_DEFAULT);
			
			ItemIds.HEADRON_ID = config.getItem(Strings.HEADRON_NAME,
					ItemIds.HEADRON_ID_DEFAULT).getInt(
					ItemIds.HEADRON_ID_DEFAULT);
					
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID
					+ "Has a problem loading the config file");
		} finally {
			config.save();
		}
	}

}
