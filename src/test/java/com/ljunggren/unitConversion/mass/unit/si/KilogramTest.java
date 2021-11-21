package com.ljunggren.unitConversion.mass.unit.si;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.mass.Mass;

public class KilogramTest {
    
    private Mass mass = new Kilogram();

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
