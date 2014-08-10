package com.johnguant.blutech.block;

import com.johnguant.blutech.BluTech;

import com.johnguant.blutech.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class BlockAlloyFurnace extends Block//Container
{

    private final boolean isActive;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;
    private IIcon iconBack;
    private IIcon iconTop;
    private IIcon iconBottom;


    public BlockAlloyFurnace(boolean isActive) {
        super(Material.rock);
        setCreativeTab(BluTech.tabsBluTech);
        this.isActive = isActive;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "furnaceActive_SIDE" : "furnaceIdle_SIDE"));
        this.iconFront = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "furnaceActive_FRONT" : "furnaceIdle_FRONT"));
        this.iconBack = iconRegister.registerIcon(Reference.MOD_ID + ":" + "furnace_BACK");
        this.iconTop = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "furnaceActive_TOP" : "furnaceIdle_TOP"));
        this.iconBottom = iconRegister.registerIcon(Reference.MOD_ID + ":" + "furnace_BOTTOM");

        // @SideOnly(Side.CLIENT)
        // public IIcon getIcon(int side, int metadata){
        //         return side == metadata ? this.iconFront : (side == 0 this.iconBottom : this.blockIcon);
        //     }

    }
}
