package com.ljunggren.unitConversion.speed.unit.si;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.speed.Speed;

public class SpeedOfLight implements Speed {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 2.998e+8;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 2.998e+8;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "m/s";
    }

}
