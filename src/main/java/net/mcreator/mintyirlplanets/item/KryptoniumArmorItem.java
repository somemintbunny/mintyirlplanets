package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.mintyirlplanets.procedures.KryptoniumGearProcedure;

import javax.annotation.Nullable;

import java.util.function.Consumer;
import java.util.Map;

public abstract class KryptoniumArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(48, Map.of(ArmorType.BOOTS, 4, ArmorType.LEGGINGS, 10, ArmorType.CHESTPLATE, 12, ArmorType.HELMET, 4, ArmorType.BODY, 12), 18,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 3f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("mintyirlplanets:kryptonium_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("mintyirlplanets:kryptonium_armor")));

	private KryptoniumArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends KryptoniumArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_helmet.description_0"));
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_helmet.description_1"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				KryptoniumGearProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends KryptoniumArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_chestplate.description_0"));
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_chestplate.description_1"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				KryptoniumGearProcedure.execute(entity);
			}
		}
	}

	public static class Leggings extends KryptoniumArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_leggings.description_0"));
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_leggings.description_1"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				KryptoniumGearProcedure.execute(entity);
			}
		}
	}

	public static class Boots extends KryptoniumArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_boots.description_0"));
			componentConsumer.accept(Component.translatable("item.mintyirlplanets.kryptonium_armor_boots.description_1"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				KryptoniumGearProcedure.execute(entity);
			}
		}
	}
}