package io.ljunggren.unitConversion.volume.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unitConversion.TestUnit;
import io.ljunggren.unitConversion.volume.Volume;

public class TablespoonTest implements TestUnit {
    
    private Volume volume = new Tablespoon();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, volume.toBaseUnit().apply(2.0), 0);
        assertEquals(0, volume.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(2, volume.fromBaseUnit().apply(1.0), 0);
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
