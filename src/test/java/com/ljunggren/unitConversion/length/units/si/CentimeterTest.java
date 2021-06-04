package com.ljunggren.unitConversion.length.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.length.Length;

public class CentimeterTest implements TestUnit {
    
    private Length length = new Centimeter();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, length.toBaseUnit().apply(100.0), 0);
        assertEquals(0, length.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(100, length.fromBaseUnit().apply(1.0), 0);
        assertEquals(0, length.fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(length.system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(length.label());
    }
    
}
