package io.ljunggren.unitConversion.speed.unit.si;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.speed.Speed;

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
