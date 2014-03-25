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
			
			BlockIds.FOSSILORE_ID = config.getBlock(Strings.FOSSILORE_NAME,
					BlockIds.FOSSILORE_ID_DEFAULT).getInt(
					BlockIds.FOSSILORE_ID_DEFAULT);
			
			BlockIds.TUNGSTENORE_ID = config.getBlock(Strings.TUNGSTENORE_NAME,
					BlockIds.TUNGSTENORE_ID_DEFAULT).getInt(
					BlockIds.TUNGSTENORE_ID_DEFAULT);
			
			BlockIds.NICKELORE_ID = config.getBlock(Strings.NICKELORE_NAME,
					BlockIds.NICKELORE_ID_DEFAULT).getInt(
					BlockIds.NICKELORE_ID_DEFAULT); 
			
			BlockIds.MACHINEBLOCK1_ID = config.getBlock(Strings.MACHINEBLOCK1_NAME,
					BlockIds.MACHINEBLOCK1_ID_DEFAULT).getInt(
					BlockIds.MACHINEBLOCK1_ID_DEFAULT);
			
			BlockIds.MACHINEBLOCK2_ID = config.getBlock(Strings.MACHINEBLOCK2_NAME,
					BlockIds.MACHINEBLOCK2_ID_DEFAULT).getInt(
					BlockIds.MACHINEBLOCK2_ID_DEFAULT);
			
			BlockIds.MACHINEBLOCK3_ID = config.getBlock(Strings.MACHINEBLOCK3_NAME,
					BlockIds.MACHINEBLOCK3_ID_DEFAULT).getInt(
					BlockIds.MACHINEBLOCK3_ID_DEFAULT);
			
			BlockIds.FURNACEIDLE_ID = config.getBlock(Strings.FURNACEIDLE_NAME,
					BlockIds.FURNACEIDLE_ID_DEFAULT).getInt(
					BlockIds.FURNACEIDLE_ID_DEFAULT);
			
			BlockIds.FURNACEACTIVE_ID = config.getBlock(Strings.FURNACEACTIVE_NAME,
					BlockIds.FURNACEACTIVE_ID_DEFAULT).getInt(
					BlockIds.FURNACEACTIVE_ID_DEFAULT);
			
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
			
			ItemIds.STEELINGOT_ID = config.getItem(Strings.STEELINGOT_NAME,
					ItemIds.STEELINGOT_ID_DEFAULT).getInt(
					ItemIds.STEELINGOT_ID_DEFAULT);
			
			ItemIds.SILVERINGOT_ID = config.getItem(Strings.SILVERINGOT_NAME,
					ItemIds.SILVERINGOT_ID_DEFAULT).getInt(
					ItemIds.SILVERINGOT_ID_DEFAULT);
			
			ItemIds.TUNGSTENINGOT_ID = config.getItem(Strings.TUGNSTENINGOT_NAME,
					ItemIds.TUNGSTENINGOT_ID_DEFAULT).getInt(
					ItemIds.TUNGSTENINGOT_ID_DEFAULT);
			
			ItemIds.NICKELINGOT_ID = config.getItem(Strings.NICKELINGOT_NAME,
					ItemIds.NICKELINGOT_ID_DEFAULT).getInt(
					ItemIds.NICKELINGOT_ID_DEFAULT);
			
			ItemIds.COCUSTABLET_ID = config.getItem(Strings.COCUSTABLET_NAME,
					ItemIds.COCUSTABLET_ID_DEFAULT).getInt(
					ItemIds.COCUSTABLET_ID_DEFAULT);
			
			ItemIds.IRONBRICK_ID = config.getItem(Strings.IRONBRICK_NAME,
					ItemIds.IRONBRICK_ID_DEFAULT).getInt(
					ItemIds.IRONBRICK_ID_DEFAULT);
			
			ItemIds.GOLDBRICK_ID = config.getItem(Strings.GOLDBRICK_NAME,
					ItemIds.GOLDBRICK_ID_DEFAULT).getInt(
					ItemIds.GOLDBRICK_ID_DEFAULT);
			
			ItemIds.DIAMONDBRICK_ID = config.getItem(Strings.DIAMONDBRICK_NAME,
					ItemIds.DIAMONDBCRICK_ID_DEFAULT).getInt(
					ItemIds.DIAMONDBCRICK_ID_DEFAULT);
			
			ItemIds.REMBONITEBRICK_ID = config.getItem(Strings.REMBONITEBRICK_NAME,
					ItemIds.REMBONITEBRICK_ID_DEFAULT).getInt(
					ItemIds.REMBONITEBRICK_ID_DEFAULT);
			
			ItemIds.STONEBRICK_ID = config.getItem(Strings.STONEBRICK_NAME,
					ItemIds.STONEBRICK_ID_DEFAULT).getInt(
					ItemIds.STONEBRICK_ID_DEFAULT);
			
			ItemIds.IRONNUGGET_ID = config.getItem(Strings.IRONNUGGET_NAME,
					ItemIds.IRONNUGGET_ID_DEFAULT).getInt(
					ItemIds.IRONNUGGET_ID_DEFAULT);
			
			ItemIds.DIAMONDNUGGET_ID = config.getItem(Strings.DIAMONDNUGGET_NAME,
					ItemIds.DIAMONDNUGGET_ID_DEFAULT).getInt(
					ItemIds.DIAMONDNUGGET_ID_DEFAULT);
			
			ItemIds.REMBONITENUGGET_ID = config.getItem(Strings.REMBONITENUGGET_NAME,
					ItemIds.REMBONITENUGGET_ID_DEFAULT).getInt(
					ItemIds.REMBONITENUGGET_ID_DEFAULT);
					
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID
					+ "Has a problem loading the config file");
		} finally {
			config.save();
		}
	}

}
