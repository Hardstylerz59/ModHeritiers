/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FloorDecoration
extends Block {
    private int tickingRender;

    public FloorDecoration(Material material, String name, String textureName, int tR) {
        super(material);
        this.tickingRender = tR;
        this.setBlockName(name);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f);
        this.setBlockTextureName(textureName);
        this.setTickRandomly(true);
        this.setCreativeTab(ModSDA.decorationTab);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        this.setBlockBoundsBasedOnState((IBlockAccess)world, x, y, z);
        return super.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.getBlock(x, y - 1, z).renderAsNormalBlock();
    }

    public int quantityDropped(Random p_149745_1_) {
        return 0;
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (world.getSavedLightValue(EnumSkyBlock.Block, x, y, z) > 11) {
            world.setBlockToAir(x, y, z);
        }
    }

    @SideOnly(value=Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int x, int y, int z, int side) {
        return true;
    }

    public boolean isReplaceable(IBlockAccess world, int x, int y, int z) {
        return true;
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockToAir(x, y, z);
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        return !world.isAirBlock(x, y - 1, z);
    }

    public int func_149692_a(int damage) {
        return damage;
    }

    @SideOnly(value=Side.CLIENT)
    public void getSubBlocks(Item item2, CreativeTabs creativeTab, List list) {
        list.add(new ItemStack(item2, 1, 0));
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(this.getTextureName());
    }
}

