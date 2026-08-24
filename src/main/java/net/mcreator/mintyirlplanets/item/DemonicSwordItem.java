package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DemonicSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1741, 14f, 0, 56, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:demonic_sword_repair_items")));

	public DemonicSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 23f, 2f));
	}
}