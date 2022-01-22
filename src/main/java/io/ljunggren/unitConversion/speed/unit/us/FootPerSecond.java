package io.ljunggren.unitConversion.speed.unit.us;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.speed.Speed;

public class FootPerSecond implements Speed {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "ft/s";
    }

}
