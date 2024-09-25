package io.ljunggren.unit.converter.speed.unit.si;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.speed.Speed;

public class KilometerPerHour implements Speed {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 3.6;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 3.6;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "km/h";
    }

}
