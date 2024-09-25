package io.ljunggren.unit.converter.mass.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

public class BaseMassUsToSi extends BaseChain {
    
    // Pound to Kilogram

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x * Constants.POUND_TO_KILOGRAM;
        }
        return nextChain.baseUnit(from, to);
    }

}
