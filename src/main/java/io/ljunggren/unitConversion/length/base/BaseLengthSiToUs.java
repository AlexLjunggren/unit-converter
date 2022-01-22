package io.ljunggren.unitConversion.length.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Constants;
import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

public class BaseLengthSiToUs extends BaseChain {
    
    // Meter to Foot

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * Constants.METER_TO_FOOT;
        }
        return nextChain.baseUnit(from, to);
    }

}
