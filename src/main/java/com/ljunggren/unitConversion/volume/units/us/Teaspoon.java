package com.ljunggren.unitConversion.volume.units.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.volume.Volume;

public class Teaspoon implements Volume {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 6;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 6;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "tsp";
    }

}
