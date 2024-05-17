package net.guh.cenezoicfauna.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.guh.cenezoicfauna.entity.ModEntities;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntityGeneration {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS), SpawnGroup.CREATURE,
                ModEntities.THYLACINE, 8, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS), SpawnGroup.CREATURE,
                ModEntities.THYLACINE, 5, 1, 1);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.ERODED_BADLANDS), SpawnGroup.CREATURE,
                ModEntities.THYLACINE, 5, 1, 1);
        SpawnRestriction.register(ModEntities.THYLACINE, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.TAIGA), SpawnGroup.CREATURE,
                ModEntities.MEGALONYX, 5, 1, 1);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA), SpawnGroup.CREATURE,
                ModEntities.MEGALONYX, 5, 1, 1);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), SpawnGroup.CREATURE,
                ModEntities.MEGALONYX, 5, 1, 1);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA), SpawnGroup.CREATURE,
                ModEntities.MEGALONYX, 3, 1, 1);
        SpawnRestriction.register(ModEntities.MEGALONYX, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }
}
