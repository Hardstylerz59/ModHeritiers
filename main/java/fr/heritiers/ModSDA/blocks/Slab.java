/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Slab
extends BlockSlab {
    Block block;
    int metadata;

    public Slab(Block block, String name, boolean isDouble) {
        this(block, name, isDouble, 0);
    }

    public Slab(Block block, String name, boolean isDouble, int m) {
        super(isDouble, block.getMaterial());
        this.block = block;
        this.opaque = isDouble;
        if (!isDouble) {
            this.setCreativeTab(ModSDA.slabTab);
        }
        this.setBlockName(name);
        this.metadata = m;
        this.setLightOpacity(0);
    }

    public IIcon getIcon(int side, int m) {
        return this.block.getIcon(side, this.metadata);
    }

    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock((Block)this);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock((Block)this);
    }

    protected ItemStack func_149644_j(int metadata) {
        return new ItemStack(Item.getItemFromBlock((Block)this), 2, metadata & 7);
    }

    public String func_150002_b(int p_150002_1_) {
        return super.getUnlocalizedName();
    }

    public boolean isOpaqueCube() {
        return this.opaque;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void registerBlockIcons(IIconRegister register) {
    }
}

