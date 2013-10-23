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

package com.johnguant.blutech.creativetab;

import net.minecraft.creativetab.CreativeTabs;

import com.johnguant.blutech.item.BluItems;

public class CreativeTabBluTech extends CreativeTabs {

	public CreativeTabBluTech(int tabID, String tabLabel) {
		super(tabID, tabLabel);
		// TODO Auto-generated constructor stub
	}
	
	public int getTabIconItemIndex()
    {
        return BluItems.bluDust.itemID;
    }
	
	

}
