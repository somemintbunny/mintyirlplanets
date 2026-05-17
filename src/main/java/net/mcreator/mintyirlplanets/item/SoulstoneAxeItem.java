package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SoulstoneAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4838, 21f, 0, 116, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:soulstone_axe_repair_items")));

	public SoulstoneAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 74f, 3f, properties);
	}
}