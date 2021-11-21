package com.ljunggren.unitConversion.mass.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Constants;
import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

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