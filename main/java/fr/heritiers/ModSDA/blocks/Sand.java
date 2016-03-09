/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockFalling
 *  net.minecraft.creativetab.CreativeTabs
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.creativetab.CreativeTabs;

public class Sand
extends BlockFalling {
    public Sand(String name, String textureName) {
        this.setCreativeTab(ModSDA.grassTab);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
    }
}

