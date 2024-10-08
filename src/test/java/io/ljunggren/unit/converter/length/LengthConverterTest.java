package io.ljunggren.unit.converter.length;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import io.ljunggren.unit.converter.Converter;

public class LengthConverterTest {

    @Test
    public void convertNoChangeTest() {
        Converter converter = new LengthConverter().fromFeet().toFeet();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromInchesTest() {
        Converter converter = new LengthConverter().fromInches().toFeet();
        assertEquals(1, converter.convert(12.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToInchesTest() {
        Converter converter = new LengthConverter().fromFeet().toInches();
        assertEquals(12, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromFeetTest() {
        Converter converter = new LengthConverter().fromFeet().toInches();
        assertEquals(12, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToFeetTest() {
        Converter converter = new LengthConverter().fromInches().toFeet();
        assertEquals(1, converter.convert(12.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromYardsTest() {
        Converter converter = new LengthConverter().fromYards().toFeet();
        assertEquals(3, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToYardsTest() {
        Converter converter = new LengthConverter().fromFeet().toYards();
        assertEquals(1, converter.convert(3.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromMilesTest() {
        Converter converter = new LengthConverter().fromMiles().toFeet();
        assertEquals(5280, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToMilesTest() {
        Converter converter = new LengthConverter().fromFeet().toMiles();
        assertEquals(1, converter.convert(5280.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromLightYearsTest() {
        Converter converter = new LengthConverter().fromLightYears().toFeet();
        assertEquals(3.104E+16, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToLightYearsTest() {
        Converter converter = new LengthConverter().fromFeet().toLightYears();
        assertEquals(1, converter.convert(3.104E+16), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromParsecsTest() {
        Converter converter = new LengthConverter().fromParsecs().toFeet();
        assertEquals(1.012E+17, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToParsecsTest() {
        Converter converter = new LengthConverter().fromFeet().toParsecs();
        assertEquals(1, converter.convert(1.012E+17), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void converterFromMillimetersTest() {
        Converter converter = new LengthConverter().fromMillimeters().toMeters();
        assertEquals(0.001, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void converterToMillimetersTest() {
        Converter converter = new LengthConverter().fromMeters().toMillimeters();
        assertEquals(1000, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void converterFromCentimetersTest() {
        Converter converter = new LengthConverter().fromCentimeters().toMeters();
        assertEquals(0.01, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void converterToCentimetersTest() {
        Converter converter = new LengthConverter().fromMeters().toCentimeters();
        assertEquals(100, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void converterFromDecimetersTest() {
        Converter converter = new LengthConverter().fromDecimeters().toMeters();
        assertEquals(0.1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void converterToDecimetersTest() {
        Converter converter = new LengthConverter().fromMeters().toDecimeters();
        assertEquals(10, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromMetersTest() {
        Converter converter = new LengthConverter().fromMeters().toFeet();
        assertEquals(3.28084, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToMetersTest() {
        Converter converter = new LengthConverter().fromFeet().toMeters();
        assertEquals(0.9143999707, converter.convert(3.0), 0.0000000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromKilmetersTest() {
        Converter converter = new LengthConverter().fromKilometers().toMeters();
        assertEquals(1000, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToKilometersTest() {
        Converter converter = new LengthConverter().fromMeters().toKilometers();
        assertEquals(1, converter.convert(1000.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void labelTest() {
        Converter converter = new LengthConverter().fromFeet().toMeters();
        assertEquals("m", converter.label());
    }
    
}
