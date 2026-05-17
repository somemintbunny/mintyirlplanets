package net.mcreator.mintyirlplanets.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModItems;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluids;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluidTypes;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public abstract class ToxicWasteFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> MintyirlplanetsModFluidTypes.TOXIC_WASTE_TYPE.get(), () -> MintyirlplanetsModFluids.TOXIC_WASTE.get(),
			() -> MintyirlplanetsModFluids.FLOWING_TOXIC_WASTE.get()).explosionResistance(100f).bucket(() -> MintyirlplanetsModItems.TOXIC_WASTE_BUCKET.get()).block(() -> (LiquidBlock) MintyirlplanetsModBlocks.TOXIC_WASTE.get());

	private ToxicWasteFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ToxicWasteFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ToxicWasteFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}