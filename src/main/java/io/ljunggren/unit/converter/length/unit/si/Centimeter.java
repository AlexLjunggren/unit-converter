package io.ljunggren.unit.converter.length.unit.si;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.length.Length;

public class Centimeter implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 100;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 100;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "cm";
    }

}
