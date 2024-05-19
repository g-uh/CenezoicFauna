package net.guh.cenozoicfauna.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.guh.cenozoicfauna.CenozoicFauna;
import net.guh.cenozoicfauna.entity.custom.MegalonyxEntity;
import net.guh.cenozoicfauna.entity.custom.SmilodonEntity;
import net.guh.cenozoicfauna.entity.custom.ThylacineEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MegalonyxEntity> MEGALONYX = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(CenozoicFauna.MOD_ID, "megalonyx"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MegalonyxEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 1.5f)).build());

    public static final EntityType<ThylacineEntity> THYLACINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(CenozoicFauna.MOD_ID, "thylacine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ThylacineEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.65f)).build());

    public static final EntityType<SmilodonEntity> SMILODON = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(CenozoicFauna.MOD_ID, "smilodon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SmilodonEntity::new)
                    .dimensions(EntityDimensions.fixed(1.1f, 1.1f)).build());

    public static void registerModEntities() {

        CenozoicFauna.LOGGER.info("Registering Entities for " + CenozoicFauna.MOD_ID);

    }

}
