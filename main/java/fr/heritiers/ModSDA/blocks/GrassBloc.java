/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.common.IPlantable
 *  net.minecraftforge.common.util.ForgeDirection
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class GrassBloc
extends Block {
    private IIcon iconTop;
    private IIcon iconBottom;

    public GrassBloc(String name, String textureName) {
        super(Material.grass);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.grassTab);
        this.setTickRandomly(true);
    }

    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(this.getTextureName() + "_side");
        this.iconTop = register.registerIcon(this.getTextureName() + "_top");
        this.iconBottom = register.registerIcon("modsda:dirt");
    }

    public IIcon getIcon(int side, int metadata) {
        if (side == 0) {
            return this.iconBottom;
        }
        if (side == 1) {
            return this.iconTop;
        }
        return this.blockIcon;
    }

    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        return true;
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {
            if (world.getBlockLightValue(x, y + 1, z) < 4 && world.getBlockLightOpacity(x, y + 1, z) > 2) {
                world.setBlock(x, y, z, Blocks.dirt);
            } else if (world.getBlockLightValue(x, y + 1, z) >= 9) {
                for (int i = 0; i < 4; ++i) {
                    int deltaX = x + random.nextInt(3) - 1;
                    int deltaY = y + random.nextInt(5) - 3;
                    int deltaZ = z + random.nextInt(3) - 1;
                    Block block = world.getBlock(deltaX, deltaY + 1, deltaZ);
                    if (world.getBlock(deltaX, deltaY, deltaZ) != Blocks.dirt || world.getBlockMetadata(deltaX, deltaY, deltaZ) != 0 || world.getBlockLightValue(deltaX, deltaY + 1, deltaZ) < 4 || world.getBlockLightOpacity(deltaX, deltaY + 1, deltaZ) > 2) continue;
                    world.setBlock(deltaX, deltaY, deltaZ, ModSDA.driedGrass);
                }
            }
        }
    }
}

