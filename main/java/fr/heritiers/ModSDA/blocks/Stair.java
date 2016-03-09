package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Stair
extends BlockStairs {
    Block block;
    int metadata;

    public Stair(Block b, String name) {
        this(b, name, 0);
    }

    public Stair(Block b, String name, int m) {
        super(b, 0);
        this.block = b;
        this.setBlockName(name);
        this.setCreativeTab(ModSDA.stairsTab);
        this.metadata = m;
        this.setLightOpacity(0);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int side, int m) {
        return this.block.getIcon(side, this.metadata);
    }
}

