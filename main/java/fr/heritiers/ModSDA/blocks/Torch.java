/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockTorch
 *  net.minecraft.block.BlockWall
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class Torch
extends BlockTorch {
    public Torch(String name, String textureName) {
        this.setTickRandomly(true);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.decorationTab);
        this.setLightLevel(1.0f);
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return super.canPlaceBlockAt(world, x, y, z) || world.getBlock(x, y - 1, z) instanceof BlockWall;
    }
}

