package net.mcreator.mintyirlplanets.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.gameevent.vibrations.VibrationSystem;
import net.minecraft.world.level.gameevent.PositionSource;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.EntityPositionSource;
import net.minecraft.world.level.gameevent.DynamicGameEventListener;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModEntities;

import javax.annotation.Nullable;

import java.util.function.BiConsumer;

public class LarryEntity extends Monster implements RangedAttackMob, VibrationSystem {
	private final DynamicGameEventListener<VibrationSystem.Listener> dynamicGameEventListener = new DynamicGameEventListener(new VibrationSystem.Listener(this));
	private final VibrationSystem.User vibrationUser = new VibrationUser();
	private VibrationSystem.Data vibrationData = new VibrationSystem.Data();

	public LarryEntity(EntityType<LarryEntity> type, Level world) {
		super(type, world);
		xpReward = 9547;
		setNoAi(false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public void addAdditionalSaveData(ValueOutput valueOutput) {
		super.addAdditionalSaveData(valueOutput);
		valueOutput.store("listener", VibrationSystem.Data.CODEC, this.vibrationData);
	}

	@Override
	public void readAdditionalSaveData(ValueInput valueInput) {
		super.readAdditionalSaveData(valueInput);
		this.vibrationData = valueInput.read("listener", VibrationSystem.Data.CODEC).orElseGet(VibrationSystem.Data::new);
	}

	@Override
	public void updateDynamicGameEventListener(BiConsumer<DynamicGameEventListener<?>, ServerLevel> listenerConsumer) {
		if (this.level() instanceof ServerLevel serverLevel) {
			listenerConsumer.accept(this.dynamicGameEventListener, serverLevel);
		}
	}

	@Override
	public VibrationSystem.Data getVibrationData() {
		return this.vibrationData;
	}

	@Override
	public VibrationSystem.User getVibrationUser() {
		return this.vibrationUser;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level() instanceof ServerLevel serverLevel) {
			VibrationSystem.Ticker.tick(serverLevel, this.vibrationData, this.vibrationUser);
		}
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		TosserGrenadeEntity.shoot(this, target);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(MintyirlplanetsModEntities.LARRY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)),
				RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 800);
		builder = builder.add(Attributes.ARMOR, 20);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 40);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);
		builder = builder.add(Attributes.STEP_HEIGHT, 2);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 5);
		return builder;
	}

	private class VibrationUser implements VibrationSystem.User {
		private final LarryEntity entity = LarryEntity.this;
		private final PositionSource positionSource = new EntityPositionSource(this.entity, this.entity.getEyeHeight());

		@Override
		public PositionSource getPositionSource() {
			return this.positionSource;
		}

		@Override
		public TagKey<GameEvent> getListenableEvents() {
			return TagKey.create(Registries.GAME_EVENT, ResourceLocation.withDefaultNamespace("larry_can_listen"));
		}

		@Override
		public int getListenerRadius() {
			return 7;
		}

		@Override
		public boolean canReceiveVibration(ServerLevel world, BlockPos vibrationPos, Holder<GameEvent> holder, GameEvent.Context context) {
			return true;
		}

		@Override
		public void onReceiveVibration(ServerLevel world, BlockPos vibrationPos, Holder<GameEvent> holder, @Nullable Entity vibrationSource, @Nullable Entity projectileShooter, float distance) {
		}
	}
}