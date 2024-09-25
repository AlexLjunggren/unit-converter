package io.ljunggren.unit.converter.mass.unit.us;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.mass.Mass;

public class Stone implements Mass {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 14;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 14;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "st";
    }

}
