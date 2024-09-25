package io.ljunggren.unit.converter.volume.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

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
