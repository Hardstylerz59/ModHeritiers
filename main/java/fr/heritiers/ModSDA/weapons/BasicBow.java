/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.Event
 *  cpw.mods.fml.common.eventhandler.EventBus
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.entity.player.PlayerCapabilities
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.init.Items
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.World
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.entity.player.ArrowLooseEvent
 *  net.minecraftforge.event.entity.player.ArrowNockEvent
 */
package fr.heritiers.ModSDA.weapons;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.EventBus;
import fr.heritiers.ModSDA.common.ModSDA;
import java.io.PrintStream;
import java.util.Random;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class BasicBow
extends ItemBow {
    private float damage = 6.0f;
    private final String[] bowPullIconNameArray = new String[]{"pulling_0", "pulling_1", "pulling_2"};
    private IIcon[] iconArray;

    public BasicBow(String name, String textureName, int maxUse, float damage) {
        this.setUnlocalizedName(name);
        this.setTextureName(textureName);
        this.setMaxDamage(maxUse);
        this.setCreativeTab(ModSDA.weaponTab);
    }

    public ItemStack func_77654_b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return itemStack;
    }

    public int func_77626_a(ItemStack itemStack) {
        return 72000;
    }

    public void func_77615_a(ItemStack itemStack, World world, EntityPlayer entityPlayer, int itemInUseCount) {
        boolean creativeOrInfinity;
        int timeItemUsed = this.func_77626_a(itemStack) - itemInUseCount;
        ArrowLooseEvent event = new ArrowLooseEvent(entityPlayer, itemStack, timeItemUsed);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (event.isCanceled()) {
            return;
        }
        timeItemUsed = event.charge;
        boolean bl = creativeOrInfinity = entityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel((int)Enchantment.infinity.effectId, (ItemStack)itemStack) > 0;
        if (creativeOrInfinity || entityPlayer.inventory.hasItem(Items.arrow)) {
            int enchantPunch;
            int enchantPower;
            float damage = (float)timeItemUsed / 20.0f;
            if ((double)(damage = (damage * damage + damage * 2.0f) / 3.0f) < 0.1) {
                return;
            }
            if (damage > 1.0f) {
                damage = 1.0f;
            }
            EntityArrow entityarrow = new EntityArrow(world, (EntityLivingBase)entityPlayer, this.damage);
            if (damage == 1.0f) {
                entityarrow.setIsCritical(true);
            }
            if ((enchantPower = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.power.effectId, (ItemStack)itemStack)) > 0) {
                entityarrow.setDamage(entityarrow.getDamage() + (double)enchantPower * 0.5 + 0.5);
            }
            if ((enchantPunch = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.punch.effectId, (ItemStack)itemStack)) > 0) {
                entityarrow.setKnockbackStrength(enchantPunch);
            }
            if (EnchantmentHelper.getEnchantmentLevel((int)Enchantment.flame.effectId, (ItemStack)itemStack) > 0) {
                entityarrow.setFire(100);
            }
            itemStack.damageItem(1, (EntityLivingBase)entityPlayer);
            world.playSoundAtEntity((Entity)entityPlayer, "random.bow", 1.0f, 1.0f / (itemRand.nextFloat() * 0.4f + 1.2f) + damage * 0.5f);
            if (creativeOrInfinity) {
                entityarrow.canBePickedUp = 2;
            } else {
                entityPlayer.inventory.consumeInventoryItem(Items.arrow);
            }
            if (!world.isRemote) {
                world.spawnEntityInWorld((Entity)entityarrow);
            }
        }
    }

    public EnumAction func_77661_b(ItemStack itemStack) {
        return EnumAction.bow;
    }

    public ItemStack func_77659_a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        ArrowNockEvent event = new ArrowNockEvent(entityPlayer, itemStack);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (event.isCanceled()) {
            return event.result;
        }
        if (entityPlayer.capabilities.isCreativeMode || entityPlayer.inventory.hasItem(Items.arrow)) {
            entityPlayer.setItemInUse(itemStack, this.func_77626_a(itemStack));
        }
        return itemStack;
    }

    public void func_94581_a(IIconRegister iIconregister) {
        this.itemIcon = iIconregister.registerIcon(this.getIconString() + "_standby");
        this.iconArray = new IIcon[this.bowPullIconNameArray.length];
        for (int i = 0; i < this.iconArray.length; ++i) {
            this.iconArray[i] = iIconregister.registerIcon(this.getIconString() + "_" + this.bowPullIconNameArray[i]);
        }
    }

    public IIcon func_94599_c(int duration) {
        System.out.println("42 is the strongest");
        return this.iconArray[duration];
    }
}

