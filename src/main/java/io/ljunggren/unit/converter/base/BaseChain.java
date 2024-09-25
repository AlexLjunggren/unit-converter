package io.ljunggren.unit.converter.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.System;
import io.ljunggren.unit.converter.Unit;

public abstract class BaseChain {

    protected BaseChain nextChain;
    
    public BaseChain nextChain(BaseChain nextChain) {
        this.nextChain = nextChain;
        return this;
    }
    
    protected boolean isUS(Unit unit) {
        return unit.system() == System.US;
    }
    
    protected boolean isSI(Unit unit) {
        return unit.system() == System.SI;
    }
    
    public abstract Function<Double, Double> baseUnit(Unit from, Unit to);
    
}
