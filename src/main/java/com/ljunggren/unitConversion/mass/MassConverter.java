package com.ljunggren.unitConversion.mass;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.mass.base.BaseMassSiToUs;
import com.ljunggren.unitConversion.mass.base.BaseMassUsToSi;
import com.ljunggren.unitConversion.mass.unit.si.Gram;
import com.ljunggren.unitConversion.mass.unit.si.Kilogram;
import com.ljunggren.unitConversion.mass.unit.us.Ounce;
import com.ljunggren.unitConversion.mass.unit.us.Pound;
import com.ljunggren.unitConversion.mass.unit.us.Stone;

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
