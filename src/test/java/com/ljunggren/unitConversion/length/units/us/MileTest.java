package com.ljunggren.unitConversion.length.units.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class MileTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(63360, new Mile().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new Mile().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new Mile().fromBaseUnit().apply(63360.0), 0);
        assertEquals(0, new Mile().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Mile().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Mile().label());
    }
    
}
