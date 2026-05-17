package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SoulstonePickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4838, 21f, 0, 116, TagKey.create(Registries.ITEM, ResourceLocation.parse("mintyirlplanets:soulstone_pickaxe_repair_items")));

	public SoulstonePickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 32f, 6f));
	}
}