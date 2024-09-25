package io.ljunggren.unit.converter.mass;

import io.ljunggren.unit.converter.Converter;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.mass.base.BaseMassSiToUs;
import io.ljunggren.unit.converter.mass.base.BaseMassUsToSi;
import io.ljunggren.unit.converter.mass.unit.si.Gram;
import io.ljunggren.unit.converter.mass.unit.si.Kilogram;
import io.ljunggren.unit.converter.mass.unit.us.Ounce;
import io.ljunggren.unit.converter.mass.unit.us.Pound;
import io.ljunggren.unit.converter.mass.unit.us.Stone;

public class MassConverter extends Converter {

    public MassConverter() {
        super(new BaseMassUsToSi()
                .nextChain(new BaseMassSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public MassConverter fromOunces() {
        return setFrom(new Ounce());
    }
    public MassConverter toOunces() {
        return setTo(new Ounce());
    }

    public MassConverter fromPounds() {
        return setFrom(new Pound());
    }
    public MassConverter toPounds() {
        return setTo(new Pound());
    }
    
    public MassConverter fromStones() {
        return setFrom(new Stone());
    }
    public MassConverter toStones() {
        return setTo(new Stone());
    }
    
    public MassConverter fromGrams() {
        return setFrom(new Gram());
    }
    public MassConverter toGrams() {
        return setTo(new Gram());
    }
    
    public MassConverter fromKilograms() {
        return setFrom(new Kilogram());
    }
    public MassConverter toKilograms() {
        return setTo(new Kilogram());
    }
    
}
