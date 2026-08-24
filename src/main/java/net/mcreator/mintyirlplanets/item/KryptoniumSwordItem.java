package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class KryptoniumSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 660, 9f, 0, 28, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:kryptonium_sword_repair_items")));

	public KryptoniumSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 11f, -1f));
	}
}