package com.ljunggren.unitConversion.force.units.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PoundForceTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, new PoundForce().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new PoundForce().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new PoundForce().fromBaseUnit().apply(1.0), 0);
        assertEquals(0, new PoundForce().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new PoundForce().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new PoundForce().label());
    }
    
}
