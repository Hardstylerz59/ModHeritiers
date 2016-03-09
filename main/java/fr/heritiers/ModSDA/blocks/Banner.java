/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLadder
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.world.IBlockAccess
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.IBlockAccess;

public class Banner
extends BlockLadder {
    public Banner(String name, String textureName) {
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.etendardTab);
    }

    public void func_149797_b(int side) {
        if (side == 2) {
            this.setBlockBounds(0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        } else if (side == 3) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f);
        } else if (side == 4) {
            this.setBlockBounds(1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (side == 5) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f);
        }
    }

    public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity) {
        return false;
    }
}

