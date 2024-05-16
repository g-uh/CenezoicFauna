package net.guh.cenezoicfauna.entity.custom;


import net.guh.cenezoicfauna.entity.ModEntities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public class ThylacineEntity extends AnimalEntity {
    public ThylacineEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new TemptGoal(this, 1.25D, Ingredient.ofItems(Items.CHICKEN), false));
        this.goalSelector.add(2, new FleeEntityGoal<>(this, PlayerEntity.class, 16.0f, 1.6, 1.4));
        this.goalSelector.add( 3, new AnimalMateGoal(this, 1.15D));
        this.goalSelector.add( 4, new WanderAroundFarGoal(this, 1D));
        this.goalSelector.add( 4, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add( 4, new LookAroundGoal(this));

    }

    public static DefaultAttributeContainer.Builder createThylacineAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.THYLACINE.create(world);
    }
}
