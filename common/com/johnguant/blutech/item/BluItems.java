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

package com.johnguant.blutech.item;

import net.minecraft.item.Item;

import com.johnguant.blutech.lib.ItemIds;
import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class BluItems {

	public static Item bluAlloyIngot;
	public static Item bluDust;

	public static void init() {
		bluDust = new ItemDust(ItemIds.BLUDUST_ID);
		GameRegistry.registerItem(bluDust, Strings.BLUDUST_NAME);
		bluAlloyIngot = new ItemIngot(ItemIds.BLUINGOT_ID);
		GameRegistry.registerItem(bluAlloyIngot, Strings.BLUINGOT_NAME);

	}

}
