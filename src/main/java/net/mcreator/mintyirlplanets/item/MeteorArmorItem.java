package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Rarity;
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
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.mintyirlplanets.procedures.TheuhhthingyProcedure;

import javax.annotation.Nullable;

import java.util.Map;

public abstract class MeteorArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(175, Map.of(ArmorType.BOOTS, 24, ArmorType.LEGGINGS, 52, ArmorType.CHESTPLATE, 64, ArmorType.HELMET, 28, ArmorType.BODY, 64), 90,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 14f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("mintyirlplanets:meteor_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("mintyirlplanets:meteor_armor")));

	private MeteorArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends MeteorArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				TheuhhthingyProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends MeteorArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends MeteorArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends MeteorArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}