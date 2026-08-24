package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AdamantiummHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1444, 13f, 0, 49, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:adamantiumm_hoe_repair_items")));

	public AdamantiummHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, 7f, properties);
	}
}