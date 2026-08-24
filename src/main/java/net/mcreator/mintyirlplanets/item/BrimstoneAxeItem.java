package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BrimstoneAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4595, 35f, 0, 112, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:brimstone_axe_repair_items")));

	public BrimstoneAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 47f, -1f, properties);
	}
}