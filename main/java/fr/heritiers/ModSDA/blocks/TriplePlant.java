/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.Block$SoundType
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.IGrowable
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.PlayerCapabilities
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemShears
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.common.IShearable
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class TriplePlant
extends BlockBush
implements IGrowable,
IShearable {
    private IIcon topIcon;

    public TriplePlant(String name, String textureName) {
        super(Material.plants);
        this.setCreativeTab(ModSDA.naturalTab);
        this.setHardness(0.0f);
        this.setStepSound(soundTypeGrass);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iBlockAccess, int x, int y, int z) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return super.canPlaceBlockAt(world, x, y, z) && world.isAirBlock(x, y + 1, z) && world.isAirBlock(x, y + 2, z);
    }

    protected void func_149855_e(World world, int x, int y, int z) {
        if (!this.canBlockStay(world, x, y, z)) {
            int metadata = world.getBlockMetadata(x, y, z);
            if (metadata == 0) {
                this.dropBlockAsItem(world, x, y, z, metadata, 0);
                if (world.getBlock(x, y + 2, z) == this) {
                    world.setBlock(x, y + 2, z, Blocks.air, 0, 2);
                }
                if (world.getBlock(x, y + 1, z) == this) {
                    world.setBlock(x, y + 1, z, Blocks.air, 0, 2);
                }
            }
            world.setBlock(x, y, z, Blocks.air, 0, 2);
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        if (world.getBlock(x, y, z) != this) {
            return super.canBlockStay(world, x, y, z);
        }
        int metadata = world.getBlockMetadata(x, y, z);
        if (metadata == 0) {
            return world.getBlock(x, y - 1, z) == this;
        }
        return world.getBlock(x, y + 1, z) == this && super.canBlockStay(world, x, y, z);
    }

    public Item getItemDropped(int metadata, Random random, int integer2) {
        if (metadata != 0) {
            return null;
        }
        return Item.getItemFromBlock((Block)this);
    }

    public int func_149692_a(int metadata) {
        if (metadata == 0) {
            return 0;
        }
        return metadata & 7;
    }

    public IIcon getIcon(int side, int metadata) {
        if (metadata != 0) {
            return this.blockIcon;
        }
        return this.topIcon;
    }

    public IIcon func_149888_a(boolean top, int metadata) {
        if (top) {
            return this.topIcon;
        }
        return this.blockIcon;
    }

    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        return 16777215;
    }

    public void func_149889_c(World world, int x, int y, int z, int metadata, int flags) {
        world.setBlock(x, y, z, (Block)this, 2, flags);
        world.setBlock(x, y + 1, z, (Block)this, 1, flags);
        world.setBlock(x, y + 2, z, (Block)this, 0, flags);
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        world.setBlock(x, y + 1, z, (Block)this, 1, 2);
        world.setBlock(x, y + 2, z, (Block)this, 0, 2);
    }

    public void harvestBlock(World world, EntityPlayer entityPlayer, int x, int y, int z, int metadata) {
        if (world.isRemote || entityPlayer.getCurrentEquippedItem() == null || entityPlayer.getCurrentEquippedItem().getItem() != Items.shears || metadata != 0 || !this.func_149886_b(world, x, y, z, metadata, entityPlayer)) {
            super.harvestBlock(world, entityPlayer, x, y, z, metadata);
        }
    }

    public void onBlockHarvested(World world, int x, int y, int z, int metadata, EntityPlayer entityPlayer) {
        if (metadata != 0) {
            if (world.getBlock(x, y - 1, z) == this) {
                if (!entityPlayer.capabilities.isCreativeMode) {
                    world.func_147480_a(x, y - 1, z, true);
                } else {
                    if (world.getBlock(x, y + 1, z) == this) {
                        world.setBlockToAir(x, y + 1, z);
                    }
                    if (world.getBlock(x, y + 2, z) == this) {
                        world.setBlockToAir(x, y + 2, z);
                    }
                    if (world.getBlock(x, y - 1, z) == this) {
                        world.setBlockToAir(x, y - 1, z);
                    }
                    if (world.getBlock(x, y - 2, z) == this) {
                        world.setBlockToAir(x, y - 2, z);
                    }
                }
            }
        } else if (entityPlayer.capabilities.isCreativeMode && world.getBlock(x, y + 1, z) == this) {
            world.setBlock(x, y + 1, z, Blocks.air, 0, 2);
            world.setBlock(x, y + 2, z, Blocks.air, 0, 2);
        }
        super.onBlockHarvested(world, x, y, z, metadata, entityPlayer);
    }

    private boolean func_149886_b(World world, int x, int y, int z, int metadata, EntityPlayer entityPlayer) {
        return false;
    }

    public void registerBlockIcons(IIconRegister iiconRegister) {
        this.blockIcon = iiconRegister.registerIcon(this.getTextureName() + "_bottom");
        this.topIcon = iiconRegister.registerIcon(this.getTextureName());
    }

    public void func_149666_a(Item item2, CreativeTabs creativeTab, List list) {
        list.add(new ItemStack(item2, 1, 0));
    }

    public int func_149643_k(World world, int x, int y, int z) {
        int metadata = world.getBlockMetadata(x, y, z);
        if (metadata != 0) {
            return world.getBlockMetadata(x, y - 1, z);
        }
        return metadata;
    }

    public boolean func_149851_a(World world, int x, int y, int z, boolean bool) {
        return false;
    }

    public boolean func_149852_a(World world, Random random, int x, int y, int z) {
        return true;
    }

    public void func_149853_b(World world, Random random, int x, int y, int z) {
        this.dropBlockAsItem(world, x, y, z, new ItemStack((Block)this, 1, 0));
    }

    public boolean isShearable(ItemStack item2, IBlockAccess world, int x, int y, int z) {
        int metadata = world.getBlockMetadata(x, y, z);
        return metadata != 0;
    }

    public ArrayList<ItemStack> onSheared(ItemStack item2, IBlockAccess world, int x, int y, int z, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack((Block)this, 2, 2));
        return ret;
    }
}

