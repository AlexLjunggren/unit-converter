package io.ljunggren.unit.converter.length.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

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
