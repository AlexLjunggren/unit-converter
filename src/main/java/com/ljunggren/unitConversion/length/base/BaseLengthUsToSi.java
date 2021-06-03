package com.ljunggren.unitConversion.length.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseLengthUsToSi extends BaseChain {
    
    // Inch to Meter

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x / 39.37;
        }
        return nextChain.baseUnit(from, to);
    }

}
