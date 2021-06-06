package com.ljunggren.unitConversion.area;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.ljunggren.unitConversion.Converter;

public class AreaConverterTest {

    @Test
    public void convertNoChangeTest() {
        Converter converter = new AreaConverter().fromSquareFeet().toSquareFeet();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromSquareFeet() {
        Converter converter = new AreaConverter().fromSquareFeet().toSquareMeters();
        assertEquals(0.0929030341, converter.convert(1.0), 10);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToSquareFeet() {
        Converter converter = new AreaConverter().fromSquareMeters().toSquareFeet();
        assertEquals(1, converter.convert(0.0929030341), 9);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }

    @Test
    public void convertFromSquareMeters() {
        Converter converter = new AreaConverter().fromSquareMeters().toSquareFeet();
        assertEquals(1, converter.convert(0.0929030341), 9);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToSquareMeters() {
        Converter converter = new AreaConverter().fromSquareFeet().toSquareMeters();
        assertEquals(0.0929030341, converter.convert(1.0), 10);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }

}
