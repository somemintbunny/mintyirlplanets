package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DreamdropHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2380, 16f, 0, 70, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:dreamdrop_hoe_repair_items")));

	public DreamdropHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, 11f, properties);
	}
}