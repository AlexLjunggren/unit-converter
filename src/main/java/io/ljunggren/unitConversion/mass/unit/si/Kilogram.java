package io.ljunggren.unitConversion.mass.unit.si;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.mass.Mass;

public class Kilogram implements Mass {

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
        return "kg";
    }

}
