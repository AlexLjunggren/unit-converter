package io.ljunggren.unitConversion.volume;

import io.ljunggren.unitConversion.Converter;
import io.ljunggren.unitConversion.base.BaseNoChange;
import io.ljunggren.unitConversion.volume.base.BaseVolumeSiToUs;
import io.ljunggren.unitConversion.volume.base.BaseVolumeUsToSi;
import io.ljunggren.unitConversion.volume.unit.si.CubicCentimeter;
import io.ljunggren.unitConversion.volume.unit.si.CubicMeter;
import io.ljunggren.unitConversion.volume.unit.si.Liter;
import io.ljunggren.unitConversion.volume.unit.si.Milliliter;
import io.ljunggren.unitConversion.volume.unit.us.Cup;
import io.ljunggren.unitConversion.volume.unit.us.FluidOunce;
import io.ljunggren.unitConversion.volume.unit.us.Gallon;
import io.ljunggren.unitConversion.volume.unit.us.Pint;
import io.ljunggren.unitConversion.volume.unit.us.Quart;
import io.ljunggren.unitConversion.volume.unit.us.Tablespoon;
import io.ljunggren.unitConversion.volume.unit.us.Teaspoon;

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
