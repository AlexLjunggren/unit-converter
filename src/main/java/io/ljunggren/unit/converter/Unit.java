package io.ljunggren.unit.converter;

import java.util.function.Function;

public interface Unit {

    Function<Double, Double> toBaseUnit();
    Function<Double, Double> fromBaseUnit();
    System system();
    String label();
    
}
