package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SiverAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 9.5f, 0, 4, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:siver_axe_repair_items")));

	public SiverAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9f, -3.2f, properties);
	}
}