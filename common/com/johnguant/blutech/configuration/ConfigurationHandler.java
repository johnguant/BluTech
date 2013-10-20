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

			ItemIds.BLUDUST_ID = config.getItem(Strings.BLUDUST_NAME,
					ItemIds.BLUDUST_ID_DEFAULT).getInt(
					ItemIds.BLUDUST_ID_DEFAULT);

			ItemIds.BLUINGOT_ID = config.getItem(Strings.BLUINGOT_NAME,
					ItemIds.BLUINGOT_ID_DEFAULT).getInt(
					ItemIds.BLUINGOT_ID_DEFAULT);

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID
					+ "Has a problem loading the config file");
		} finally {
			config.save();
		}
	}

}
