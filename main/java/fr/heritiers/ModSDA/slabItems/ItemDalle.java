/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.Block$SoundType
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.slabItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.blocks.Slab;
import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemDalle
extends ItemBlock {
    private final boolean isFull;
    private final BlockSlab singleSlab;
    private final BlockSlab doubleSlab;
    private static final String __OBFID = "CL_00000071";

    public ItemDalle(Block block) {
        super(block);
        this.setCreativeTab(ModSDA.slabTab);
        this.singleSlab = (Slab)Block.getBlockFromName((String)("tile." + block.getUnlocalizedName().substring(5, block.getUnlocalizedName().length())));
        this.doubleSlab = (Slab)Block.getBlockFromName((String)("tile.doubleS" + block.getUnlocalizedName().substring(6, block.getUnlocalizedName().length())));
        this.isFull = false;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon func_77617_a(int damage) {
        return Block.getBlockFromItem((Item)this).getIcon(2, damage);
    }

    public int func_77647_b(int metadata) {
        return metadata;
    }

    public String func_77667_c(ItemStack p_77667_1_) {
        return this.field_150939_a.getUnlocalizedName();
    }

    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        boolean flag;
        if (this.isFull) {
            return super.onItemUse(p_77648_1_, p_77648_2_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_);
        }
        if (p_77648_1_.stackSize == 0) {
            return false;
        }
        if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_)) {
            return false;
        }
        Block block = p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);
        int i1 = p_77648_3_.getBlockMetadata(p_77648_4_, p_77648_5_, p_77648_6_);
        int j1 = i1 & 7;
        boolean bl = flag = (i1 & 8) != 0;
        if ((p_77648_7_ == 1 && !flag || p_77648_7_ == 0 && flag) && block == this.singleSlab && j1 == p_77648_1_.getItemDamage()) {
            if (p_77648_3_.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBoxFromPool(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_)) && p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, (Block)this.doubleSlab, j1, 3)) {
                p_77648_3_.playSoundEffect((double)((float)p_77648_4_ + 0.5f), (double)((float)p_77648_5_ + 0.5f), (double)((float)p_77648_6_ + 0.5f), this.doubleSlab.stepSound.func_150496_b(), (this.doubleSlab.stepSound.getVolume() + 1.0f) / 2.0f, this.doubleSlab.stepSound.getPitch() * 0.8f);
                --p_77648_1_.stackSize;
            }
            return true;
        }
        return this.func_150946_a(p_77648_1_, p_77648_2_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_) ? true : super.onItemUse(p_77648_1_, p_77648_2_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_);
    }

    @SideOnly(value=Side.CLIENT)
    public boolean func_150936_a(World p_150936_1_, int p_150936_2_, int p_150936_3_, int p_150936_4_, int p_150936_5_, EntityPlayer p_150936_6_, ItemStack p_150936_7_) {
        boolean flag;
        int i1 = p_150936_2_;
        int j1 = p_150936_3_;
        int k1 = p_150936_4_;
        Block block = p_150936_1_.getBlock(p_150936_2_, p_150936_3_, p_150936_4_);
        int l1 = p_150936_1_.getBlockMetadata(p_150936_2_, p_150936_3_, p_150936_4_);
        int i2 = l1 & 7;
        boolean bl = flag = (l1 & 8) != 0;
        if ((p_150936_5_ == 1 && !flag || p_150936_5_ == 0 && flag) && block == this.singleSlab && i2 == p_150936_7_.getItemDamage()) {
            return true;
        }
        if (p_150936_5_ == 0) {
            --p_150936_3_;
        }
        if (p_150936_5_ == 1) {
            ++p_150936_3_;
        }
        if (p_150936_5_ == 2) {
            --p_150936_4_;
        }
        if (p_150936_5_ == 3) {
            ++p_150936_4_;
        }
        if (p_150936_5_ == 4) {
            --p_150936_2_;
        }
        if (p_150936_5_ == 5) {
            ++p_150936_2_;
        }
        Block block1 = p_150936_1_.getBlock(p_150936_2_, p_150936_3_, p_150936_4_);
        int j2 = p_150936_1_.getBlockMetadata(p_150936_2_, p_150936_3_, p_150936_4_);
        i2 = j2 & 7;
        return block1 == this.singleSlab && i2 == p_150936_7_.getItemDamage() ? true : super.func_150936_a(p_150936_1_, i1, j1, k1, p_150936_5_, p_150936_6_, p_150936_7_);
    }

    private boolean func_150946_a(ItemStack p_150946_1_, EntityPlayer p_150946_2_, World p_150946_3_, int p_150946_4_, int p_150946_5_, int p_150946_6_, int p_150946_7_) {
        if (p_150946_7_ == 0) {
            --p_150946_5_;
        }
        if (p_150946_7_ == 1) {
            ++p_150946_5_;
        }
        if (p_150946_7_ == 2) {
            --p_150946_6_;
        }
        if (p_150946_7_ == 3) {
            ++p_150946_6_;
        }
        if (p_150946_7_ == 4) {
            --p_150946_4_;
        }
        if (p_150946_7_ == 5) {
            ++p_150946_4_;
        }
        Block block = p_150946_3_.getBlock(p_150946_4_, p_150946_5_, p_150946_6_);
        int i1 = p_150946_3_.getBlockMetadata(p_150946_4_, p_150946_5_, p_150946_6_);
        int j1 = i1 & 7;
        if (block == this.singleSlab && j1 == p_150946_1_.getItemDamage()) {
            if (p_150946_3_.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBoxFromPool(p_150946_3_, p_150946_4_, p_150946_5_, p_150946_6_)) && p_150946_3_.setBlock(p_150946_4_, p_150946_5_, p_150946_6_, (Block)this.doubleSlab, j1, 3)) {
                p_150946_3_.playSoundEffect((double)((float)p_150946_4_ + 0.5f), (double)((float)p_150946_5_ + 0.5f), (double)((float)p_150946_6_ + 0.5f), this.doubleSlab.stepSound.func_150496_b(), (this.doubleSlab.stepSound.getVolume() + 1.0f) / 2.0f, this.doubleSlab.stepSound.getPitch() * 0.8f);
                --p_150946_1_.stackSize;
            }
            return true;
        }
        return false;
    }
}

