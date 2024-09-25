package io.ljunggren.unit.converter.force.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

public class BaseForceSiToUs extends BaseChain {
    
    // Newton to Pound (force)

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * Constants.NEWTON_TO_POUND;
        }
        return nextChain.baseUnit(from, to);
    }

}
