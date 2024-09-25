package io.ljunggren.unit.converter.length.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

public class BaseLengthUsToSi extends BaseChain {
    
    // Foot to Meter

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x * Constants.FOOT_TO_METER;
        }
        return nextChain.baseUnit(from, to);
    }

}
