package com.ljunggren.unitConversion.temperature.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseTemperatureSiToUs extends BaseChain {

    // Celsius to Fahrenheit 

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> (x * (9.0/5.0)) + 32;
        }
        return nextChain.baseUnit(from, to);
    }
    
}
