package com.ljunggren.unitConversion.volume.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.volume.Volume;

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

    @Override
    public void systemTest() {
        assertNotNull(volume.system());
    }

    @Override
    public void labelTest() {
        assertNotNull(volume.label());
    }

}
