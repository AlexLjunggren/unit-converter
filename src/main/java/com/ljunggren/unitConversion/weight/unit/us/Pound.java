package com.ljunggren.unitConversion.weight.unit.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.weight.Weight;

public class Pound implements Weight {

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
        return System.US;
    }

    @Override
    public String label() {
        return "lbs";
    }

}
