package io.ljunggren.unit.converter.speed.unit.us;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.speed.Speed;

public class MilePerHour implements Speed {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> (x * 5280) / 3600;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> (x * 3600) / 5280;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "mph";
    }

}
