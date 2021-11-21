package com.ljunggren.unitConversion.mass.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.mass.Mass;

public class PoundTest implements TestUnit {
    
    private Mass mass = new Pound();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, mass.toBaseUnit().apply(1.0), 0);
        assertEquals(0, mass.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, mass.fromBaseUnit().apply(1.0), 0);
        assertEquals(0, mass.fromBaseUnit().apply(0.0), 0);
    }

    @Test
    public void systemTest() {
        assertNotNull(mass.system());
    }

    @Test
    public void labelTest() {
        assertNotNull(mass.label());
    }

}
