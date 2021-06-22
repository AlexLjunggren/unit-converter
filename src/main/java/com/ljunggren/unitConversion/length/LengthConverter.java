package com.ljunggren.unitConversion.length;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.length.base.BaseLengthSiToUs;
import com.ljunggren.unitConversion.length.base.BaseLengthUsToSi;
import com.ljunggren.unitConversion.length.units.si.Centimeter;
import com.ljunggren.unitConversion.length.units.si.Decimeter;
import com.ljunggren.unitConversion.length.units.si.Kilometer;
import com.ljunggren.unitConversion.length.units.si.Meter;
import com.ljunggren.unitConversion.length.units.si.Millimeter;
import com.ljunggren.unitConversion.length.units.us.Foot;
import com.ljunggren.unitConversion.length.units.us.Inch;
import com.ljunggren.unitConversion.length.units.us.LightYear;
import com.ljunggren.unitConversion.length.units.us.Mile;
import com.ljunggren.unitConversion.length.units.us.Parsec;
import com.ljunggren.unitConversion.length.units.us.Yard;

import lombok.Getter;

@Getter
public class LengthConverter extends Converter {
    
    public LengthConverter() {
        super(new BaseLengthSiToUs()
                .nextChain(new BaseLengthUsToSi()
                .nextChain(new BaseNoChange()
                        )));
    }

    public LengthConverter fromInches() {
        return setFrom(new Inch());
    }
    public LengthConverter toInches() {
        return setTo(new Inch());
    }
    
    public LengthConverter fromFeet() {
        return setFrom(new Foot());
    }
    public LengthConverter toFeet() {
        return setTo(new Foot());
    }
    
    public LengthConverter fromYards() {
        return setFrom(new Yard());
    }
    public LengthConverter toYards() {
        return setTo(new Yard());
    }
    
    public LengthConverter fromMiles() {
        return setFrom(new Mile());
    }
    public LengthConverter toMiles() {
        return setTo(new Mile());
    }
    
    public LengthConverter fromLightYears() {
        return setFrom(new LightYear());
    }
    public LengthConverter toLightYears() {
        return setTo(new LightYear());
    }
    
    public LengthConverter fromParsecs() {
        return setFrom(new Parsec());
    }
    public LengthConverter toParsecs() {
        return setTo(new Parsec());
    }
        
    public LengthConverter fromMillimeters() {
        return setFrom(new Millimeter());
    }
    public LengthConverter toMillimeters() {
        return setTo(new Millimeter());
    }
    
    public LengthConverter fromCentimeters() {
        return setFrom(new Centimeter());
    }
    public LengthConverter toCentimeters() {
        return setTo(new Centimeter());
    }
    
    public LengthConverter fromDecimeters() {
        return setFrom(new Decimeter());
    }
    public LengthConverter toDecimeters() {
        return setTo(new Decimeter());
    }
    
    public LengthConverter fromMeters() {
        return setFrom(new Meter());
    }
    public LengthConverter toMeters() {
        return setTo(new Meter());
    }
    
    public LengthConverter fromKilometers() {
        return setFrom(new Kilometer());
    }
    public LengthConverter toKilometers() {
        return setTo(new Kilometer());
    }

}
