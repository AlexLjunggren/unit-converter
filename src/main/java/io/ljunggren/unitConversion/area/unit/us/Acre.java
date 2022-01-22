package io.ljunggren.unitConversion.area.unit.us;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.area.Area;

public class Acre implements Area {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x * 43560;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x / 43560;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "acre";
    }

}
