package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AdamantiummAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1444, 20f, 0, 49, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:adamantiumm_axe_repair_items")));

	public AdamantiummAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 27f, -3.5f, properties);
	}
}