package com.ljunggren.unitConversion.weight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.ljunggren.unitConversion.Converter;

public class WeightConverterTest {

    @Test
    public void converterNoChangeTest() {
        Converter converter = new WeightConverter().fromOunces().toOunces();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromPoundTest() {
        Converter converter = new WeightConverter().fromPounds().toOunces();
        assertEquals(16, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }

    @Test
    public void convertToPoundTest() {
        Converter converter = new WeightConverter().fromOunces().toPounds();
        assertEquals(1, converter.convert(16.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromOunceTest() {
        Converter converter = new WeightConverter().fromOunces().toPounds();
        assertEquals(0.0625, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToOunceTest() {
        Converter converter = new WeightConverter().fromPounds().toOunces();
        assertEquals(1.0, converter.convert(0.0625), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void labelTest() {
        Converter converter = new WeightConverter().fromOunces().toPounds();
        assertEquals("lbs", converter.label());
    }
    
}
