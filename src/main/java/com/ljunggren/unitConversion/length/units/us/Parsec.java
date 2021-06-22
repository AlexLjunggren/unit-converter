package com.ljunggren.unitConversion.length.units.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.length.Length;

public class Parsec implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 1.012E+17;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 1.012E+17;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "pc";
    }

}
