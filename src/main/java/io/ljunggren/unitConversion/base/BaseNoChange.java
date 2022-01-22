package io.ljunggren.unitConversion.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.Unit;

public class BaseNoChange extends BaseChain {

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        return x -> x;
    }

}
