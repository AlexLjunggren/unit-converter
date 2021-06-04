package com.ljunggren.unitConversion.force.units.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.force.Force;

public class PoundForceTest implements TestUnit {
    
    private Force force = new PoundForce();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, force.toBaseUnit().apply(1.0), 0);
        assertEquals(0, force.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, force.fromBaseUnit().apply(1.0), 0);
        assertEquals(0, force.fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(force.system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(force.label());
    }
    
}
