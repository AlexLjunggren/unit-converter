package com.ljunggren.unitConversion.speed;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.speed.base.BaseSpeedSiToUs;
import com.ljunggren.unitConversion.speed.base.BaseSpeedUsToSi;
import com.ljunggren.unitConversion.speed.units.si.KilometerPerHour;
import com.ljunggren.unitConversion.speed.units.si.MeterPerSecond;
import com.ljunggren.unitConversion.speed.units.si.SpeedOfLight;
import com.ljunggren.unitConversion.speed.units.us.FootPerSecond;
import com.ljunggren.unitConversion.speed.units.us.Knot;
import com.ljunggren.unitConversion.speed.units.us.MilePerHour;

public class SpeedConverter extends Converter {

    public SpeedConverter() {
        super(new BaseSpeedUsToSi()
                .nextChain(new BaseSpeedSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public SpeedConverter fromFeetPerSecond() {
        return setFrom(new FootPerSecond());
    }
    public SpeedConverter toFeetPerSecond() {
        return setTo(new FootPerSecond());
    }
    
    public SpeedConverter fromMilesPerHour() {
        return setFrom(new MilePerHour());
    }
    public SpeedConverter toMilesPerHour() {
        return setTo(new MilePerHour());
    }
    
    public SpeedConverter fromKnots() {
        return setFrom(new Knot());
    }
    public SpeedConverter toKnots() {
        return setTo(new Knot());
    }
    
    public SpeedConverter fromMetersPerSecond() {
        return setFrom(new MeterPerSecond());
    }
    public SpeedConverter toMetersPerSecond() {
        return setTo(new MeterPerSecond());
    }
    
    public SpeedConverter fromKilometersPerHour() {
        return setFrom(new KilometerPerHour());
    }
    public SpeedConverter toKilometersPerHour() {
        return setTo(new KilometerPerHour());
    }
    
    public SpeedConverter fromSpeedOfLight() {
        return setFrom(new SpeedOfLight());
    }
    public SpeedConverter toSpeedOfLight() {
        return setTo(new SpeedOfLight());
    }

}
