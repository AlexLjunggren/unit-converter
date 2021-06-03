package com.ljunggren.unitConversion.length.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CentimeterTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, new Centimeter().toBaseUnit().apply(100.0), 0);
        assertEquals(0, new Centimeter().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(100, new Centimeter().fromBaseUnit().apply(1.0), 0);
        assertEquals(0, new Centimeter().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Centimeter().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Centimeter().label());
    }
    
}
