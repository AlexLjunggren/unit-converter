package com.ljunggren.unitConversion.temperature.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseTemperatureSiToUs extends BaseChain {

    // Fahrenheit to Celsius 

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> (x - 32) * (5/9);
        }
        return nextChain.baseUnit(from, to);
    }
    
}
