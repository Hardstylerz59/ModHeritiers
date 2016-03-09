/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockRotatedPillar
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Log
extends BlockRotatedPillar {
    protected IIcon sideIcon;

    public Log(String nom, String textureName) {
        super(Material.wood);
        this.setBlockName(nom);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.naturalTab);
    }

    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(this.getTextureName() + "_top");
        this.sideIcon = register.registerIcon(this.getTextureName());
    }

    public static int func_150165_c(int p_150165_0_) {
        return p_150165_0_;
    }

    public int func_149745_a(Random p_149745_1_) {
        return 1;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock((Block)this);
    }

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
        int b0 = 4;
        int i1 = b0 + 1;
        if (p_149749_1_.checkChunksExist(p_149749_2_ - i1, p_149749_3_ - i1, p_149749_4_ - i1, p_149749_2_ + i1, p_149749_3_ + i1, p_149749_4_ + i1)) {
            for (int j1 = - b0; j1 <= b0; ++j1) {
                for (int k1 = - b0; k1 <= b0; ++k1) {
                    for (int l1 = - b0; l1 <= b0; ++l1) {
                        Block block = p_149749_1_.getBlock(p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                        if (!block.isLeaves((IBlockAccess)p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1)) continue;
                        block.beginLeavesDecay(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                    }
                }
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    protected IIcon getSideIcon(int p_150163_1_) {
        return this.sideIcon;
    }

    @SideOnly(value=Side.CLIENT)
    protected IIcon getTopIcon(int p_150163_1_) {
        return this.blockIcon;
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
        return true;
    }

    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }
}

