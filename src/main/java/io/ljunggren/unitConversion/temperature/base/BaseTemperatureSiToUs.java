package io.ljunggren.unitConversion.temperature.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

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
