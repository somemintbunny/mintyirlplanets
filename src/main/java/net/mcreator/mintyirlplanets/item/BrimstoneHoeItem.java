package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BrimstoneHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4595, 21f, 0, 112, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:brimstone_hoe_repair_items")));

	public BrimstoneHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, -0.5f, 20f, properties);
	}
}