package com.ljunggren.unitConversion.temperature.unit.si;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.temperature.Temperature;

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
