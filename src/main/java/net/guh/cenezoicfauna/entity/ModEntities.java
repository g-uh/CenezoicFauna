package net.guh.cenezoicfauna.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.guh.cenezoicfauna.CenezoicFauna;
import net.guh.cenezoicfauna.entity.custom.MegalonyxEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MegalonyxEntity> MEGALONYX = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(CenezoicFauna.MOD_ID, "megalonyx"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MegalonyxEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 1.5f)).build());
}
