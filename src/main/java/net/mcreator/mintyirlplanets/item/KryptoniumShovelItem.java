package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class KryptoniumShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 660, 9f, 0, 28, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:kryptonium_shovel_repair_items")));

	public KryptoniumShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -2f, properties);
	}
}