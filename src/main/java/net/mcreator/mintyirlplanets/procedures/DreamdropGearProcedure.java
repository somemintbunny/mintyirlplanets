package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModMobEffects;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModItems;

public class DreamdropGearProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (MintyirlplanetsModItems.KRYPTONIUM_ARMOR_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.KRYPTONIUM_ARMOR_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.KRYPTONIUM_ARMOR_BOOTS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.KRYPTONIUM_AXE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.KRYPTONIUM_PICKAXE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.KRYPTONIUM_SWORD.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				|| MintyirlplanetsModItems.KRYPTONIUM_ARMOR_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MintyirlplanetsModMobEffects.TOXIC_GAS, 60, 0, false, false));
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HEALTH_BOOST) ? _livEnt.getEffect(MobEffects.HEALTH_BOOST).getDuration() : 0) < 10
				&& MintyirlplanetsModItems.DREAMDROP_ARMOR_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()
				&& MintyirlplanetsModItems.DREAMDROP_ARMOR_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
				&& MintyirlplanetsModItems.DREAMDROP_ARMOR_BOOTS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
				&& MintyirlplanetsModItems.DREAMDROP_ARMOR_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 60, 4, false, false));
		}
	}
}