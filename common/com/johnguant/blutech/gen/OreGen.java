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

package com.johnguant.blutech.gen;

import java.util.Random;

import com.johnguant.blutech.block.BluBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateOverworld(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateOverworld(World world, Random random, int x, int z) {

		this.addOreSpawn(BluBlocks.bluOre, world, random, x, z, 16, 16,
				13 + random.nextInt(3), 5, 5, 30);
		this.addOreSpawn(BluBlocks.tinOre, world, random, x, z, 16, 16,
				12 + random.nextInt(3), 5, 15, 70);
		this.addOreSpawn(BluBlocks.copperOre, world, random, x, z, 16, 16,
				12 + random.nextInt(3), 5, 15, 70);
		this.addOreSpawn(BluBlocks.leadOre, world, random, x, z, 16, 16,
				7 + random.nextInt(3), 5, 15, 50);
		this.addOreSpawn(BluBlocks.aluminiumOre, world, random, x, z, 16, 16,
				10 + random.nextInt(3), 5, 15, 60);
		this.addOreSpawn(BluBlocks.silverOre, world, random, x, z, 16, 16,
				8 + random.nextInt(3), 5, 15, 50);
		this.addOreSpawn(BluBlocks.rhodiumOre, world, random, x, z, 16, 16,
				8 + random.nextInt(3), 5, 5, 16);
		this.addOreSpawn(BluBlocks.remboniteOre, world, random, x, z, 16, 16,
				5 + random.nextInt(3), 5, 5, 16);
		
	}

	private void generateNether(World world, Random random, int x, int z) {

	}

	private void generateEnd(World world, Random random, int x, int z) {

	}

	
	/**
	 * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
	 *
	 * @param block  The Block to spawn
	 * @param world   The World to spawn in
	 * @param random   A Random object for retrieving random positions within the world to spawn the Block
	 * @param blockXPos   An int for passing the X-Coordinate for the Generation method
	 * @param blockZPos   An int for passing the Z-Coordinate for the Generation method
	 * @param maxX   An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
	 * @param maxZ   An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
	 * @param maxVeinSize   An int for setting the maximum size of a vein
	 * @param chancesToSpawn   An int for the Number of chances available for the Block to spawn per-chunk
	 * @param minY   An int for the minimum Y-Coordinate height at which this block may spawn
	 * @param maxY   An int for the maximum Y-Coordinate height at which this block may spawn
	 **/
	public void addOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {

		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.blockID, maxVeinSize)).generate(world,
					random, posX, posY, posZ);
		}
	}

}
