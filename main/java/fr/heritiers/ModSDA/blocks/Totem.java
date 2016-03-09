/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.item.Item
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Totem
extends Block {
    int level;

    public Totem(String name, String textureName, int l) {
        super(Material.rock);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setTickRandomly(true);
        this.level = l;
        this.setLightLevel(1.0f - (float)(this.level / 5));
    }

    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_) {
        return Item.getItemFromBlock((Block)ModSDA.totemSafe);
    }
}

