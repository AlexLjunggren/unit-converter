package io.ljunggren.unitConversion.length.unit.si;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.length.Length;

public class Meter implements Length {

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
        return System.SI;
    }

    @Override
    public String label() {
        return "m";
    }

}
