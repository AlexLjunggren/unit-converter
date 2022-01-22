package io.ljunggren.unitConversion.temperature.unit.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unitConversion.TestUnit;
import io.ljunggren.unitConversion.temperature.Temperature;

public class KelvinTest implements TestUnit {
    
    private Temperature temperature = new Kelvin();

    @Test
    public void toBaseUnitTest() {
        assertEquals(-273.15, temperature.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(273.15, temperature.fromBaseUnit().apply(0.0), 0);
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
