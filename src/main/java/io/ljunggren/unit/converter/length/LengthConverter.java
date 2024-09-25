package io.ljunggren.unit.converter.length;

import io.ljunggren.unit.converter.Converter;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.length.base.BaseLengthSiToUs;
import io.ljunggren.unit.converter.length.base.BaseLengthUsToSi;
import io.ljunggren.unit.converter.length.unit.si.Centimeter;
import io.ljunggren.unit.converter.length.unit.si.Decimeter;
import io.ljunggren.unit.converter.length.unit.si.Kilometer;
import io.ljunggren.unit.converter.length.unit.si.Meter;
import io.ljunggren.unit.converter.length.unit.si.Millimeter;
import io.ljunggren.unit.converter.length.unit.us.Foot;
import io.ljunggren.unit.converter.length.unit.us.Inch;
import io.ljunggren.unit.converter.length.unit.us.LightYear;
import io.ljunggren.unit.converter.length.unit.us.Mile;
import io.ljunggren.unit.converter.length.unit.us.Parsec;
import io.ljunggren.unit.converter.length.unit.us.Yard;
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
