package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.procedures.BoomLivingEntityIsHitWithToolProcedure;

import java.util.function.Consumer;

public class StagDoItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6893, 8f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("mintyirlplanets:stag_do_repair_items")));

	public StagDoItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 25f, -1.4f).rarity(Rarity.EPIC));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		BoomLivingEntityIsHitWithToolProcedure.execute(entity);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.mintyirlplanets.stag_do.description_0"));
	}
}