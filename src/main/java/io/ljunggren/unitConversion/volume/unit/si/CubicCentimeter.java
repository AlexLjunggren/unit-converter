package io.ljunggren.unitConversion.volume.unit.si;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.volume.Volume;

public class CubicCentimeter implements Volume {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 1000;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 1000;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "cm^3";
    }

}
