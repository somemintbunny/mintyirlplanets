package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
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
			{
				Entity _ent = entity;
				if (_ent.level() instanceof ServerLevel _serverLevel) {
					_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.parse("mintyirlplanets:toxic_smoke")))), 3);
				}
			}
		}
	}
}