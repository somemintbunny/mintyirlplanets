package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AdamantiummSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1444, 13f, 0, 49, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:adamantiumm_sword_repair_items")));

	public AdamantiummSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 19f, 2f));
	}
}