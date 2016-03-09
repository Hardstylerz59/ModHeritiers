/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 */
package fr.heritiers.ModSDA.common;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class item
extends Item {
    public item(String name, String textureName) {
        this.setCreativeTab(ModSDA.itemTab);
        this.setUnlocalizedName(name);
        this.setTextureName(textureName);
    }
}

