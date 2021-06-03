package com.ljunggren.unitConversion.length.units.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FootTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(12, new Foot().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new Foot().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new Foot().fromBaseUnit().apply(12.0), 0);
        assertEquals(0, new Foot().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Foot().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Foot().label());
    }
    
}
