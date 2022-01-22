package io.ljunggren.unitConversion.mass.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unitConversion.TestUnit;
import io.ljunggren.unitConversion.mass.Mass;

public class OunceTest implements TestUnit {
    
    private Mass mass = new Ounce();

    @Test
    public void toBaseUnitTest() {
        assertEquals(0.0625, mass.toBaseUnit().apply(1.0), 0);
        assertEquals(0, mass.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(16, mass.fromBaseUnit().apply(1.0), 0);
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
