package io.ljunggren.unitConversion.volume.unit.us;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.volume.Volume;

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
