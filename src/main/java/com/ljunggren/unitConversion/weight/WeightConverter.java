package com.ljunggren.unitConversion.weight;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.weight.base.BaseWeightSiToUs;
import com.ljunggren.unitConversion.weight.base.BaseWeightUsToSi;
import com.ljunggren.unitConversion.weight.unit.si.Ounce;
import com.ljunggren.unitConversion.weight.unit.us.Pound;

public class WeightConverter extends Converter {

    public WeightConverter() {
        super(new BaseWeightUsToSi()
                .nextChain(new BaseWeightSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public WeightConverter fromPounds() {
        return setFrom(new Pound());
    }
    public WeightConverter toPounds() {
        return setTo(new Pound());
    }
    
    public WeightConverter fromOunces() {
        return setFrom(new Ounce());
    }
    public WeightConverter toOunces() {
        return setTo(new Ounce());
    }

}
