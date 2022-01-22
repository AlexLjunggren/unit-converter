package io.ljunggren.unitConversion.area.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Constants;
import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

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
