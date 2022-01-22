package io.ljunggren.unitConversion.speed;

import io.ljunggren.unitConversion.Converter;
import io.ljunggren.unitConversion.base.BaseNoChange;
import io.ljunggren.unitConversion.speed.base.BaseSpeedSiToUs;
import io.ljunggren.unitConversion.speed.base.BaseSpeedUsToSi;
import io.ljunggren.unitConversion.speed.unit.si.KilometerPerHour;
import io.ljunggren.unitConversion.speed.unit.si.MeterPerSecond;
import io.ljunggren.unitConversion.speed.unit.si.SpeedOfLight;
import io.ljunggren.unitConversion.speed.unit.us.FootPerSecond;
import io.ljunggren.unitConversion.speed.unit.us.Knot;
import io.ljunggren.unitConversion.speed.unit.us.MilePerHour;

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
