package com.ljunggren.unitConversion.volume.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseVolumeUsToSi extends BaseChain {

    // Fluid Ounce to Liter
    
    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x / 33.8140226;
        }
        return nextChain.baseUnit(from, to);
    }

}
