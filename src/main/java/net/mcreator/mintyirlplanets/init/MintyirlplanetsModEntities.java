/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.entity.*;
import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

@EventBusSubscriber
public class MintyirlplanetsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MintyirlplanetsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DebuggerEntity>> DEBUGGER = register("debugger",
			EntityType.Builder.<DebuggerEntity>of(DebuggerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ReaperEntity>> REAPER = register("reaper",
			EntityType.Builder.<ReaperEntity>of(ReaperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TosserGrenadeEntity>> TOSSER_GRENADE = register("tosser_grenade",
			EntityType.Builder.<TosserGrenadeEntity>of(TosserGrenadeEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LazerEntity>> LAZER = register("lazer",
			EntityType.Builder.<LazerEntity>of(LazerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EyezorEntity>> EYEZOR = register("eyezor",
			EntityType.Builder.<EyezorEntity>of(EyezorEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheCrusherEntity>> THE_CRUSHER = register("the_crusher",
			EntityType.Builder.<TheCrusherEntity>of(TheCrusherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MartianEntity>> MARTIAN = register("martian",
			EntityType.Builder.<MartianEntity>of(MartianEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShrumpherEntity>> SHRUMPHER = register("shrumpher",
			EntityType.Builder.<ShrumpherEntity>of(ShrumpherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BiberEntity>> BIBER = register("biber",
			EntityType.Builder.<BiberEntity>of(BiberEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<StillSlingerEntity>> STILL_SLINGER = register("still_slinger",
			EntityType.Builder.<StillSlingerEntity>of(StillSlingerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChokedZombieEntity>> CHOKED_ZOMBIE = register("choked_zombie",
			EntityType.Builder.<ChokedZombieEntity>of(ChokedZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TosserGrenadeEnemyEntity>> TOSSER_GRENADE_ENEMY = register("tosser_grenade_enemy",
			EntityType.Builder.<TosserGrenadeEnemyEntity>of(TosserGrenadeEnemyEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareEntity>> NIGHTMARE = register("nightmare",
			EntityType.Builder.<NightmareEntity>of(NightmareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(76).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<SbltEntity>> SBLT = register("sblt",
			EntityType.Builder.<SbltEntity>of(SbltEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DdbltEntity>> DDBLT = register("ddblt",
			EntityType.Builder.<DdbltEntity>of(DdbltEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LarryEntity>> LARRY = register("larry",
			EntityType.Builder.<LarryEntity>of(LarryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 7.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GleepGlorpEntity>> GLEEP_GLORP = register("gleep_glorp",
			EntityType.Builder.<GleepGlorpEntity>of(GleepGlorpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MintyirlplanetsMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		DebuggerEntity.init(event);
		ReaperEntity.init(event);
		EyezorEntity.init(event);
		TheCrusherEntity.init(event);
		MartianEntity.init(event);
		ShrumpherEntity.init(event);
		StillSlingerEntity.init(event);
		ChokedZombieEntity.init(event);
		NightmareEntity.init(event);
		LarryEntity.init(event);
		GleepGlorpEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DEBUGGER.get(), DebuggerEntity.createAttributes().build());
		event.put(REAPER.get(), ReaperEntity.createAttributes().build());
		event.put(EYEZOR.get(), EyezorEntity.createAttributes().build());
		event.put(THE_CRUSHER.get(), TheCrusherEntity.createAttributes().build());
		event.put(MARTIAN.get(), MartianEntity.createAttributes().build());
		event.put(SHRUMPHER.get(), ShrumpherEntity.createAttributes().build());
		event.put(STILL_SLINGER.get(), StillSlingerEntity.createAttributes().build());
		event.put(CHOKED_ZOMBIE.get(), ChokedZombieEntity.createAttributes().build());
		event.put(NIGHTMARE.get(), NightmareEntity.createAttributes().build());
		event.put(LARRY.get(), LarryEntity.createAttributes().build());
		event.put(GLEEP_GLORP.get(), GleepGlorpEntity.createAttributes().build());
	}
}