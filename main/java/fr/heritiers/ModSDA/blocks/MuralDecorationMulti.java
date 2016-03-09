/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.common.util.ForgeDirection
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class MuralDecorationMulti
extends Block {
    int width;
    int height;
    IIcon icon;

    public MuralDecorationMulti(String name, String textureName, int width, int height) {
        super(Material.carpet);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.decorationTab);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return null;
    }

    public IIcon func_149673_e(IBlockAccess iBlockAccess, int x, int y, int z, int p_149673_5_) {
        return this.icon;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iBlockAccess, int x, int y, int z) {
        int side = iBlockAccess.getBlockMetadata(x, y, z);
        if (side == 2) {
            this.setBlockBounds(0.0f, 0.0f, 1.0f, (float)this.width * 1.0f, (float)this.height * 1.0f, 1.0f);
        } else if (side == 3) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, (float)this.width * 1.0f, (float)this.height * 1.0f, 0.0f);
        } else if (side == 4) {
            this.setBlockBounds(1.0f, 0.0f, 0.0f, 1.0f, (float)this.height * 1.0f, (float)this.width * 1.0f);
        } else if (side == 5) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.0f, (float)this.height * 1.0f, (float)this.width * 1.0f);
        }
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public int func_149645_b() {
        return 8;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isSideSolid(x - 1, y, z, ForgeDirection.EAST) || world.isSideSolid(x + 1, y, z, ForgeDirection.WEST) || world.isSideSolid(x, y, z - 1, ForgeDirection.SOUTH) || world.isSideSolid(x, y, z + 1, ForgeDirection.NORTH);
    }

    public int onBlockPlaced(World world, int x, int y, int z, int ImAnInteger, float deltaX, float deltaY, float deltaZ, int ImAnotherInteger) {
        int ImACopy = ImAnotherInteger;
        if ((ImAnotherInteger == 0 || ImAnInteger == 2) && world.isSideSolid(x, y, z + 1, ForgeDirection.NORTH)) {
            ImACopy = 2;
        }
        if ((ImACopy == 0 || ImAnInteger == 3) && world.isSideSolid(x, y, z - 1, ForgeDirection.SOUTH)) {
            ImACopy = 3;
        }
        if ((ImACopy == 0 || ImAnInteger == 4) && world.isSideSolid(x + 1, y, z, ForgeDirection.WEST)) {
            ImACopy = 4;
        }
        if ((ImACopy == 0 || ImAnInteger == 5) && world.isSideSolid(x - 1, y, z, ForgeDirection.EAST)) {
            ImACopy = 5;
        }
        return ImACopy;
    }

    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(this.getTextureName());
        this.icon = register.registerIcon(this.getTextureName() + "Icon");
    }
}

