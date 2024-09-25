package io.ljunggren.unit.converter.speed;

import io.ljunggren.unit.converter.Converter;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.speed.base.BaseSpeedSiToUs;
import io.ljunggren.unit.converter.speed.base.BaseSpeedUsToSi;
import io.ljunggren.unit.converter.speed.unit.si.KilometerPerHour;
import io.ljunggren.unit.converter.speed.unit.si.MeterPerSecond;
import io.ljunggren.unit.converter.speed.unit.si.SpeedOfLight;
import io.ljunggren.unit.converter.speed.unit.us.FootPerSecond;
import io.ljunggren.unit.converter.speed.unit.us.Knot;
import io.ljunggren.unit.converter.speed.unit.us.MilePerHour;

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
