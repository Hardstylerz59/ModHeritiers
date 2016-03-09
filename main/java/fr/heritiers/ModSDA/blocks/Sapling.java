/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenBigTree
 *  net.minecraft.world.gen.feature.WorldGenTrees
 *  net.minecraft.world.gen.feature.WorldGenerator
 *  net.minecraftforge.event.terraingen.TerrainGen
 */
package fr.heritiers.ModSDA.blocks;

import fr.heritiers.ModSDA.common.ModSDA;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class Sapling
extends BlockBush {
    public Sapling(String name, String textureName) {
        this.setBlockName(name);
        this.setBlockTextureName(textureName);
        this.setTickRandomly(true);
        this.setCreativeTab(ModSDA.naturalTab);
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {
            super.updateTick(world, x, y, z, random);
            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0) {
                this.func_149879_c(world, x, y, z, random);
            }
        }
    }

    public void func_149879_c(World world, int x, int y, int z, Random random) {
        int l = world.getBlockMetadata(x, y, z);
        if ((l & 8) == 0) {
            world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
        } else {
            this.func_149878_d(world, x, y, z, random);
        }
    }

    public void func_149878_d(World world, int x, int y, int z, Random random) {
        if (!TerrainGen.saplingGrowTree((World)world, (Random)random, (int)x, (int)y, (int)z)) {
            return;
        }
        int metadata = world.getBlockMetadata(x, y, z) & 7;
        WorldGenBigTree object = (WorldGenBigTree) (random.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true));
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;
        Block block = Blocks.air;
        world.setBlock(x, y, z, block, 0, 4);
        if (!((WorldGenerator)object).generate(world, random, x + i1, y, z + j1)) {
            world.setBlock(x, y, z, (Block)this, metadata, 4);
        }
    }

    public boolean func_149880_a(World world, int x, int y, int z, int metadata) {
        return world.getBlock(x, y, z) == this && (world.getBlockMetadata(x, y, z) & 7) == metadata;
    }
}

