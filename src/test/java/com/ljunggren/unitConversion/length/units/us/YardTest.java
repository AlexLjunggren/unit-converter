package com.ljunggren.unitConversion.length.units.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class YardTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(36, new Yard().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new Yard().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new Yard().fromBaseUnit().apply(36.0), 0);
        assertEquals(0, new Yard().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Yard().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Yard().label());
    }
    
}
