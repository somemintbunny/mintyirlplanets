package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AdamantiummShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1444, 19f, 0, 49, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:adamantiumm_shovel_repair_items")));

	public AdamantiummShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 15f, 0f, properties);
	}
}