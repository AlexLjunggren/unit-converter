package com.ljunggren.unitConversion.length.units.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.length.Length;

public class Yard implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 3;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x /3;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "yd";
    }

}
