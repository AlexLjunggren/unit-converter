package io.ljunggren.unit.converter.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Unit;

public class BaseNoChange extends BaseChain {

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        return x -> x;
    }

}
