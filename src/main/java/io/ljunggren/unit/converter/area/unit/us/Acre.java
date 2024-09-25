package io.ljunggren.unit.converter.area.unit.us;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.area.Area;

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
