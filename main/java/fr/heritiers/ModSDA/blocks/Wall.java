/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockWall
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Wall
extends BlockWall {
    Block block;
    int metadata;

    public Wall(Block b, String name) {
        this(b, name, 0);
    }

    public Wall(Block b, String name, int m) {
        super(b);
        this.metadata = m;
        this.setBlockName(name);
        this.block = b;
        this.setCreativeTab(ModSDA.wallTab);
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int side, int m) {
        return this.block.getIcon(side, this.metadata);
    }

    @SideOnly(value=Side.CLIENT)
    public void func_149666_a(Item item2, CreativeTabs creativeTab, List list) {
        list.add(new ItemStack(item2, 1, 0));
    }
}

