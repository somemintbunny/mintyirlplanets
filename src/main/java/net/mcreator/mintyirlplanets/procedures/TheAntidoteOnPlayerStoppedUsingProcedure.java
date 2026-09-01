package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModMobEffects;

public class TheAntidoteOnPlayerStoppedUsingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MintyirlplanetsModMobEffects.ANTI_TOXIN, 36000, 1, false, false));
	}
}