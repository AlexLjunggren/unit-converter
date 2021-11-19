package com.ljunggren.unitConversion.speed.unit.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.speed.Speed;

public class Knot implements Speed {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 1.68781;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 1.68781;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "kt";
    }

}
