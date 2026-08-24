package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MixolydianHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6280, 24f, 0, 140, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:mixolydian_hoe_repair_items")));

	public MixolydianHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9f, 26f, properties);
	}
}