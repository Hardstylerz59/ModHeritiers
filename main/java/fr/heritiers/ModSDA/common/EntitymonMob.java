/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.attributes.IAttribute
 *  net.minecraft.entity.ai.attributes.IAttributeInstance
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.world.World
 */
package fr.heritiers.ModSDA.common;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntitymonMob
extends EntityMob {
    public EntitymonMob(World par1World) {
        super(par1World);
    }

    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0);
    }
}

