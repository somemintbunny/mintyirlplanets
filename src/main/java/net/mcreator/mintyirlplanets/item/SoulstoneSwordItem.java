package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SoulstoneSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4838, 21f, 0, 116, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:soulstone_sword_repair_items")));

	public SoulstoneSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 49f, 9f));
	}
}