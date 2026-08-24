package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SiverShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 10f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:siver_shovel_repair_items")));

	public SiverShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -3f, properties);
	}
}