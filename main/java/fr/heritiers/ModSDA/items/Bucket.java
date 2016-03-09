/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBucket
 */
package fr.heritiers.ModSDA.items;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;

public class Bucket
extends ItemBucket {
    public Bucket(String name, String textureName, Block block) {
        super(block);
        this.setUnlocalizedName(name);
        this.setTextureName(textureName);
        this.setCreativeTab(ModSDA.itemTab);
    }
}

