package com.ljunggren.unitConversion.volume;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.volume.base.BaseVolumeSiToUs;
import com.ljunggren.unitConversion.volume.base.BaseVolumeUsToSi;
import com.ljunggren.unitConversion.volume.units.si.CubicMeter;
import com.ljunggren.unitConversion.volume.units.si.Liter;
import com.ljunggren.unitConversion.volume.units.us.FluidOunce;
import com.ljunggren.unitConversion.volume.units.us.Gallon;
import com.ljunggren.unitConversion.volume.units.us.Pint;
import com.ljunggren.unitConversion.volume.units.us.Quart;

public class VolumeConverter extends Converter {

    public VolumeConverter() {
        super(new BaseVolumeUsToSi()
                .nextChain(new BaseVolumeSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public VolumeConverter fromFluidOunces() {
        return setFrom(new FluidOunce());
    }
    public VolumeConverter toFluidOunces() {
        return setTo(new FluidOunce());
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
    
    public VolumeConverter fromLiters() {
        return setFrom(new Liter());
    }
    public VolumeConverter toLiters() {
        return setTo(new Liter());
    }
    
    public VolumeConverter fromCubicMeters() {
        return setFrom(new CubicMeter());
    }
    public VolumeConverter toCubicMeters() {
        return setTo(new CubicMeter());
    }

}