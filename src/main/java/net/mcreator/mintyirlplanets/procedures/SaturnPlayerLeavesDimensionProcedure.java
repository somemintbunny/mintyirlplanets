package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModMobEffects;

public class SaturnPlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MintyirlplanetsModMobEffects.TOXIC_GAS);
	}
}