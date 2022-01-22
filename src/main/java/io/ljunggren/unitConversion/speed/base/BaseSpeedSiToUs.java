package io.ljunggren.unitConversion.speed.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Constants;
import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

public class BaseSpeedSiToUs extends BaseChain {
    
    // Meter per second to Foot per second

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * Constants.METER_TO_FOOT;
        }
        return nextChain.baseUnit(from, to);
    }

}
