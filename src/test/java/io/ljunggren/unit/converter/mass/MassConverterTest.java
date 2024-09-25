package io.ljunggren.unit.converter.mass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import io.ljunggren.unit.converter.Converter;

public class MassConverterTest {

    @Test
    public void converterNoChangeTest() {
        Converter converter = new MassConverter().fromOunces().toOunces();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromOuncesTest() {
        Converter converter = new MassConverter().fromOunces().toPounds();
        assertEquals(0.0625, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToOuncesTest() {
        Converter converter = new MassConverter().fromPounds().toOunces();
        assertEquals(1.0, converter.convert(0.0625), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromPoundsTest() {
        Converter converter = new MassConverter().fromPounds().toOunces();
        assertEquals(16, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }

    @Test
    public void convertToPoundsTest() {
        Converter converter = new MassConverter().fromOunces().toPounds();
        assertEquals(1, converter.convert(16.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromStones() {
        Converter converter = new MassConverter().fromStones().toGrams();
        assertEquals(6350.29, converter.convert(1.0), 2);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToStones() {
        Converter converter = new MassConverter().fromOunces().toStones();
        assertEquals(0.00446429, converter.convert(1.0), 8);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromGramsTest() {
        Converter converter = new MassConverter().fromGrams().toKilograms();
        assertEquals(1, converter.convert(1000.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToGramsTest() {
        Converter converter = new MassConverter().fromKilograms().toGrams();
        assertEquals(1000, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromKilogramsTest() {
        Converter converter = new MassConverter().fromKilograms().toPounds();
        assertEquals(2.20462, converter.convert(1.0), 5);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToKilogramsTest() {
        Converter converter = new MassConverter().fromPounds().toKilograms();
        assertEquals(0.453592, converter.convert(1.0), 6);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void labelTest() {
        Converter converter = new MassConverter().fromOunces().toPounds();
        assertEquals("lbs", converter.label());
    }
    
}
