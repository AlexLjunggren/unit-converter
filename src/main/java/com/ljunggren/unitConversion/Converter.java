package com.ljunggren.unitConversion;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.length.Length;

public abstract class Converter {

    private BaseChain baseChain;
    protected Unit from;
    protected Unit to;

    @SuppressWarnings("unchecked")
    protected <T extends Converter> T setFrom(Length from) {
        this.from = from;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    protected <T extends Converter> T setTo(Length to) {
        this.to = to;
        return (T) this;
    }

    public Converter(BaseChain baseChain) {
        this.baseChain = baseChain;
    }

    public Double convert(Double value) {
        return convert(from, to, value);
    }

    public String label() {
        return to == null ? null : to.label();
    }

    private Double convert(Unit from, Unit to, Double value) {
        if (from == null || to == null || value == null) {
            return null;
        }
        double baseUnit = getBaseUnit(from, to, value);
        return to.fromBaseUnit().apply(baseUnit);
    }

    private double getBaseUnit(Unit from, Unit to, Double value) {
        double initial = from.toBaseUnit().apply(value);
        return baseChain.baseUnit(from, to).apply(initial);
    }

}
