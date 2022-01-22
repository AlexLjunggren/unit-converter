package io.ljunggren.unitConversion.length.unit.us;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.length.Length;

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
