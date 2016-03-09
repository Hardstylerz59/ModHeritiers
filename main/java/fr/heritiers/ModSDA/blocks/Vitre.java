/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.creativetab.CreativeTabs
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Vitre
extends Block {
    public Vitre(String name, String textureName) {
        super(Material.glass);
        this.setCreativeTab(ModSDA.vitreTab);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
    }

    public boolean isOpaqueCube() {
        return false;
    }
}

