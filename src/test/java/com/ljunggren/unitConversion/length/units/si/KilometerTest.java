package com.ljunggren.unitConversion.length.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class KilometerTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1000, new Kilometer().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new Kilometer().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new Kilometer().fromBaseUnit().apply(1000.0), 0);
        assertEquals(0, new Kilometer().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Kilometer().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Kilometer().label());
    }
    
}
