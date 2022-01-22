package io.ljunggren.unitConversion.mass.unit.us;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.mass.Mass;

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
