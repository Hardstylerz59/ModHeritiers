/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockHay
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.util.IIcon
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHay;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Paille
extends BlockHay {
    private IIcon iconTop;
    private IIcon iconBottom;

    public Paille(String name, String textureName) {
        this.setCreativeTab(ModSDA.grassTab);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
    }

    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.iconTop = p_149651_1_.registerIcon("modsda:hay_bottom");
        this.iconBottom = p_149651_1_.registerIcon("modsda:hay_bottom");
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

