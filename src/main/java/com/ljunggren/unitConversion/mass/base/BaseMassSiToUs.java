package com.ljunggren.unitConversion.mass.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Constants;
import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseMassSiToUs extends BaseChain {
    
    // Kilogram to Pound

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * Constants.KILOGRAM_TO_POUND;
        }
        return nextChain.baseUnit(from, to);
    }

}
