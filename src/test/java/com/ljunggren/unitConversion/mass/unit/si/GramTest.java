package com.ljunggren.unitConversion.mass.unit.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.mass.Mass;

public class GramTest implements TestUnit {

    private Mass mass = new Gram();

    @Test
    public void toBaseUnitTest() {
        assertEquals(0.001, mass.toBaseUnit().apply(1.0), 0);
        assertEquals(0, mass.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(1000, mass.fromBaseUnit().apply(1.0), 0);
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
