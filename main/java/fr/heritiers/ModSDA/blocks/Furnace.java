/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityFurnace
 *  net.minecraft.util.IIcon
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import fr.heritiers.ModSDA.tileentity.FurnaceEntity;
import java.io.PrintStream;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Furnace
extends BlockContainer {
    private final Random random = new Random();
    private final boolean lighted;
    private static boolean updating;
    private String cutName;
    @SideOnly(value=Side.CLIENT)
    private IIcon top;
    @SideOnly(value=Side.CLIENT)
    private IIcon sideBurn;
    private static final String __OBFID = "CL_00000248";

    public Furnace(boolean light, String name, String textureName) {
        super(Material.rock);
        this.lighted = light;
        this.cutName = name;
        if (this.lighted) {
            this.setBlockName(this.cutName + "On");
            this.setLightLevel(5.0f);
        } else {
            this.setBlockName(this.cutName);
            this.setCreativeTab(ModSDA.decorationTab);
        }
        this.setBlockTextureName(textureName);
    }

    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_) {
        return Item.getItemFromBlock((Block)ModSDA.haradFurnaceOff);
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        this.func_149930_e(world, x, y, z);
    }

    private void func_149930_e(World world, int x, int y, int z) {
        if (!world.isRemote) {
            Block block = world.getBlock(x, y, z - 1);
            Block block1 = world.getBlock(x, y, z + 1);
            Block block2 = world.getBlock(x - 1, y, z);
            Block block3 = world.getBlock(x + 1, y, z);
            int b0 = 3;
            if (block.func_149730_j() && !block1.func_149730_j()) {
                b0 = 3;
            }
            if (block1.func_149730_j() && !block.func_149730_j()) {
                b0 = 2;
            }
            if (block2.func_149730_j() && !block3.func_149730_j()) {
                b0 = 5;
            }
            if (block3.func_149730_j() && !block2.func_149730_j()) {
                b0 = 4;
            }
            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        if (side == 0 || side == 1) {
            return this.top;
        }
        if (side != metadata) {
            return this.blockIcon;
        }
        return this.sideBurn;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(this.getTextureName() + "_side");
        this.sideBurn = register.registerIcon(this.lighted ? this.getTextureName() + "_burning" : this.getTextureName() + "_front");
        this.top = register.registerIcon(this.getTextureName() + "_top");
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (world.isRemote) {
            return true;
        }
        TileEntityFurnace tileentityfurnace = (TileEntityFurnace)world.getTileEntity(x, y, z);
        if (tileentityfurnace != null) {
            entityPlayer.func_146101_a(tileentityfurnace);
        }
        return true;
    }

    public static void updateFurnaceBlockState(boolean lighted, World world, int x, int y, int z) {
        int metadata = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        updating = true;
        if (lighted) {
            world.setBlock(x, y, z, ModSDA.haradFurnaceOn);
            System.out.println(world.getBlock(x, y, z).getUnlocalizedName());
            System.out.println("On");
        } else {
            world.setBlock(x, y, z, ModSDA.haradFurnaceOff);
            System.out.println(world.getBlock(x, y, z).getUnlocalizedName());
            System.out.println("Off");
        }
        updating = false;
        world.setBlockMetadataWithNotify(x, y, z, metadata, 2);
        if (tileentity != null) {
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }

    public TileEntity createNewTileEntity(World world, int p_149915_2_) {
        return new FurnaceEntity();
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        int l = MathHelper.floor_double((double)((double)(entityLivingBase.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3;
        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        } else if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        } else if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        } else if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
        if (itemStack.hasDisplayName()) {
            ((TileEntityFurnace)world.getTileEntity(x, y, z)).func_145951_a(itemStack.getDisplayName());
        }
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int metadata) {
        TileEntityFurnace tileentityfurnace;
        if (!updating && (tileentityfurnace = (TileEntityFurnace)world.getTileEntity(x, y, z)) != null) {
            for (int i1 = 0; i1 < tileentityfurnace.getSizeInventory(); ++i1) {
                ItemStack itemstack = tileentityfurnace.getStackInSlot(i1);
                if (itemstack == null) continue;
                float f = this.random.nextFloat() * 0.8f + 0.1f;
                float f1 = this.random.nextFloat() * 0.8f + 0.1f;
                float f2 = this.random.nextFloat() * 0.8f + 0.1f;
                while (itemstack.stackSize > 0) {
                    int j1 = this.random.nextInt(21) + 10;
                    if (j1 > itemstack.stackSize) {
                        j1 = itemstack.stackSize;
                    }
                    itemstack.stackSize -= j1;
                    EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
                    if (itemstack.hasTagCompound()) {
                        entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                    }
                    float f3 = 0.05f;
                    entityitem.motionX = (float)this.random.nextGaussian() * f3;
                    entityitem.motionY = (float)this.random.nextGaussian() * f3 + 0.2f;
                    entityitem.motionZ = (float)this.random.nextGaussian() * f3;
                    world.spawnEntityInWorld((Entity)entityitem);
                }
            }
            world.func_147453_f(x, y, z, block);
        }
        super.breakBlock(world, x, y, z, block, metadata);
    }

    @SideOnly(value=Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
        if (this.lighted) {
            int l = world.getBlockMetadata(x, y, z);
            float f = (float)x + 0.5f;
            float f1 = (float)y + 0.0f + random.nextFloat() * 6.0f / 16.0f;
            float f2 = (float)z + 0.5f;
            float f3 = 0.52f;
            float f4 = random.nextFloat() * 0.6f - 0.3f;
            if (l == 4) {
                world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0, 0.0, 0.0);
                world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0, 0.0, 0.0);
            } else if (l == 5) {
                world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0, 0.0, 0.0);
                world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0, 0.0, 0.0);
            } else if (l == 2) {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0, 0.0, 0.0);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0, 0.0, 0.0);
            } else if (l == 3) {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0, 0.0, 0.0);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0, 0.0, 0.0);
            }
        }
    }

    public boolean hasComparatorInputOverride() {
        return true;
    }

    public int getComparatorInputOverride(World p_149736_1_, int p_149736_2_, int p_149736_3_, int p_149736_4_, int p_149736_5_) {
        return Container.calcRedstoneFromInventory((IInventory)((IInventory)p_149736_1_.getTileEntity(p_149736_2_, p_149736_3_, p_149736_4_)));
    }

    @SideOnly(value=Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return Item.getItemFromBlock((Block)ModSDA.haradFurnaceOff);
    }
}

