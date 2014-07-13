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

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

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
		if (config == null) {
            config = new Configuration(file);
            loadConfiguration();
        }
	}

    @SubscribeEvent

    public static void loadConfiguration() {
        tinGenerationEnabled = config.getBoolean("tinGeneration", "oreGeneration", true, "Tin Ore Generation");
        copperGenerationEnabled = config.getBoolean("copperGeneration", "oreGeneration", true, "Copper Ore Generation");
        silverGenerationEnabled = config.getBoolean("silverGeneration", "oreGeneration", true, "Silver Ore Generation");
        leadGenerationEnabled = config.getBoolean("leadGeneration", "oreGeneration", true, "Lead Ore Generation");
        bluOreGenerationEnabled = config.getBoolean("bluOreGeneration", "oreGeneration", true, "BluOre Ore Generation");
        rhodiumGenerationEnabled = config.getBoolean("rhodiumGeneration", "oreGeneration", true, "Rhodium Ore Generation");
        fossilOreGenerationEnabled = config.getBoolean("fossilOreGeneration", "oreGeneration", true, "Fossil Ore Generation");
        aluminiumGenerationEnabled = config.getBoolean("aluminiumGeneration", "oreGeneration", true, "Aluminium Ore Generation");
        nickelGenerationEnabled = config.getBoolean("nickelGeneration", "oreGeneration", true, "Nickel Ore Generation");
        tungstenGenerationEnabled = config.getBoolean("tungstenGeneration", "oreGeneration", true, "Tungsten Ore Generation");
        abyssStoneGenerationEnabled = config.getBoolean("abyssStoneGeneration", "oreGeneration", true, "Abyss Stone Generation");
        remboniteGenerationEnabled = config.getBoolean("remboniteGeneration", "oreGeneration", true, "Rembonite Ore Generation");

        if (config.hasChanged()) {
            config.save();
        }
    }

}
