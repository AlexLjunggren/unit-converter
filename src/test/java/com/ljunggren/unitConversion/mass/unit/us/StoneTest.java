package com.ljunggren.unitConversion.mass.unit.us;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.mass.Mass;

public class StoneTest implements TestUnit {
    
    private Mass mass = new Stone();

    @Test
    public void toBaseUnitTest() {
        assertEquals(35, mass.toBaseUnit().apply(2.5), 0);
        assertEquals(0, mass.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(2.5, mass.fromBaseUnit().apply(35.0), 0);
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
