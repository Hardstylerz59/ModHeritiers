/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 */
package fr.heritiers.ModSDA.common;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTutoArmor
extends ItemArmor {
    public ItemTutoArmor(ItemArmor.ArmorMaterial material, int type) {
        super(material, 0, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ModSDA.jambiere) {
            return "modsda:models/armor/diamond_layer_2.png";
        }
        return "modsda:models/armor/diamond_layer_1.png";
    }
}

