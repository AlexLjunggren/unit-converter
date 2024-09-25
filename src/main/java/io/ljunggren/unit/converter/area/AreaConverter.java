package io.ljunggren.unit.converter.area;

import io.ljunggren.unit.converter.Converter;
import io.ljunggren.unit.converter.area.base.BaseAreaSiToUs;
import io.ljunggren.unit.converter.area.base.BaseAreaUsToSi;
import io.ljunggren.unit.converter.area.unit.si.SquareMeter;
import io.ljunggren.unit.converter.area.unit.us.Acre;
import io.ljunggren.unit.converter.area.unit.us.SquareFoot;
import io.ljunggren.unit.converter.base.BaseNoChange;

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
