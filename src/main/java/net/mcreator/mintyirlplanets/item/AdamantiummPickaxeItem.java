package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AdamantiummPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1444, 24f, 0, 49, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:adamantiumm_pickaxe_repair_items")));

	public AdamantiummPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 13f, 0f));
	}
}