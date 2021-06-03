package com.ljunggren.unitConversion.length.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MillimeterTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, new Millimeter().toBaseUnit().apply(1000.0), 0);
        assertEquals(0, new Millimeter().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1000, new Millimeter().fromBaseUnit().apply(1.0), 0);
        assertEquals(0, new Millimeter().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Millimeter().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Millimeter().label());
    }
    
}
