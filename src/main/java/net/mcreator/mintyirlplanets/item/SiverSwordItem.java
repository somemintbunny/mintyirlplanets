package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SiverSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 0f, 0, 7, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:siver_sword_repair_items")));

	public SiverSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 7f, -2.6f));
	}
}