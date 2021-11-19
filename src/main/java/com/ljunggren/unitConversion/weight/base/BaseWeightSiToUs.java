package com.ljunggren.unitConversion.weight.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Constants;
import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseWeightSiToUs extends BaseChain {
    
    // Ounce to Pound

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * Constants.OUNCE_TO_POUND;
        }
        return nextChain.baseUnit(from, to);
    }

}
