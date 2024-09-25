package io.ljunggren.unit.converter.length.unit.us;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.length.Length;

public class Foot implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return e -> e;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return e -> e;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "ft";
    }

}
