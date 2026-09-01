package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
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

import net.mcreator.mintyirlplanets.procedures.CombineProcedure;

import javax.annotation.Nullable;

import java.util.Map;

public abstract class MixolydianArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(150, Map.of(ArmorType.BOOTS, 20, ArmorType.LEGGINGS, 50, ArmorType.CHESTPLATE, 60, ArmorType.HELMET, 20, ArmorType.BODY, 60), 90,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 11f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("mintyirlplanets:mixolydian_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("mintyirlplanets:mixolydian_armor")));

	private MixolydianArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends MixolydianArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				CombineProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends MixolydianArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends MixolydianArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends MixolydianArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}