package com.ljunggren.unitConversion.volume.units.si;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;
import com.ljunggren.unitConversion.volume.Volume;

public class Milliliter implements Volume {

    @Override
    public Function<Double, Double> toBaseUnit() {
        return x -> x / 1000;
    }

    @Override
    public Function<Double, Double> fromBaseUnit() {
        return x -> x * 1000;
    }

    @Override
    public System system() {
        return System.SI;
    }

    @Override
    public String label() {
        return "mL";
    }

}
