package io.ljunggren.unit.converter.force.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

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
