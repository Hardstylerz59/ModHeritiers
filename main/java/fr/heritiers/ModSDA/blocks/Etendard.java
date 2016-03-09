/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockVine
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.common.util.ForgeDirection
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class Etendard
extends BlockVine {
    public Etendard(String name, String textureName) {
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.etendardTab);
        this.setTickRandomly(false);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isSideSolid(x - 1, y, z, ForgeDirection.EAST) || world.isSideSolid(x + 1, y, z, ForgeDirection.WEST) || world.isSideSolid(x, y, z - 1, ForgeDirection.SOUTH) || world.isSideSolid(x, y, z + 1, ForgeDirection.NORTH);
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
    }

    @SideOnly(value=Side.CLIENT)
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        return 16777215;
    }

    public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity) {
        return false;
    }
}

