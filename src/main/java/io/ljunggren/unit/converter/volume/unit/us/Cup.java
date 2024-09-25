package io.ljunggren.unit.converter.volume.unit.us;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.volume.Volume;

public class Cup implements Volume {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 8;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 8;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "c";
    }

}
