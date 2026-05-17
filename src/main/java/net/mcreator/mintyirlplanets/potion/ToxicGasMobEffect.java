package net.mcreator.mintyirlplanets.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mintyirlplanets.procedures.ToxicGasOnEffectActiveTickProcedure;

public class ToxicGasMobEffect extends MobEffect {
	public ToxicGasMobEffect() {
		super(MobEffectCategory.HARMFUL, -13001634);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		ToxicGasOnEffectActiveTickProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}