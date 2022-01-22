package io.ljunggren.unitConversion.area;

import io.ljunggren.unitConversion.Converter;
import io.ljunggren.unitConversion.area.base.BaseAreaSiToUs;
import io.ljunggren.unitConversion.area.base.BaseAreaUsToSi;
import io.ljunggren.unitConversion.area.unit.si.SquareMeter;
import io.ljunggren.unitConversion.area.unit.us.Acre;
import io.ljunggren.unitConversion.area.unit.us.SquareFoot;
import io.ljunggren.unitConversion.base.BaseNoChange;

public class AreaConverter extends Converter {

    public AreaConverter() {
        super(new BaseAreaUsToSi()
                .nextChain(new BaseAreaSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public AreaConverter fromSquareFeet() {
        return setFrom(new SquareFoot());
    }
    public AreaConverter toSquareFeet() {
        return setTo(new SquareFoot());
    }
    
    public AreaConverter fromAcres() {
        return setFrom(new Acre());
    }
    public AreaConverter toAcres() {
        return setTo(new Acre());
    }
    
    public AreaConverter fromSquareMeters() {
        return setFrom(new SquareMeter());
    }
    public AreaConverter toSquareMeters() {
        return setTo(new SquareMeter());
    }

}
