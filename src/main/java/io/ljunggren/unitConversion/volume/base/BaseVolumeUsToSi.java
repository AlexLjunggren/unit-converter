package io.ljunggren.unitConversion.volume.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Constants;
import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

public class BaseVolumeUsToSi extends BaseChain {

    // Fluid Ounce to Liter
    
    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x * Constants.OUNCE_TO_LITER;
        }
        return nextChain.baseUnit(from, to);
    }

}
