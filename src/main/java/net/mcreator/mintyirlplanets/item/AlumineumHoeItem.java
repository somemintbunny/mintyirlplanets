package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AlumineumHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 902, 10f, 0, 35, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:alumineum_hoe_repair_items")));

	public AlumineumHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, 4f, properties);
	}
}