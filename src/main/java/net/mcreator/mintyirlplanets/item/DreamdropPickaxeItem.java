package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DreamdropPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2380, 13f, 0, 70, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:dreamdrop_pickaxe_repair_items")));

	public DreamdropPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 9f, 11f));
	}
}