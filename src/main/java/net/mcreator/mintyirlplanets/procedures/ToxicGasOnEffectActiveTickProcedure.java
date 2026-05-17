package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModMobEffects;

public class ToxicGasOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MintyirlplanetsModMobEffects.ANTI_TOXIN)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MintyirlplanetsModMobEffects.TOXIC_GAS);
		} else {
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("mintyirlplanets:toxic_smoke")))), 3);
		}
	}
}