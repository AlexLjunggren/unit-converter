package io.ljunggren.unit.converter.mass.unit.si;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.mass.Mass;

public class Gram implements Mass {

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
        return "g";
    }

}
