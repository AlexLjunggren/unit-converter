package io.ljunggren.unitConversion.volume.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Constants;
import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

public class BaseVolumeSiToUs extends BaseChain {

    // Liter to Fluid Ounce
    
    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * Constants.LITER_TO_OUNCE;
        }
        return nextChain.baseUnit(from, to);
    }

}
