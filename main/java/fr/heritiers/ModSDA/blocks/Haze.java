
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Haze
extends Block {
    public Haze(String name, String textureName, int lightOpacity) {
        super(Material.fire);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.naturalTab);
        this.setLightOpacity(lightOpacity);
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public int getRenderBlockPass() {
        return 1;
    }

    public boolean isBlockSolid(IBlockAccess iBlockAccess, int x, int y, int z, int side) {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return null;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int x, int y, int z, int side) {
        return true;
    }
}

