package io.ljunggren.unit.converter.temperature.unit.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unit.converter.TestUnit;
import io.ljunggren.unit.converter.temperature.Temperature;
import io.ljunggren.unit.converter.temperature.unit.si.Kelvin;

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
