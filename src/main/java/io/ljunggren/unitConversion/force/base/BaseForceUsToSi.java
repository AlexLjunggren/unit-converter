package io.ljunggren.unitConversion.force.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Constants;
import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

public class BaseForceUsToSi extends BaseChain {
    
    // Pound (force) to Newton

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x * Constants.POUND_TO_NEWTON;
        }
        return nextChain.baseUnit(from, to);
    }

}
