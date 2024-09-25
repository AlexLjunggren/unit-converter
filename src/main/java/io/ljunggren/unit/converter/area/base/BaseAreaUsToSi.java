package io.ljunggren.unit.converter.area.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

public class BaseAreaUsToSi extends BaseChain {
    
    // Square Foot to Square Meter

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x * Constants.FOOT_TO_METER * Constants.FOOT_TO_METER;
        }
        return nextChain.baseUnit(from, to);
    }

}
