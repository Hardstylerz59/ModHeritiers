/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLeaves
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.ColorizerFoliage
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.BiomeGenBase
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class LeavesFloor
extends Block {
    private Block leaves;
    private int metadata;

    public LeavesFloor(String name, Block leaves) {
        this(name, leaves, 0);
    }

    public LeavesFloor(String name, Block leaves, int m) {
        super(Material.leaves);
        this.setBlockName(name);
        this.setCreativeTab(ModSDA.naturalTab);
        this.leaves = leaves;
        this.metadata = m;
    }

    @SideOnly(value=Side.CLIENT)
    public int getBlockColor() {
        if (this.leaves != Blocks.leaves) {
            return super.getBlockColor();
        }
        double d0 = 0.5;
        double d1 = 1.0;
        return ColorizerFoliage.getFoliageColor((double)d0, (double)d1);
    }

    @SideOnly(value=Side.CLIENT)
    public int getRenderColor(int ImAnInteger) {
        if (this.leaves != Blocks.leaves) {
            return super.getRenderColor(ImAnInteger);
        }
        return ColorizerFoliage.getFoliageColorBasic();
    }

    @SideOnly(value=Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
        if (this.leaves != Blocks.leaves) {
            return 16777215;
        }
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        for (int k1 = -1; k1 <= 1; ++k1) {
            for (int l1 = -1; l1 <= 1; ++l1) {
                int i2 = p_149720_1_.getBiomeGenForCoords(p_149720_2_ + l1, p_149720_4_ + k1).getBiomeFoliageColor(p_149720_2_ + l1, p_149720_3_, p_149720_4_ + k1);
                l += (i2 & 16711680) >> 16;
                i1 += (i2 & 65280) >> 8;
                j1 += i2 & 255;
            }
        }
        return (l / 9 & 255) << 16 | (i1 / 9 & 255) << 8 | j1 / 9 & 255;
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int side, int m) {
        return this.leaves.getIcon(side, this.metadata);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)((double)x + 1.0), (double)((double)y + 0.1), (double)((double)z + 1.0));
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iBlockAccess, int x, int y, int z) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.1f, 1.0f);
    }

    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.1f, 1.0f);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if (!this.canBlockStay(world, x, y, z)) {
            world.setBlockToAir(x, y, z);
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        return !world.isAirBlock(x, y - 1, z);
    }

    @SideOnly(value=Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int x, int y, int z, int side) {
        return side == 1 ? true : super.shouldSideBeRendered(iBlockAccess, x, y, z, side);
    }

    public void registerBlockIcons(IIconRegister p_149651_1_) {
    }
}

