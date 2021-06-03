package com.ljunggren.unitConversion.force.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseForceSiToUs extends BaseChain {
    
    // Newton to Pound (force)

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x / 4.4482216152605;
        }
        return nextChain.baseUnit(from, to);
    }

}
