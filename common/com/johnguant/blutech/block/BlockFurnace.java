package com.johnguant.blutech.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.johnguant.blutech.BluTech;
import com.johnguant.blutech.lib.BlockIds;
import com.johnguant.blutech.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFurnace extends BlockContainer 
{
	
	private final boolean isActive; 

	@SideOnly(Side.CLIENT)
	private Icon iconFront;
	private Icon iconTop;
	private Icon iconBottom;
	private Icon iconBack;
	
	public BlockFurnace(int id, boolean isActive) {
		super(id, Material.rock);
		
		this.isActive = isActive;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
			this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "furnaceActive_SIDE" : "furnaceIdle_SIDE"));
			this.iconFront = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "furnaceActive_FRONT" : "furnaceIdle_FRONT"));
			this.iconBack = iconRegister.registerIcon(Reference.MOD_ID + ":" + "furnace_BACK");
			this.iconBottom = iconRegister.registerIcon(Reference.MOD_ID + ":" + "furnace_BOTTOM");
			this.iconTop = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "furnaceActive_TOP" : "furnaceIdle_TOP"));
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata){
		// 0 = Bottom,  1 = Top, 2,3,4 and 5 = Sides
		return side == metadata ? this.iconFront : (side == 0 ? this.iconBottom : (side == 1 ? this.iconTop : this.blockIcon));
	}
	
	public int idDropped(int par1, Random random, int par3){
		return BluBlocks.alloyFurnaceIdle.blockID;
	}
	
	public void onBlockAdded(World world, int x, int y, int z){
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}
	
	private void setDefaultDirection(World world, int x, int y, int z){
		if(!world.isRemote){
			int z1 = world.getBlockId(x, y, z - 1);
			int z2 = world.getBlockId(x, y, z + 1);
			int x1 = world.getBlockId(x, y, z);
			int x2 = world.getBlockId(x, y, z);
			byte b0 = 3;
			
			if(Block.opaqueCubeLookup[z1] && !Block.opaqueCubeLookup[z2]){
				b0 = 3;
			}
			
			if(Block.opaqueCubeLookup[z2] && !Block.opaqueCubeLookup[z1]){
				b0 = 2;
			}

			if(Block.opaqueCubeLookup[x1] && !Block.opaqueCubeLookup[x2]){
				b0 = 5;
			}

			if(Block.opaqueCubeLookup[x2] && !Block.opaqueCubeLookup[x1]){
				b0 = 5;
			}
			
			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
		
		
	}
	public TileEntity createNewTileEntity(World world){
		return new TileEntityAlloyFurnace();
	}
	
	}

