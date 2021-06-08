package com.ljunggren.unitConversion.speed.base;

import java.util.function.Function;

import com.ljunggren.unitConversion.Constants;
import com.ljunggren.unitConversion.Unit;
import com.ljunggren.unitConversion.base.BaseChain;

public class BaseSpeedUsToSi extends BaseChain {

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isUS(from) && isSI(to)) {
            return x -> x * Constants.FOOT_TO_METER;
        }
        return nextChain.baseUnit(from, to);
    }

}
