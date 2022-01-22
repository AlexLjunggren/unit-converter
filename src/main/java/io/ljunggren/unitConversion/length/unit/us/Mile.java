package io.ljunggren.unitConversion.length.unit.us;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.length.Length;

public class Mile implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 5280;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 5280;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "mi";
    }

}
