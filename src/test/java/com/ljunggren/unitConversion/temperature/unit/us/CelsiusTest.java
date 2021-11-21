package com.ljunggren.unitConversion.temperature.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.temperature.Temperature;

public class CelsiusTest implements TestUnit {

    private Temperature temperature = new Celsius();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, temperature.toBaseUnit().apply(1.0), 0);
        assertEquals(0, temperature.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, temperature.fromBaseUnit().apply(1.0), 0);
        assertEquals(0, temperature.fromBaseUnit().apply(0.0), 0);
    }

    @Test
    public void systemTest() {
        assertNotNull(temperature.system());
    }

    @Test
    public void labelTest() {
        assertNotNull(temperature.label());
    }

}
