package io.ljunggren.unitConversion.volume.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unitConversion.TestUnit;
import io.ljunggren.unitConversion.volume.Volume;

public class QuartTest implements TestUnit {
    
    private Volume volume = new Quart();

    @Test
    public void toBaseUnitTest() {
        assertEquals(32, volume.toBaseUnit().apply(1.0), 0);
        assertEquals(0, volume.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, volume.fromBaseUnit().apply(32.0), 0);
        assertEquals(0, volume.fromBaseUnit().apply(0.0), 0);
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
