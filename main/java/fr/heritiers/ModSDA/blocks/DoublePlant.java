
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class DoublePlant
extends BlockDoublePlant {
    @SideOnly(value=Side.CLIENT)
    private IIcon doublePlantBottomIcon;
    @SideOnly(value=Side.CLIENT)
    private IIcon doublePlantTopIcon;

    public DoublePlant(String name, String textureName) {
    	this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.naturalTab);
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon func_149691_a(int p_149691_1_, int p_149691_2_) {
        return DoublePlant.func_149887_c((int)p_149691_2_) ? this.doublePlantBottomIcon : this.doublePlantBottomIcon;
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon func_149888_a(boolean p_149888_1_, int p_149888_2_) {
        return p_149888_1_ ? this.doublePlantTopIcon : this.doublePlantBottomIcon;
    }

    @SideOnly(value=Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
        return 16777215;
    }

    @SideOnly(value=Side.CLIENT)
    public void func_149651_a(IIconRegister register) {
        this.doublePlantBottomIcon = register.registerIcon(this.getTextureName() + "_bottom");
        this.doublePlantTopIcon = register.registerIcon(this.getTextureName());
        this.sunflowerIcons = new IIcon[2];
        this.sunflowerIcons[0] = register.registerIcon("modsda:vide");
        this.sunflowerIcons[1] = register.registerIcon("modsda:vide");
    }

    @SideOnly(value=Side.CLIENT)
    public void func_149666_a(Item item2, CreativeTabs creativeTab, List list) {
        list.add(new ItemStack(item2, 1, 1));
    }
}

