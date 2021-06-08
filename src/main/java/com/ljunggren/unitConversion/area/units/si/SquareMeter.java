package com.ljunggren.unitConversion.area.units.si;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.area.Area;

public class SquareMeter implements Area {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "m^2";
    }

}