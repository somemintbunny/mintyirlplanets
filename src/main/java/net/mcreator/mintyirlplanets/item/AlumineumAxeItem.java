package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AlumineumAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 902, 10f, 0, 35, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:alumineum_axe_repair_items")));

	public AlumineumAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 22f, -2f, properties);
	}
}