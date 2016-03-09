
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BranchRock
extends BlockRotatedPillar {
    private IIcon sideIcon;

    public BranchRock(String name, String textureName) {
        super(Material.rock);
        this.setCreativeTab(ModSDA.branchTab);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setLightOpacity(0);
        this.setStepSound(soundTypeWood);
    }

    public int onBlockPlaced(World world, int x, int y, int z, int side, float deltaX, float deltaY, float deltaZ, int metadata) {
        float dX = deltaX - (float)((int)deltaX);
        float dY = deltaY - (float)((int)deltaY);
        float dZ = deltaZ - (float)((int)deltaZ);
        if (dZ == 0.0f) {
            if ((double)dX < 0.3 && (double)dY < 0.3) {
                world.setBlockMetadataWithNotify(x, y, z, 4, 2);
                return 4;
            }
            if ((double)dX > 0.7 && (double)dY < 0.3) {
                world.setBlockMetadataWithNotify(x, y, z, 3, 2);
                return 3;
            }
            if ((double)dX < 0.3 && (double)dY > 0.7) {
                world.setBlockMetadataWithNotify(x, y, z, 2, 2);
                return 2;
            }
            if ((double)dX > 0.7 && (double)dY > 0.7) {
                world.setBlockMetadataWithNotify(x, y, z, 1, 2);
                return 1;
            }
            world.setBlockMetadataWithNotify(x, y, z, 0, 2);
            return 0;
        }
        if (dY == 0.0f) {
            if ((double)dX < 0.3 && (double)dZ < 0.3) {
                world.setBlockMetadataWithNotify(x, y, z, 9, 2);
                return 9;
            }
            if ((double)dX > 0.7 && (double)dZ < 0.3) {
                world.setBlockMetadataWithNotify(x, y, z, 8, 2);
                return 8;
            }
            if ((double)dX < 0.3 && (double)dZ > 0.7) {
                world.setBlockMetadataWithNotify(x, y, z, 7, 2);
                return 7;
            }
            if ((double)dX > 0.7 && (double)dZ > 0.7) {
                world.setBlockMetadataWithNotify(x, y, z, 6, 2);
                return 6;
            }
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
            return 5;
        }
        if (dX == 0.0f) {
            if ((double)dY < 0.3 && (double)dZ < 0.3) {
                world.setBlockMetadataWithNotify(x, y, z, 14, 2);
                return 14;
            }
            if ((double)dY > 0.7 && (double)dZ < 0.3) {
                world.setBlockMetadataWithNotify(x, y, z, 13, 2);
                return 13;
            }
            if ((double)dY < 0.3 && (double)dZ > 0.7) {
                world.setBlockMetadataWithNotify(x, y, z, 12, 2);
                return 12;
            }
            if ((double)dY > 0.7 && (double)dZ > 0.7) {
                world.setBlockMetadataWithNotify(x, y, z, 11, 2);
                return 11;
            }
            world.setBlockMetadataWithNotify(x, y, z, 10, 2);
            return 10;
        }
        return metadata;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        double xD = x;
        double yD = y;
        double zD = z;
        int metadata = world.getBlockMetadata(x, y, z);
        if (metadata == 0) {
            return AxisAlignedBB.getBoundingBox((double)(xD + 0.25), (double)(yD + 0.25), (double)zD, (double)(xD + 0.75), (double)(yD + 0.75), (double)(zD + 1.0));
        }
        if (metadata == 1) {
            return AxisAlignedBB.getBoundingBox((double)(xD + 0.5), (double)(yD + 0.5), (double)zD, (double)(xD + 1.0), (double)(yD + 1.0), (double)(zD + 1.0));
        }
        if (metadata == 2) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)(yD + 0.5), (double)zD, (double)(xD + 0.5), (double)(yD + 1.0), (double)(zD + 1.0));
        }
        if (metadata == 3) {
            return AxisAlignedBB.getBoundingBox((double)(xD + 0.5), (double)yD, (double)zD, (double)(xD + 1.0), (double)(yD + 0.5), (double)(zD + 1.0));
        }
        if (metadata == 4) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)yD, (double)zD, (double)(xD + 0.5), (double)(yD + 0.5), (double)(zD + 1.0));
        }
        if (metadata == 5) {
            return AxisAlignedBB.getBoundingBox((double)(xD + 0.25), (double)yD, (double)(zD + 0.25), (double)(xD + 0.75), (double)(yD + 1.0), (double)(zD + 0.75));
        }
        if (metadata == 6) {
            return AxisAlignedBB.getBoundingBox((double)(xD + 0.5), (double)yD, (double)(zD + 0.5), (double)(xD + 1.0), (double)(yD + 1.0), (double)(zD + 1.0));
        }
        if (metadata == 7) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)yD, (double)(zD + 0.5), (double)(xD + 0.5), (double)(yD + 1.0), (double)(zD + 1.0));
        }
        if (metadata == 8) {
            return AxisAlignedBB.getBoundingBox((double)(xD + 0.5), (double)yD, (double)zD, (double)(xD + 1.0), (double)(yD + 1.0), (double)(zD + 0.5));
        }
        if (metadata == 9) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)yD, (double)zD, (double)(xD + 0.5), (double)(yD + 1.0), (double)(zD + 0.5));
        }
        if (metadata == 10) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)(yD + 0.25), (double)(zD + 0.25), (double)(xD + 1.0), (double)(yD + 0.75), (double)(zD + 0.75));
        }
        if (metadata == 11) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)(yD + 0.5), (double)(zD + 0.5), (double)(xD + 1.0), (double)(yD + 1.0), (double)(zD + 1.0));
        }
        if (metadata == 12) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)yD, (double)(zD + 0.5), (double)(xD + 1.0), (double)(yD + 0.5), (double)(zD + 1.0));
        }
        if (metadata == 13) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)(yD + 0.5), (double)zD, (double)(xD + 1.0), (double)(yD + 1.0), (double)(zD + 0.5));
        }
        if (metadata == 14) {
            return AxisAlignedBB.getBoundingBox((double)xD, (double)yD, (double)zD, (double)(xD + 1.0), (double)(yD + 0.5), (double)(zD + 0.5));
        }
        return AxisAlignedBB.getBoundingBox((double)(xD + 0.25), (double)(yD + 0.25), (double)zD, (double)(xD + 0.75), (double)(yD + 0.75), (double)(zD + 1.0));
    }

    public void func_149743_a(World world, int x, int y, int z, AxisAlignedBB axisAlignedBB, List list, Entity entity) {
        this.setBlockBoundsBasedOnState((IBlockAccess)world, x, y, z);
        super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iBlockAccess, int x, int y, int z) {
        int metadata = iBlockAccess.getBlockMetadata(x, y, z);
        if (metadata == 0) {
            this.setBlockBounds(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 1.0f);
        } else if (metadata == 1) {
            this.setBlockBounds(0.5f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (metadata == 2) {
            this.setBlockBounds(0.0f, 0.5f, 0.0f, 0.5f, 1.0f, 1.0f);
        } else if (metadata == 3) {
            this.setBlockBounds(0.5f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        } else if (metadata == 4) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 1.0f);
        } else if (metadata == 5) {
            this.setBlockBounds(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
        } else if (metadata == 6) {
            this.setBlockBounds(0.5f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
        } else if (metadata == 7) {
            this.setBlockBounds(0.0f, 0.0f, 0.5f, 0.5f, 1.0f, 1.0f);
        } else if (metadata == 8) {
            this.setBlockBounds(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
        } else if (metadata == 9) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 0.5f);
        } else if (metadata == 10) {
            this.setBlockBounds(0.0f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
        } else if (metadata == 11) {
            this.setBlockBounds(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f);
        } else if (metadata == 12) {
            this.setBlockBounds(0.0f, 0.0f, 0.5f, 1.0f, 0.5f, 1.0f);
        } else if (metadata == 13) {
            this.setBlockBounds(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 0.5f);
        } else if (metadata == 14) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.5f);
        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entity, int metadata, float deltaX, float deltaY, float deltaZ) {
        if (entity.inventory.getCurrentItem() != null) {
            return false;
        }
        int m = world.getBlockMetadata(x, y, z) + 1;
        if (m > 14) {
            m = 0;
        }
        world.setBlockMetadataWithNotify(x, y, z, m, 2);
        return true;
    }

    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 1.0f);
    }

    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(this.getTextureName() + "_top");
        this.sideIcon = register.registerIcon(this.getTextureName());
    }

    public IIcon getIcon(int side, int metadata) {
        if (metadata >= 0 && metadata <= 4) {
            if (side == 2 || side == 3) {
                return this.getTopIcon(metadata);
            }
            return this.getSideIcon(metadata);
        }
        if (metadata >= 5 && metadata <= 9) {
            if (side == 0 || side == 1) {
                return this.getTopIcon(metadata);
            }
            return this.getSideIcon(metadata);
        }
        if (metadata >= 10 && metadata <= 14) {
            if (side == 4 || side == 5) {
                return this.getTopIcon(metadata);
            }
            return this.getSideIcon(metadata);
        }
        return this.getSideIcon(metadata);
    }

    public static int func_150165_c(int integer1) {
        return integer1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public int func_149745_a(Random random) {
        return 1;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public Item getItemDropped(int integer1, Random random, int integer2) {
        return Item.getItemFromBlock((Block)this);
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int metadata) {
        int byt = 4;
        int bytPlus1 = byt + 1;
        if (world.checkChunksExist(x - bytPlus1, y - bytPlus1, z - bytPlus1, x + bytPlus1, y + bytPlus1, z + bytPlus1)) {
            for (int xDelta = - byt; xDelta <= byt; ++xDelta) {
                for (int yDelta = - byt; yDelta <= byt; ++yDelta) {
                    for (int zDelta = - byt; zDelta <= byt; ++zDelta) {
                        Block blockBis = world.getBlock(x + xDelta, y + yDelta, z + zDelta);
                        if (!blockBis.isLeaves((IBlockAccess)world, x + xDelta, y + yDelta, z + zDelta)) continue;
                        blockBis.beginLeavesDecay(world, x + xDelta, y + yDelta, z + zDelta);
                    }
                }
            }
        }
    }

    protected IIcon getSideIcon(int metadata) {
        return this.sideIcon;
    }

    protected IIcon getTopIcon(int metadata) {
        return this.blockIcon;
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
        return true;
    }

    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }

    private boolean checkSideIsSolid(Block block) {
        return false;
    }

}

