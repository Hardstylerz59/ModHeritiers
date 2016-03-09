/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.util.IIcon
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Lingot
extends Block {
    private IIcon iconTop;
    private IIcon iconBottom;

    public Lingot(String name, String textureName) {
        super(Material.rock);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.decorationTab);
    }

    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.iconTop = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.iconBottom = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
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
}

