/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.material.Material
 *  net.minecraft.creativetab.CreativeTabs
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Flower
extends BlockBush {
    public Flower(String name, String textureName) {
        super(Material.grass);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.naturalTab);
    }

    protected boolean canPlaceBlockOn(Block blockBelow) {
        return super.canPlaceBlockOn(blockBelow) || blockBelow == ModSDA.driedGrass;
    }
}

