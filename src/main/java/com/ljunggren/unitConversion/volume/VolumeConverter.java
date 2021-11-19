package com.ljunggren.unitConversion.volume;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.volume.base.BaseVolumeSiToUs;
import com.ljunggren.unitConversion.volume.base.BaseVolumeUsToSi;
import com.ljunggren.unitConversion.volume.unit.si.CubicCentimeter;
import com.ljunggren.unitConversion.volume.unit.si.CubicMeter;
import com.ljunggren.unitConversion.volume.unit.si.Liter;
import com.ljunggren.unitConversion.volume.unit.si.Milliliter;
import com.ljunggren.unitConversion.volume.unit.us.Cup;
import com.ljunggren.unitConversion.volume.unit.us.FluidOunce;
import com.ljunggren.unitConversion.volume.unit.us.Gallon;
import com.ljunggren.unitConversion.volume.unit.us.Pint;
import com.ljunggren.unitConversion.volume.unit.us.Quart;
import com.ljunggren.unitConversion.volume.unit.us.Tablespoon;
import com.ljunggren.unitConversion.volume.unit.us.Teaspoon;

public class VolumeConverter extends Converter {

    public VolumeConverter() {
        super(new BaseVolumeUsToSi()
                .nextChain(new BaseVolumeSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public VolumeConverter fromTeaspoons() {
        return setFrom(new Teaspoon());
    }
    public VolumeConverter toTeaspoons() {
        return setTo(new Teaspoon());
    }
    
    public VolumeConverter fromTablespoons() {
        return setFrom(new Tablespoon());
    }
    public VolumeConverter toTablespoons() {
        return setTo(new Tablespoon());
    }
    
    public VolumeConverter fromFluidOunces() {
        return setFrom(new FluidOunce());
    }
    public VolumeConverter toFluidOunces() {
        return setTo(new FluidOunce());
    }
    
    public VolumeConverter fromCups() {
        return setFrom(new Cup());
    }
    public VolumeConverter toCups() {
        return setTo(new Cup());
    }
    
    public VolumeConverter fromPints() {
        return setFrom(new Pint());
    }
    public VolumeConverter toPints() {
        return setTo(new Pint());
    }
    
    public VolumeConverter fromQuarts() {
        return setFrom(new Quart());
    }
    public VolumeConverter toQuarts() {
        return setTo(new Quart());
    }
    
    public VolumeConverter fromGallons() {
        return setFrom(new Gallon());
    }
    public VolumeConverter toGallons() {
        return setTo(new Gallon());
    }
    
    public VolumeConverter fromMilliliters() {
        return setFrom(new Milliliter());
    }
    public VolumeConverter toMilliliters() {
        return setTo(new Milliliter());
    }
    
    public VolumeConverter fromLiters() {
        return setFrom(new Liter());
    }
    public VolumeConverter toLiters() {
        return setTo(new Liter());
    }
    
    public VolumeConverter fromCubicCentimeters() {
        return setFrom(new CubicCentimeter());
    }
    public VolumeConverter toCubicCentimeters() {
        return setTo(new CubicCentimeter());
    }
    
    public VolumeConverter fromCubicMeters() {
        return setFrom(new CubicMeter());
    }
    public VolumeConverter toCubicMeters() {
        return setTo(new CubicMeter());
    }

}
