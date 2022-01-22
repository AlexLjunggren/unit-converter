package io.ljunggren.unitConversion.mass.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unitConversion.TestUnit;
import io.ljunggren.unitConversion.mass.Mass;

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
