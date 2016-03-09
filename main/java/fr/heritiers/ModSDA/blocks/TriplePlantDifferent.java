/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.util.IIcon
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.blocks.TriplePlant;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class TriplePlantDifferent
extends TriplePlant {
    private IIcon topIcon;
    private IIcon mediumIcon;

    public TriplePlantDifferent(String name, String textureName) {
        super(name, textureName);
    }

    @Override
    public IIcon func_149888_a(boolean top, int metadata) {
        if (metadata == 0) {
            return this.topIcon;
        }
        if (metadata == 1) {
            return this.mediumIcon;
        }
        return this.blockIcon;
    }

    @Override
    public IIcon getIcon(int side, int metadata) {
        if (metadata == 0) {
            return this.topIcon;
        }
        if (metadata == 1) {
            return this.mediumIcon;
        }
        return this.blockIcon;
    }

    @Override
    public void registerBlockIcons(IIconRegister iiconRegister) {
        this.blockIcon = iiconRegister.registerIcon(this.getTextureName() + "_bottom");
        this.mediumIcon = iiconRegister.registerIcon(this.getTextureName() + "_medium");
        this.topIcon = iiconRegister.registerIcon(this.getTextureName() + "_top");
    }
}

