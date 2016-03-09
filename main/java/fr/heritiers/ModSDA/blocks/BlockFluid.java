/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fluids.BlockFluidClassic
 *  net.minecraftforge.fluids.Fluid
 */
package fr.heritiers.ModSDA.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid
extends BlockFluidClassic {
    private IIcon stillIcon;
    private IIcon flowingIcon;

    public BlockFluid(Fluid fluid, Material material, String name, String textureName) {
        super(fluid, material);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
    }

    public IIcon getIcon(int side, int meta) {
        return side == 0 || side == 1 ? this.stillIcon : this.flowingIcon;
    }

    public void registerBlockIcons(IIconRegister register) {
        this.stillIcon = register.registerIcon(this.getTextureName() + "_still");
        this.flowingIcon = register.registerIcon(this.getTextureName() + "_flow");
    }

    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
        if (world.getBlock(x, y, z).getMaterial().isLiquid()) {
            return false;
        }
        return super.canDisplace(world, x, y, z);
    }

    public boolean displaceIfPossible(World world, int x, int y, int z) {
        if (world.getBlock(x, y, z).getMaterial().isLiquid()) {
            return false;
        }
        return super.displaceIfPossible(world, x, y, z);
    }
}

