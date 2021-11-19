package com.ljunggren.unitConversion.speed.unit.us;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.speed.Speed;

public class MilePerHour implements Speed {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> (x * 5280) / 3600;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> (x * 3600) / 5280;
    }

    @Override
    public System system() {
        return System.US;
    }

    @Override
    public String label() {
        return "mph";
    }

}
