package com.ljunggren.unitConversion.mass.unit.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.mass.Mass;

public class Ounce implements Mass {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 16;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 16;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "oz";
    }

}
