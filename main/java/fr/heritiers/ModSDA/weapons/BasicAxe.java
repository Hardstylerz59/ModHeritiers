/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemSword
 */
package fr.heritiers.ModSDA.weapons;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class BasicAxe
extends ItemSword {
    private float damage = 6.0f;

    public BasicAxe(String name, String textureName, float damage, int maxUse) {
        super(Item.ToolMaterial.IRON);
        this.maxStackSize = 1;
        this.setMaxDamage(maxUse);
        this.setCreativeTab(ModSDA.weaponTab);
        this.setUnlocalizedName(name);
        this.setTextureName(textureName);
    }

    public float func_150931_i() {
        return this.damage;
    }
}

