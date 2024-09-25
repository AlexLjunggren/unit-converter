package io.ljunggren.unit.converter.mass.base;

import java.util.function.Function;

import io.ljunggren.unit.converter.Constants;
import io.ljunggren.unit.converter.Unit;
import io.ljunggren.unit.converter.base.BaseChain;

public class BaseMassSiToUs extends BaseChain {
    
    // Kilogram to Pound

    @Override
    public Function<Double, Double> baseUnit(Unit from, Unit to) {
        if (isSI(from) && isUS(to)) {
            return x -> x * Constants.KILOGRAM_TO_POUND;
        }
        return nextChain.baseUnit(from, to);
    }

}
