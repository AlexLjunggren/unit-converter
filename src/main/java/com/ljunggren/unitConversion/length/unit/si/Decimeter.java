package com.ljunggren.unitConversion.length.unit.si;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.length.Length;

public class Decimeter implements Length {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 10;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 10;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "dm";
    }

}