/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockGrass
 *  net.minecraft.block.material.Material
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.world.ColorizerGrass
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.BiomeGenBase
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class GrassBlocColor
extends BlockGrass {
    public GrassBlocColor(String name, String textureName) {
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setCreativeTab(ModSDA.grassTab);
        this.setTickRandomly(true);
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (world.isRemote) {
            return;
        }
        if (world.getBlockLightValue(x, y + 1, z) < 4 && world.getBlockLightOpacity(x, y + 1, z) > 2) {
            world.setBlock(x, y, z, Blocks.dirt);
            return;
        }
        if (world.getBlockLightValue(x, y + 1, z) >= 9) {
            for (int i = 0; i < 4; ++i) {
                int xRandom = x + random.nextInt(3) - 1;
                int yRandom = y + random.nextInt(5) - 3;
                int zRandom = z + random.nextInt(3) - 1;
                Block block = world.getBlock(xRandom, yRandom + 1, zRandom);
                if (world.getBlock(xRandom, yRandom, zRandom) != Blocks.dirt || world.getBlockMetadata(xRandom, yRandom, zRandom) != 0 || world.getBlockLightValue(xRandom, yRandom + 1, zRandom) < 4 || world.getBlockLightOpacity(xRandom, yRandom + 1, zRandom) > 2) continue;
                world.setBlock(xRandom, yRandom, zRandom, ModSDA.driedGrass);
            }
        }
    }

    public Item getItemDropped(int integer1, Random random, int integer2) {
        return Blocks.dirt.getItemDropped(0, random, integer2);
    }

    public int getBlockColor() {
        double d0 = 0.5;
        double d1 = 1.0;
        return ColorizerGrass.getGrassColor((double)d0, (double)d1);
    }

    public int getRenderColor(int integer) {
        return this.getBlockColor();
    }

    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        return 12564309;
    }

    public void func_149853_b(World world, Random random, int x, int y, int z) {
        block0 : for (int l = 0; l < 128; ++l) {
            int xBis = x;
            int yPlus = y + 1;
            int zBis = z;
            for (int integer = 0; integer < l / 16; ++integer) {
                if (world.getBlock(xBis += random.nextInt(3) - 1, (yPlus += (random.nextInt(3) - 1) * random.nextInt(3) / 2) - 1, zBis += random.nextInt(3) - 1) != ModSDA.driedGrass || world.getBlock(xBis, yPlus, zBis).isNormalCube()) continue block0;
            }
            if (world.getBlock(xBis, yPlus, zBis).getMaterial() != Material.air) continue;
            if (random.nextInt(8) != 0) {
                if (!ModSDA.doubleDriedGrass.canBlockStay(world, xBis, yPlus, zBis)) continue;
                world.setBlock(xBis, yPlus, zBis, ModSDA.doubleDriedGrass, 1, 3);
                continue;
            }
            world.getBiomeGenForCoords(xBis, zBis).plantFlower(world, random, xBis, yPlus, zBis);
        }
    }
}

