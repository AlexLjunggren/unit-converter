package io.ljunggren.unit.converter.volume.unit.si;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.volume.Volume;

public class CubicMeter implements Volume {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 1000;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 1000;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "m^3";
    }

}
