package io.ljunggren.unitConversion.base;

import java.util.function.Function;

import io.ljunggren.unitConversion.System;
import io.ljunggren.unitConversion.Unit;

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
