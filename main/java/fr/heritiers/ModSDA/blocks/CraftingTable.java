/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class CraftingTable
extends Block {
    @SideOnly(value=Side.CLIENT)
    private IIcon iconTop;
    private int kindTicking;

    public CraftingTable(Material material, String name, String textureName, boolean ticking, int kind, float light) {
        super(material);
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.decorationTab);
        this.setTickRandomly(ticking);
        this.setLightLevel(light);
        this.kindTicking = 1;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(this.getTextureName() + "_side");
        this.iconTop = register.registerIcon(this.getTextureName() + "_top");
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        if (side == 1 || side == 0) {
            return this.iconTop;
        }
        return this.blockIcon;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (world.isRemote) {
            entityPlayer.displayGUIWorkbench(x, y, z);
        }
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
        double deltaX = random.nextDouble() * 0.6 + 0.2;
        double deltaXBis = random.nextDouble() * 0.6 + 0.2;
        double deltaZ = random.nextDouble() * 0.6 + 0.2;
        world.spawnParticle("flame", (double)x + deltaX, (double)y + 1.1, (double)z + deltaZ, 0.0, 0.0, 0.0);
        world.spawnParticle("flame", (double)x + deltaXBis, (double)y + 1.1, (double)z + deltaZ, 0.0, 0.0, 0.0);
        world.spawnParticle("smoke", (double)x + deltaZ, (double)y + 1.1, (double)z + deltaX, 0.0, 0.0, 0.0);
    }
}

