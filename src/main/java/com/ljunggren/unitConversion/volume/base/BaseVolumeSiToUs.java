package com.ljunggren.unitConversion.volume.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseVolumeSiToUs extends BaseChain {

    // Liter to Fluid Ounce
    
    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * 33.8140226;
        }
        return nextChain.baseUnit(from, to);
    }

}
