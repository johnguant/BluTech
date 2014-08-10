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

package com.johnguant.blutech.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

import com.johnguant.blutech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class BluBlocks {

	public static Block bluOre;
	public static Block copperOre;
	public static Block tinOre;
	public static Block leadOre;
	public static Block silverOre;
	public static Block fossilOre;
	public static Block abyssStone;
	
	public static Block bluMachineChassis;

	public static Block alloyFurnaceIdle;//Needs to be re-introduced
	public static Block alloyFurnaceActive;//Needs to be re-introduced
    public static Block researchStation;
	
	public static void init() {
		bluOre = new BlockOre()
				.setHardness(3.0F)
				.setStepSound(Blocks.soundTypeStone)
				.setBlockName("bluOre");
        bluOre.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(bluOre, Strings.BLUORE_NAME);
		OreDictionary.registerOre("oreBlu", new ItemStack(bluOre));

		copperOre = new BlockOre()
				.setHardness(2.0F)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("copperOre");
        copperOre.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(copperOre, "copperOre");
		OreDictionary.registerOre("oreCopper", new ItemStack(copperOre));

		tinOre = new BlockOre()
				.setHardness(2.0F)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("tinOre");
        tinOre.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(tinOre, "tinOre");
		OreDictionary.registerOre("oreTin", new ItemStack(tinOre));

		leadOre = new BlockOre()
				.setHardness(3.0F)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("leadOre");
        leadOre.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(leadOre, "leadOre");
		OreDictionary.registerOre("oreLead", new ItemStack(leadOre));

		silverOre = new BlockOre()
				.setHardness(3.0F)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("silverOre");
        silverOre.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(silverOre, "silverOre");
		OreDictionary.registerOre("oreSilver", new ItemStack(silverOre));
		
		fossilOre = new BlockOre()
				.setHardness(2.0f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("fossilOre");
        fossilOre.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(fossilOre, "fossilOre");

		bluMachineChassis = new Blocks()
				.setHardness(2.5f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("bluMachineBlock");
        bluMachineChassis.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(bluMachineChassis, "bluMachineBlock");

		abyssStone = new Blocks()
				.setHardness(51.0f)
                .setStepSound(Block.soundTypeStone)
				.setBlockName("abyssStone");
        abyssStone.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(abyssStone, "abyssStone");

        alloyFurnaceActive = new BlockAlloyFurnace(true)
                .setHardness(2.5f)
                .setStepSound(Block.soundTypeStone)
                .setBlockName("alloyFurnaceActive");
        alloyFurnaceActive.setHarvestLevel("pickaxe", 1);
        GameRegistry.registerBlock(alloyFurnaceActive, "alloyFurnaceActive");


        alloyFurnaceIdle = new BlockAlloyFurnace(false)
                .setHardness(2.5f)
                .setStepSound(Block.soundTypeStone)
                .setBlockName("alloyFurnaceIdle");
        alloyFurnaceIdle.setHarvestLevel("pickaxe", 1);
        GameRegistry.registerBlock(alloyFurnaceIdle, "alloyFurnaceIdle");

        researchStation = new BlockStation()
                .setHardness(2.5f)
                .setStepSound(Block.soundTypeAnvil)
                .setBlockName("researchStation");
        researchStation.setHarvestLevel("pickaxe", 2);
        GameRegistry.registerBlock(researchStation, "researchStation");

	}

}
