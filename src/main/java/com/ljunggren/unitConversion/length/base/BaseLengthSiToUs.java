package com.ljunggren.unitConversion.length.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseLengthSiToUs extends BaseChain {
    
    // Meter to Foot

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * 3.28084;
        }
        return nextChain.baseUnit(from, to);
    }

}
