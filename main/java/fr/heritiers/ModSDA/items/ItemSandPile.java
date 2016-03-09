/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.Block$SoundType
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlockWithMetadata
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.items;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class ItemSandPile
extends ItemBlockWithMetadata {
    private static final String __OBFID = "CL_00000068";

    public ItemSandPile(Block block1, Block block2) {
        super(block1, block2);
        this.setCreativeTab(ModSDA.grassTab);
    }

    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int integer, float deltaX, float deltaY, float deltaZ) {
        int newMetadata;
        int metadata;
        if (itemStack.stackSize == 0 || !entityPlayer.canPlayerEdit(x, y, z, integer, itemStack)) {
            return false;
        }
        Block block = world.getBlock(x, y, z);
        if (block == ModSDA.sandPile && (newMetadata = (metadata = world.getBlockMetadata(x, y, z)) & 7) <= 6 && world.checkNoEntityCollision(this.field_150939_a.getCollisionBoundingBoxFromPool(world, x, y, z)) && world.setBlockMetadataWithNotify(x, y, z, newMetadata + 1 | metadata & -8, 2)) {
            world.playSoundEffect((double)((float)x + 0.5f), (double)((float)y + 0.5f), (double)((float)z + 0.5f), this.field_150939_a.stepSound.func_150496_b(), (this.field_150939_a.stepSound.getVolume() + 1.0f) / 2.0f, this.field_150939_a.stepSound.getPitch() * 0.8f);
            --itemStack.stackSize;
            return true;
        }
        return super.onItemUse(itemStack, entityPlayer, world, x, y, z, integer, deltaX, deltaY, deltaZ);
    }
}

