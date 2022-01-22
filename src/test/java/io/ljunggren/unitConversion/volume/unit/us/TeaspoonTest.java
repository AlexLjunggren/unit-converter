package io.ljunggren.unitConversion.volume.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unitConversion.TestUnit;
import io.ljunggren.unitConversion.volume.Volume;

public class TeaspoonTest implements TestUnit {
    
    private Volume volume = new Teaspoon();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, volume.toBaseUnit().apply(6.0), 0);
        assertEquals(0, volume.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(6, volume.fromBaseUnit().apply(1.0), 0);
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
