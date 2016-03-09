/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Grass
extends BlockBush {
    public Grass(String name, String textureName) {
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.naturalTab);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return null;
    }

    protected boolean canPlaceBlockOn(Block blockBelow) {
        return super.canPlaceBlockOn(blockBelow) || blockBelow == ModSDA.driedGrass;
    }
}

