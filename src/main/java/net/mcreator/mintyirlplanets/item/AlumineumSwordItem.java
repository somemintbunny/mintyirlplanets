package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AlumineumSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 902, 10f, 0, 35, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:alumineum_sword_repair_items")));

	public AlumineumSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 14f, 0f));
	}
}