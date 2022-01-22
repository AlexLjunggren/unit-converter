package io.ljunggren.unitConversion.temperature.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Unit;
import io.ljunggren.unitConversion.base.BaseChain;

public class BaseTemperatureUsToSi extends BaseChain {
    
    // Celsius to Fahrenheit

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> (x - 32) * (5.0/9.0);
        }
        return nextChain.baseUnit(from, to);
    }

}
