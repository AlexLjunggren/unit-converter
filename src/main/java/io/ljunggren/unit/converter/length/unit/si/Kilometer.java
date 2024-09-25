package io.ljunggren.unit.converter.length.unit.si;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.length.Length;

public class Kilometer implements Length {

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
        return "km";
    }

}
