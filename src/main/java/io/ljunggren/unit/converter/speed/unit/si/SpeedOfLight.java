package io.ljunggren.unit.converter.speed.unit.si;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.speed.Speed;

public class SpeedOfLight implements Speed {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 2.998e+8;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 2.998e+8;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "m/s";
    }

}
