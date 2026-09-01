package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.mintyirlplanets.procedures.WormItemRightclickedOnBlockProcedure;

import java.util.function.Consumer;

public class WormItemItem extends Item {
	public WormItemItem(Item.Properties properties) {
		super(properties.stacksTo(99).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.mintyirlplanets.worm_item.description_0"));
		componentConsumer.accept(Component.translatable("item.mintyirlplanets.worm_item.description_1"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		WormItemRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}