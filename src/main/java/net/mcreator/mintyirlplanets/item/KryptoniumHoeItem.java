package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class KryptoniumHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 660, 9f, 0, 28, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:kryptonium_hoe_repair_items")));

	public KryptoniumHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, 2f, properties);
	}
}