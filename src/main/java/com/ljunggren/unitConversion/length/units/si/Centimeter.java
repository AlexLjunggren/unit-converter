package com.ljunggren.unitConversion.length.units.si;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.length.Length;

public class Centimeter implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 100;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 100;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "cm";
    }

}
