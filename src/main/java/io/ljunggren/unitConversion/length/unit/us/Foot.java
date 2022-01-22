package io.ljunggren.unitConversion.length.unit.us;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.length.Length;

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
