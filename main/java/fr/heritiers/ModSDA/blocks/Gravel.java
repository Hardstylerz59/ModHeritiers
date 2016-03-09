/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockGravel
 *  net.minecraft.creativetab.CreativeTabs
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.creativetab.CreativeTabs;

public class Gravel
extends BlockGravel {
    public Gravel(String nom, String textureName) {
        this.setCreativeTab(ModSDA.grassTab);
        this.setBlockName(nom);
        this.setBlockTextureName(textureName);
    }
}

