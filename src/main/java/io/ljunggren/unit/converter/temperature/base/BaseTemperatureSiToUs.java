package io.ljunggren.unit.converter.temperature.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

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
