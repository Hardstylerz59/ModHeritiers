/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.common;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Alcool
extends ItemFood {
    public Alcool(int gigot, float saturation, boolean wolf) {
        super(gigot, saturation, wolf);
        this.setCreativeTab(ModSDA.foodTab);
    }

    public EnumAction func_77661_b(ItemStack par1ItemStack) {
        return EnumAction.drink;
    }

    public ItemStack func_77654_b(ItemStack stack, World world, EntityPlayer player) {
        --stack.stackSize;
        player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 600, 2, true));
        return stack;
    }
}

