package io.ljunggren.unitConversion.speed.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unitConversion.TestUnit;
import io.ljunggren.unitConversion.speed.Speed;

public class KnotTest implements TestUnit {

    private Speed speed = new Knot();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1.68781, speed.toBaseUnit().apply(1.0), 0);
        assertEquals(0, speed.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, speed.fromBaseUnit().apply(1.68781), 0);
        assertEquals(0, speed.fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(speed.system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(speed.label());
    }
    
}
