/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SandPile
extends Block {
    public SandPile(String name) {
        super(Material.sand);
        this.setBlockName(name);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.updateBlockBounds(0);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister iIconRegister) {
        this.blockIcon = iIconRegister.registerIcon("sand");
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        int metadata = world.getBlockMetadata(x, y, z) & 7;
        float f = 0.125f;
        return AxisAlignedBB.getBoundingBox((double)((double)x + this.minX), (double)((double)y + this.minY), (double)((double)z + this.minZ), (double)((double)x + this.maxX), (double)((float)y + (float)metadata * f), (double)((double)z + this.maxZ));
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void setBlockBoundsForItemRender() {
        this.updateBlockBounds(0);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iBlockAccess, int x, int y, int z) {
        this.updateBlockBounds(iBlockAccess.getBlockMetadata(x, y, z));
    }

    protected void updateBlockBounds(int metadata) {
        int newMetadata = metadata & 7;
        float newThickness = (float)(2 * (1 + newMetadata)) / 16.0f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, newThickness, 1.0f);
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        Block block = world.getBlock(x, y - 1, z);
        return block.isLeaves((IBlockAccess)world, x, y - 1, z) ? true : (block == this && (world.getBlockMetadata(x, y - 1, z) & 7) == 7 ? true : block.isOpaqueCube() && block.getMaterial().blocksMovement());
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if (!this.canPlaceBlockAt(world, x, y, z)) {
            world.setBlockToAir(x, y, z);
        }
    }

    public void harvestBlock(World world, EntityPlayer entityPlayer, int x, int y, int z, int metadata) {
        super.harvestBlock(world, entityPlayer, x, y, z, metadata);
        world.setBlockToAir(x, y, z);
    }

    public Item getItemDropped(int integer1, Random random, int integer2) {
        return null;
    }

    public int func_149745_a(Random random) {
        return 0;
    }

    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int x, int y, int z, int side) {
        return side == 1 ? true : super.shouldSideBeRendered(iBlockAccess, x, y, z, side);
    }

    public int quantityDropped(int meta, int fortune, Random random) {
        return (meta & 7) + 1;
    }

    public boolean isReplaceable(IBlockAccess world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        return meta >= 7 ? false : this.blockMaterial.isReplaceable();
    }
}

