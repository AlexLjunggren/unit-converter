package com.ljunggren.unitConversion.area.units.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.area.Area;

public class SquareFoot implements Area {

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
        return System.US;
    }

    @Override
    public String label() {
        return "ft^2";
    }

}
