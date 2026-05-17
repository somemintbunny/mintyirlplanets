package net.mcreator.mintyirlplanets.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class DebuggerArmourItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(70, Map.of(ArmorType.BOOTS, 5, ArmorType.LEGGINGS, 8, ArmorType.CHESTPLATE, 10, ArmorType.HELMET, 5, ArmorType.BODY, 10), 15,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("block.big_dripleaf.fall")), 4f, 0.1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:debugger_armour_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("mintyirlplanets:debugger_armour")));

	private DebuggerArmourItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends DebuggerArmourItem {
		public Helmet(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends DebuggerArmourItem {
		public Chestplate(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends DebuggerArmourItem {
		public Leggings(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends DebuggerArmourItem {
		public Boots(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}