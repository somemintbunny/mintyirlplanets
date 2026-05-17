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

public abstract class GustaviumFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> MintyirlplanetsModFluidTypes.GUSTAVIUM_TYPE.get(), () -> MintyirlplanetsModFluids.GUSTAVIUM.get(),
			() -> MintyirlplanetsModFluids.FLOWING_GUSTAVIUM.get()).explosionResistance(100f).bucket(() -> MintyirlplanetsModItems.GUSTAVIUM_BUCKET.get()).block(() -> (LiquidBlock) MintyirlplanetsModBlocks.GUSTAVIUM.get());

	private GustaviumFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GustaviumFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GustaviumFluid {
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