package com.ljunggren.unitConversion.area;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.area.base.BaseAreaSiToUs;
import com.ljunggren.unitConversion.area.base.BaseAreaUsToSi;
import com.ljunggren.unitConversion.area.units.si.SquareMeter;
import com.ljunggren.unitConversion.area.units.us.Acre;
import com.ljunggren.unitConversion.area.units.us.SquareFoot;
import com.ljunggren.unitConversion.base.BaseNoChange;

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
