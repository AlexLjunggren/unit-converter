package com.ljunggren.unitConversion.temperature.unit.si;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.temperature.Temperature;

public class Kelvin implements Temperature {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x - 273.15;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x + 273.15;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "K";
    }

}
