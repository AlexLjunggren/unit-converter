package com.ljunggren.unitConversion.length.unit.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.length.Length;

public class LightYear implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 3.104E+16;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 3.104E+16;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "ly";
    }

}
