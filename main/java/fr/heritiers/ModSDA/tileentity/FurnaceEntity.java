/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemHoe
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.ItemTool
 *  net.minecraft.item.crafting.FurnaceRecipes
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityFurnace
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.blocks.Furnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;

public class FurnaceEntity
extends TileEntityFurnace {
    private static final int[] slotsTop = new int[]{0};
    private static final int[] slotsBottom = new int[]{2, 1};
    private static final int[] slotsSides = new int[]{1};
    private ItemStack[] furnaceItemStacks = new ItemStack[3];
    public int field_145956_a;
    public int field_145963_i;
    public int field_145961_j;
    private String field_145958_o;
    private static final String __OBFID = "CL_00000357";

    public int getSizeInventory() {
        return this.furnaceItemStacks.length;
    }

    public ItemStack getStackInSlot(int p_70301_1_) {
        return this.furnaceItemStacks[p_70301_1_];
    }

    public ItemStack func_70298_a(int p_70298_1_, int p_70298_2_) {
        if (this.furnaceItemStacks[p_70298_1_] == null) {
            return null;
        }
        if (this.furnaceItemStacks[p_70298_1_].stackSize <= p_70298_2_) {
            ItemStack itemstack = this.furnaceItemStacks[p_70298_1_];
            this.furnaceItemStacks[p_70298_1_] = null;
            return itemstack;
        }
        ItemStack itemstack = this.furnaceItemStacks[p_70298_1_].splitStack(p_70298_2_);
        if (this.furnaceItemStacks[p_70298_1_].stackSize == 0) {
            this.furnaceItemStacks[p_70298_1_] = null;
        }
        return itemstack;
    }

    public ItemStack func_70304_b(int p_70304_1_) {
        if (this.furnaceItemStacks[p_70304_1_] != null) {
            ItemStack itemstack = this.furnaceItemStacks[p_70304_1_];
            this.furnaceItemStacks[p_70304_1_] = null;
            return itemstack;
        }
        return null;
    }

    public void func_70299_a(int p_70299_1_, ItemStack p_70299_2_) {
        this.furnaceItemStacks[p_70299_1_] = p_70299_2_;
        if (p_70299_2_ != null && p_70299_2_.stackSize > this.func_70297_j_()) {
            p_70299_2_.stackSize = this.func_70297_j_();
        }
    }

    public String func_145825_b() {
        return this.func_145818_k_() ? this.field_145958_o : "container.furnace";
    }

    public boolean func_145818_k_() {
        return this.field_145958_o != null && this.field_145958_o.length() > 0;
    }

    public void func_145951_a(String p_145951_1_) {
        this.field_145958_o = p_145951_1_;
    }

    public void readFromNBT(NBTTagCompound p_145839_1_) {
        super.readFromNBT(p_145839_1_);
        NBTTagList nbttaglist = p_145839_1_.getTagList("Items", 10);
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");
            if (b0 < 0 || b0 >= this.furnaceItemStacks.length) continue;
            this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT((NBTTagCompound)nbttagcompound1);
        }
        this.field_145956_a = p_145839_1_.getShort("BurnTime");
        this.field_145961_j = p_145839_1_.getShort("CookTime");
        this.field_145963_i = FurnaceEntity.getItemBurnTime(this.furnaceItemStacks[1]);
        if (p_145839_1_.hasKey("CustomName", 8)) {
            this.field_145958_o = p_145839_1_.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound nbtTagCompound) {
        super.writeToNBT(nbtTagCompound);
        nbtTagCompound.setShort("BurnTime", (short)this.field_145956_a);
        nbtTagCompound.setShort("CookTime", (short)this.field_145961_j);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < this.furnaceItemStacks.length; ++i) {
            if (this.furnaceItemStacks[i] == null) continue;
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound1.setByte("Slot", (byte)i);
            this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
            nbttaglist.appendTag((NBTBase)nbttagcompound1);
        }
        nbtTagCompound.setTag("Items", (NBTBase)nbttaglist);
        if (this.func_145818_k_()) {
            nbtTagCompound.setString("CustomName", this.field_145958_o);
        }
    }

    public int func_70297_j_() {
        return 64;
    }

    @SideOnly(value=Side.CLIENT)
    public int func_145953_d(int p_145953_1_) {
        return this.field_145961_j * p_145953_1_ / 200;
    }

    @SideOnly(value=Side.CLIENT)
    public int func_145955_e(int p_145955_1_) {
        if (this.field_145963_i == 0) {
            this.field_145963_i = 200;
        }
        return this.field_145956_a * p_145955_1_ / this.field_145963_i;
    }

    public boolean func_145950_i() {
        return this.field_145956_a > 0;
    }

    public void func_145845_h() {
        boolean flag = this.field_145956_a > 0;
        boolean flag1 = false;
        if (this.field_145956_a > 0) {
            --this.field_145956_a;
        }
        if (!this.worldObj.isRemote) {
            if (this.field_145956_a != 0 || this.furnaceItemStacks[1] != null && this.furnaceItemStacks[0] != null) {
                if (this.field_145956_a == 0 && this.canSmelt()) {
                    this.field_145963_i = this.field_145956_a = FurnaceEntity.getItemBurnTime(this.furnaceItemStacks[1]);
                    if (this.field_145956_a > 0) {
                        flag1 = true;
                        if (this.furnaceItemStacks[1] != null) {
                            --this.furnaceItemStacks[1].stackSize;
                            if (this.furnaceItemStacks[1].stackSize == 0) {
                                this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItem(this.furnaceItemStacks[1]);
                            }
                        }
                    }
                }
                if (this.func_145950_i() && this.canSmelt()) {
                    ++this.field_145961_j;
                    if (this.field_145961_j == 200) {
                        this.field_145961_j = 0;
                        this.func_145949_j();
                        flag1 = true;
                    }
                } else {
                    this.field_145961_j = 0;
                }
            }
            if (flag != this.field_145956_a > 0) {
                flag1 = true;
                Furnace.updateFurnaceBlockState(this.field_145956_a > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if (flag1) {
            this.markDirty();
        }
    }

    private boolean canSmelt() {
        if (this.furnaceItemStacks[0] == null) {
            return false;
        }
        ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
        if (itemstack == null) {
            return false;
        }
        if (this.furnaceItemStacks[2] == null) {
            return true;
        }
        if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) {
            return false;
        }
        int result = this.furnaceItemStacks[2].stackSize + itemstack.stackSize;
        return result <= this.func_70297_j_() && result <= this.furnaceItemStacks[2].getMaxStackSize();
    }

    public void func_145949_j() {
        if (this.canSmelt()) {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
            if (this.furnaceItemStacks[2] == null) {
                this.furnaceItemStacks[2] = itemstack.copy();
            } else if (this.furnaceItemStacks[2].getItem() == itemstack.getItem()) {
                this.furnaceItemStacks[2].stackSize += itemstack.stackSize;
            }
            --this.furnaceItemStacks[0].stackSize;
            if (this.furnaceItemStacks[0].stackSize <= 0) {
                this.furnaceItemStacks[0] = null;
            }
        }
    }

    public static int getItemBurnTime(ItemStack p_145952_0_) {
        if (p_145952_0_ == null) {
            return 0;
        }
        Item item2 = p_145952_0_.getItem();
        if (item2 instanceof ItemBlock && Block.getBlockFromItem((Item)item2) != Blocks.air) {
            Block block = Block.getBlockFromItem((Item)item2);
            if (block == Blocks.wooden_slab) {
                return 150;
            }
            if (block.getMaterial() == Material.wood) {
                return 300;
            }
            if (block == Blocks.coal_block) {
                return 16000;
            }
        }
        if (item2 instanceof ItemTool && ((ItemTool)item2).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item2 instanceof ItemSword && ((ItemSword)item2).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item2 instanceof ItemHoe && ((ItemHoe)item2).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item2 == Items.stick) {
            return 100;
        }
        if (item2 == Items.coal) {
            return 1600;
        }
        if (item2 == Items.lava_bucket) {
            return 20000;
        }
        if (item2 == Item.getItemFromBlock((Block)Blocks.sapling)) {
            return 100;
        }
        if (item2 == Items.blaze_rod) {
            return 2400;
        }
        return GameRegistry.getFuelValue((ItemStack)p_145952_0_);
    }

    public static boolean isItemFuel(ItemStack itemStack) {
        return FurnaceEntity.getItemBurnTime(itemStack) > 0;
    }

    public boolean func_70300_a(EntityPlayer p_70300_1_) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : p_70300_1_.getDistanceSq((double)this.xCoord + 0.5, (double)this.yCoord + 0.5, (double)this.zCoord + 0.5) <= 64.0;
    }

    public void func_70295_k_() {
    }

    public void func_70305_f() {
    }

    public boolean func_94041_b(int p_94041_1_, ItemStack itemStack) {
        return p_94041_1_ == 2 ? false : (p_94041_1_ == 1 ? FurnaceEntity.isItemFuel(itemStack) : true);
    }

    public int[] func_94128_d(int p_94128_1_) {
        return p_94128_1_ == 0 ? slotsBottom : (p_94128_1_ == 1 ? slotsTop : slotsSides);
    }

    public boolean func_102007_a(int p_102007_1_, ItemStack itemStack, int p_102007_3_) {
        return this.func_94041_b(p_102007_1_, itemStack);
    }

    public boolean func_102008_b(int p_102008_1_, ItemStack itemStack, int p_102008_3_) {
        return p_102008_3_ != 0 || p_102008_1_ != 1 || itemStack.getItem() == Items.bucket;
    }
}

