package com.ljunggren.unitConversion.weight.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Constants;
import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseWeightUsToSi extends BaseChain {
    
    // Pound to Ounce

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x * Constants.POUND_TO_OUNCE;
        }
        return nextChain.baseUnit(from, to);
    }

}
