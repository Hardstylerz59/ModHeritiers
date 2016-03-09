/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fluids.Fluid
 */
package fr.heritiers.ModSDA.blocks;

import net.minecraftforge.fluids.Fluid;

public class NewFluid
extends Fluid {
    public NewFluid(String fluidName, int d, int v) {
        super(fluidName);
        this.setDensity(d);
        this.setViscosity(v);
        this.setUnlocalizedName(fluidName);
    }
}

