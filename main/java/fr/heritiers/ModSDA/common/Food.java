/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 */
package fr.heritiers.ModSDA.common;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Food
extends ItemFood {
    public Food(int gigot, float saturation, boolean wolf) {
        super(gigot, saturation, wolf);
        this.setCreativeTab(ModSDA.foodTab);
    }
}

