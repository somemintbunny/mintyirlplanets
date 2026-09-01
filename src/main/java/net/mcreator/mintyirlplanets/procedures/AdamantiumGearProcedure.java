package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModMobEffects;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModItems;

public class AdamantiumGearProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.REGENERATION) ? _livEnt.getEffect(MobEffects.REGENERATION).getDuration() : 0) < 10
				&& MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()
				&& MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
				&& MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_BOOTS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
				&& MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 60, 0, false, false));
		}
		if (MintyirlplanetsModItems.DEMONIC_ARMOR_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.DEMONIC_ARMOR_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.DEMONIC_ARMOR_BOOTS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.DEMONIC_ARMOR_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.DEMONIC_PICKAXE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.DEMONIC_AXE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.DEMONIC_SWORD.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MintyirlplanetsModMobEffects.TOXIC_GAS, 60, 1, false, false));
		}
	}
}