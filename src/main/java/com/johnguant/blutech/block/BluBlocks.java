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
	public static Block aluminiumOre;
	public static Block copperOre;
	public static Block tinOre;
	public static Block leadOre;
	public static Block rhodiumOre;
	public static Block remboniteOre;
	public static Block silverOre;
	public static Block fossilOre;
	public static Block nickelOre;
	public static Block tungstenOre;
	public static Block abyssStone;
	public static Block cadmiumOre;
	
	public static Block bluMachineBlock;
	public static Block energisedMachineBlock;
	public static Block eridianMachineBlock;
	
	public static Block alloyFurnaceIdle;
	public static Block alloyFurnaceActive;
	
	public static Block colouredStone;

	public static void init() {
		bluOre = new BlockOre()
				.setHardness(3.0F)
				.setStepSound(Blocks.soundTypeStone)
				.setBlockName("bluOre");
        bluOre.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(bluOre, Strings.BLUORE_NAME);
		OreDictionary.registerOre("oreBlu", new ItemStack(bluOre));

		aluminiumOre = new BlockOre()
				.setHardness(2.0F)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("aluminiumOre");
        aluminiumOre.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(aluminiumOre, "aluminiumOre");
		OreDictionary.registerOre("oreAluminium", new ItemStack(aluminiumOre));

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

		rhodiumOre = new BlockOre()
				.setHardness(4.0F)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("rhodiumOre");
        rhodiumOre.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(rhodiumOre, "rhodiumOre");
		OreDictionary.registerOre("oreRhodium", new ItemStack(rhodiumOre));

		remboniteOre = new BlockOre()
				.setHardness(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("remboniteOre");
        remboniteOre.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(remboniteOre, "remboniteOre");
		OreDictionary.registerOre("oreRembonite", new ItemStack(remboniteOre));
				
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
				
		tungstenOre = new BlockOre()
				.setHardness(4.0f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("tungstenOre");
        tungstenOre.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(tungstenOre, "tungstenOre");
		OreDictionary.registerOre("oreTungsten", new ItemStack(tungstenOre));
		
		cadmiumOre = new BlockOre()
				.setHardness(4.0f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("cadmiumOre");
        cadmiumOre.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(cadmiumOre, "cadmiumOre");
		OreDictionary.registerOre("oreCadmium", new ItemStack(cadmiumOre));
		
		nickelOre = new BlockOre()
				.setHardness(2.0f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("nickelOre");
        nickelOre.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(nickelOre, "nickelOre");
		OreDictionary.registerOre("oreNickel", new ItemStack(nickelOre));
		
		bluMachineBlock = new Blocks()
				.setHardness(2.5f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("bluMachineBlock");
        bluMachineBlock.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(bluMachineBlock, "bluMachineBlock");
				
		energisedMachineBlock = new Blocks()
				.setHardness(2.5f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("energisedMachineBlock");
        energisedMachineBlock.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(energisedMachineBlock, "energisedMachineBlock");
				
		eridianMachineBlock = new Blocks()
				.setHardness(3.0f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("eridianMachineBlock");
        eridianMachineBlock.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(eridianMachineBlock, "eridianMachineBlock");
		
		abyssStone = new Blocks()
				.setHardness(51.0f)
				.setBlockName("abyssStone");
        abyssStone.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(abyssStone, "abyssStone");
		
		colouredStone = new BlockColoured()
				.setHardness(1.0f)
				.setStepSound(Block.soundTypeStone)
				.setBlockName("colouredStone");
        colouredStone.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(colouredStone, "colouredStone");
		OreDictionary.registerOre("stone", new ItemStack(colouredStone));
		
	}

}
