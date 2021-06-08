package com.ljunggren.unitConversion.speed;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.ljunggren.unitConversion.Converter;

public class SpeedConverterTest {

    @Test
    public void convertNoChangeTest() {
        Converter converter = new SpeedConverter().fromFeetPerSecond().toFeetPerSecond();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromFeetPerSecondTest() {
        Converter converter = new SpeedConverter().fromFeetPerSecond().toMetersPerSecond();
        assertEquals(1, converter.convert(3.28084), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToFeetPerSecondTest() {
        Converter converter = new SpeedConverter().fromMetersPerSecond().toFeetPerSecond();
        assertEquals(3.28084, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromMilesPerHour() {
        Converter converter = new SpeedConverter().fromMilesPerHour().toFeetPerSecond();
        assertEquals(1.4666666666, converter.convert(1.0), 0.0000000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToMilesPerHour() {
        Converter converter = new SpeedConverter().fromFeetPerSecond().toMilesPerHour();
        assertEquals(1, converter.convert(1.4666666666), 0.0000000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromKnots() {
        Converter converter = new SpeedConverter().fromKnots().toMilesPerHour();
        assertEquals(1.15078, converter.convert(1.0), 0.000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToKnots() {
        Converter converter = new SpeedConverter().fromMilesPerHour().toKnots();
        assertEquals(1, converter.convert(1.15078), 0.00001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromMetersPerSecondTest() {
        Converter converter = new SpeedConverter().fromMetersPerSecond().toFeetPerSecond();
        assertEquals(3.28084, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToMetersPerSecondTest() {
        Converter converter = new SpeedConverter().fromFeetPerSecond().toMetersPerSecond();
        assertEquals(1, converter.convert(3.28084), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromKilometersPerHourTest() {
        Converter converter = new SpeedConverter().fromKilometersPerHour().toMetersPerSecond();
        assertEquals(1, converter.convert(3.6), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToKilometersPerHourTest() {
        Converter converter = new SpeedConverter().fromMetersPerSecond().toKilometersPerHour();
        assertEquals(3.6, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromSpeedOfLightTest() {
        Converter converter = new SpeedConverter().fromSpeedOfLight().toMetersPerSecond();
        assertEquals(2.998E8, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToSpeedOfLightTest() {
        Converter converter = new SpeedConverter().fromMetersPerSecond().toSpeedOfLight();
        assertEquals(1.0, converter.convert(2.998E8), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void labelTest() {
        Converter converter = new SpeedConverter().fromFeetPerSecond().toFeetPerSecond();
        assertEquals("ft/s", converter.label());
    }
    
}
