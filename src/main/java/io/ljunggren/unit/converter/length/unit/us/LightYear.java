package io.ljunggren.unit.converter.length.unit.us;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.length.Length;

public class LightYear implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 3.104E+16;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 3.104E+16;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "ly";
    }

}
