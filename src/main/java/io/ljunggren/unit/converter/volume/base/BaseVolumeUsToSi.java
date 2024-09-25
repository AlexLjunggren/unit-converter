package io.ljunggren.unit.converter.volume.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

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
