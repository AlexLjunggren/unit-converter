package com.ljunggren.unitConversion.length.unit.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.length.Length;

public class Foot implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return e -> e;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return e -> e;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "ft";
    }

}