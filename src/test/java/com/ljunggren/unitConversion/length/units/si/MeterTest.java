package com.ljunggren.unitConversion.length.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MeterTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, new Meter().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new Meter().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new Meter().fromBaseUnit().apply(1.0), 0);
        assertEquals(0, new Meter().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Meter().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Meter().label());
    }
    
}
