package com.ljunggren.unitConversion.base;

import com.ljunggren.unitConversion.Unit;

import java.util.function.Function;

import com.ljunggren.unitConversion.System;

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
