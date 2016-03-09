package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class VerticalSlab
extends BlockRotatedPillar {
    Block block;
    int metadata;

    public VerticalSlab(Block b, String name) {
        this(b, name, 0);
    }

    public VerticalSlab(Block b, String name, int m) {
        super(b.getMaterial());
        this.block = b;
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.verticalSlabTab);
        this.setLightOpacity(0);
        this.metadata = m;
        this.setTickRandomly(false);
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        int rotation = MathHelper.floor_double((double)((double)(entityLivingBase.rotationYaw * 4.0f / 360.0f) + 0.5)) & 3;
        int previousMetadata = world.getBlockMetadata(x, y, z) & 4;
        if (rotation == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (rotation == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (rotation == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
        if (rotation == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
    }

    public int onBlockPlaced(World world, int x, int y, int z, int side, float deltaX, float deltaY, float deltaZ, int metadata) {
        super.onBlockPlaced(world, x, y, z, side, deltaX, deltaY, deltaZ, metadata);
        return metadata;
    }

    public boolean canPlaceBlockOnSide(World world, int x, int y, int z, int metadata) {
        return true;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        int metadata = world.getBlockMetadata(x, y, z);
        if (metadata == 3) {
            return AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)((double)x + 1.0), (double)((double)y + 1.0), (double)((double)z + 0.5));
        }
        if (metadata == 5) {
            return AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)((double)x + 0.5), (double)((double)y + 1.0), (double)((double)z + 1.0));
        }
        if (metadata == 4) {
            return AxisAlignedBB.getBoundingBox((double)((double)x + 0.5), (double)y, (double)z, (double)((double)x + 1.0), (double)((double)y + 1.0), (double)((double)z + 1.0));
        }
        if (metadata == 2) {
            return AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)((double)z + 0.5), (double)((double)x + 1.0), (double)((double)y + 1.0), (double)((double)z + 1.0));
        }
        return AxisAlignedBB.getBoundingBox((double)((double)x + 0.5), (double)y, (double)z, (double)((double)x + 1.0), (double)((double)y + 1.0), (double)((double)z + 1.0));
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iBlockAccess, int x, int y, int z) {
        int metadata = iBlockAccess.getBlockMetadata(x, y, z);
        if (metadata == 3) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
        } else if (metadata == 5) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
        } else if (metadata == 4) {
            this.setBlockBounds(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (metadata == 2) {
            this.setBlockBounds(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
        }
    }

    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public IIcon getIcon(int side, int m) {
        return this.block.getIcon(side, this.metadata);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public IIcon getSideIcon(int m) {
        return this.block.getBlockTextureFromSide(this.metadata);
    }

    public IIcon getTopIcon(int m) {
        return this.block.getBlockTextureFromSide(this.metadata);
    }

    public void registerBlockIcons(IIconRegister register) {
    }

}

