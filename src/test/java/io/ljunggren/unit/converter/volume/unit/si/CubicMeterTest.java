package io.ljunggren.unit.converter.volume.unit.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unit.converter.TestUnit;
import io.ljunggren.unit.converter.volume.Volume;

public class CubicMeterTest implements TestUnit {
    
    private Volume volume = new CubicMeter();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1000, volume.toBaseUnit().apply(1.0), 0);
        assertEquals(0, volume.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, volume.fromBaseUnit().apply(1000.0), 0);
        assertEquals(0, volume.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void systemTest() {
        assertNotNull(volume.system());
    }

    @Test
    public void labelTest() {
        assertNotNull(volume.label());
    }

}
