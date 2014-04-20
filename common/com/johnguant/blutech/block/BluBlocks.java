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

import com.johnguant.blutech.lib.BlockIds;
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
	public static Block bluWood;
	public static Block bluPlanks;
	public static Block bluLeaves;
	
	public static Block bluMachineBlock;
	public static Block energisedMachineBlock;
	public static Block eridianMachineBlock;
	
	public static Block alloyFurnaceIdle;
	public static Block alloyFurnaceActive;

	public static void init() {
		bluOre = new BlockOre(BlockIds.BLUORE_ID)
				.setHardness(3.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("bluOre");
		GameRegistry.registerBlock(bluOre, Strings.BLUORE_NAME);
		MinecraftForge.setBlockHarvestLevel(bluOre, "pickaxe", 2);
		OreDictionary.registerOre("oreBlu", new ItemStack(bluOre));

		aluminiumOre = new BlockOre(BlockIds.ALUMINIUMORE_ID)
				.setHardness(2.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("aluminiumOre");
		GameRegistry.registerBlock(aluminiumOre, "aluminiumOre");
		MinecraftForge.setBlockHarvestLevel(aluminiumOre, "pickaxe", 1);
		OreDictionary.registerOre("oreAluminium", new ItemStack(aluminiumOre));

		copperOre = new BlockOre(BlockIds.COPPERORE_ID)
				.setHardness(2.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("copperOre");
		GameRegistry.registerBlock(copperOre, "copperOre");
		MinecraftForge.setBlockHarvestLevel(copperOre, "pickaxe", 1);
		OreDictionary.registerOre("oreCopper", new ItemStack(copperOre));

		tinOre = new BlockOre(BlockIds.TINORE_ID)
				.setHardness(2.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("tinOre");
		GameRegistry.registerBlock(tinOre, "tinOre");
		MinecraftForge.setBlockHarvestLevel(tinOre, "pickaxe", 1);
		OreDictionary.registerOre("oreTin", new ItemStack(tinOre));

		leadOre = new BlockOre(BlockIds.LEADORE_ID)
				.setHardness(3.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("leadOre");
		GameRegistry.registerBlock(leadOre, "leadOre");
		MinecraftForge.setBlockHarvestLevel(leadOre, "pickaxe", 1);
		OreDictionary.registerOre("oreLead", new ItemStack(leadOre));

		rhodiumOre = new BlockOre(BlockIds.RHODIUMORE_ID)
				.setHardness(4.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("rhodiumOre");
		GameRegistry.registerBlock(rhodiumOre, "rhodiumOre");
		MinecraftForge.setBlockHarvestLevel(rhodiumOre, "pickaxe", 3);
		OreDictionary.registerOre("oreRhodium", new ItemStack(rhodiumOre));

		remboniteOre = new BlockOre(BlockIds.REMBONITEORE_ID)
				.setHardness(5.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("remboniteOre");
		GameRegistry.registerBlock(remboniteOre, "remboniteOre");
		MinecraftForge.setBlockHarvestLevel(remboniteOre, "pickaxe", 3);
		OreDictionary.registerOre("oreRembonite", new ItemStack(remboniteOre));
				
		silverOre = new BlockOre(BlockIds.SILVERORE_ID)
				.setHardness(3.0F)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("silverOre");
		GameRegistry.registerBlock(silverOre, "silverOre");
		MinecraftForge.setBlockHarvestLevel(silverOre, "pickaxe", 2);
		OreDictionary.registerOre("oreSilver", new ItemStack(silverOre));
		
		fossilOre = new BlockOre(BlockIds.FOSSILORE_ID)
				.setHardness(2.0f)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("fossilOre");
		GameRegistry.registerBlock(fossilOre, "fossilOre");
		MinecraftForge.setBlockHarvestLevel(fossilOre, "pickaxe", 0);
				
		tungstenOre = new BlockOre(BlockIds.TUNGSTENORE_ID)
				.setHardness(4.0f)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("tungstenOre");
		GameRegistry.registerBlock(tungstenOre, "tungstenOre");
		MinecraftForge.setBlockHarvestLevel(tungstenOre, "pickaxe", 2);
		OreDictionary.registerOre("oreTungsten", new ItemStack(tungstenOre));
		
		nickelOre = new BlockOre(BlockIds.NICKELORE_ID)
				.setHardness(2.0f)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("nickelOre");
		GameRegistry.registerBlock(nickelOre, "nickelOre");
		MinecraftForge.setBlockHarvestLevel(nickelOre, "pickaxe", 1);
		OreDictionary.registerOre("oreNickel", new ItemStack(nickelOre));
		
		bluMachineBlock = new Blocks(BlockIds.MACHINEBLOCK1_ID)
				.setHardness(2.5f)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("bluMachineBlock");
		GameRegistry.registerBlock(bluMachineBlock, "bluMachineBlock");
		MinecraftForge.setBlockHarvestLevel(bluMachineBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(bluMachineBlock, "pickaxe", 1);
		
		energisedMachineBlock = new Blocks(BlockIds.MACHINEBLOCK2_ID)
				.setHardness(2.5f)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("energisedMachineBlock");
		GameRegistry.registerBlock(energisedMachineBlock, "energisedMachineBlock");
		MinecraftForge.setBlockHarvestLevel(energisedMachineBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(energisedMachineBlock, "pickaxe", 1);
		
		eridianMachineBlock = new Blocks(BlockIds.MACHINEBLOCK3_ID)
				.setHardness(3.0f)
				.setStepSound(Block.soundStoneFootstep)
				.setUnlocalizedName("eridianMachineBlock");
		GameRegistry.registerBlock(eridianMachineBlock, "eridianMachineBlock");
		MinecraftForge.setBlockHarvestLevel(eridianMachineBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(eridianMachineBlock, "pickaxe", 1);
		
		alloyFurnaceIdle = new BlockFurnace(BlockIds.FURNACEIDLE_ID)
				.setHardness(1.5f)
				.setStepSound(Block.soundAnvilFootstep)
				.setUnlocalizedName("alloyFurnaceIdle");
		GameRegistry.registerBlock(alloyFurnaceIdle, "alloyFurnaceIdle");
		MinecraftForge.setBlockHarvestLevel(alloyFurnaceIdle, "pickaxe", 1);
		
		alloyFurnaceActive = new BlockFurnace(BlockIds.FURNACEACTIVE_ID)
				.setHardness(1.5f)
				.setStepSound(Block.soundAnvilFootstep)
				.setUnlocalizedName("alloyFurnaceActive");
		GameRegistry.registerBlock(alloyFurnaceActive, "alloyFurnaceActive");
		MinecraftForge.setBlockHarvestLevel(alloyFurnaceActive, "pickaxe", 1);
		//TODO Add a light value equal to that of GlowStone.
		
		abyssStone = new Blocks(BlockIds.ABYSSSTONE_ID)
				.setHardness(51.0f)
				.setStepSound(Block.soundPowderFootstep)
				.setUnlocalizedName("abyssStone");
		GameRegistry.registerBlock(abyssStone, "abyssStone");
		MinecraftForge.setBlockHarvestLevel(abyssStone, "pickaxe", 3);
		
		bluWood = new BlockTree(BlockIds.BLUWOOD_ID)
				.setHardness(1.0f)
				.setStepSound(Block.soundWoodFootstep)
				.setUnlocalizedName("bluWood");
		GameRegistry.registerBlock(bluWood, "bluWood");
		MinecraftForge.setBlockHarvestLevel(bluWood, "axe", 0);
		
		bluPlanks = new BlockTree(BlockIds.BLUPLANKS_ID)
				.setHardness(1.0f)
				.setStepSound(Block.soundWoodFootstep)
				.setUnlocalizedName("bluPlanks");
		GameRegistry.registerBlock(bluPlanks, "bluPlanks");
		MinecraftForge.setBlockHarvestLevel(bluPlanks, "axe", 0);
		
		bluLeaves = new BlockTree(BlockIds.BLULEAVES_ID)
				.setHardness(0.5f)
				.setStepSound(Block.soundGrassFootstep)
				.setLightOpacity(1000)
				.setLightValue(2.0f)
				.setUnlocalizedName("bluLeaves");
		GameRegistry.registerBlock(bluLeaves, "bluLeaves");
		MinecraftForge.setBlockHarvestLevel(bluLeaves, "axe", 0);
		
	}

}
