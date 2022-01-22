package io.ljunggren.unitConversion.force.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Constants;
import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

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
