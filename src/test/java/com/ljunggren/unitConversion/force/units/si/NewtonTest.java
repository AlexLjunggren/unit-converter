package com.ljunggren.unitConversion.force.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class NewtonTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, new Newton().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new Newton().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new Newton().fromBaseUnit().apply(1.0), 0);
        assertEquals(0, new Newton().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Newton().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Newton().label());
    }
    
}
