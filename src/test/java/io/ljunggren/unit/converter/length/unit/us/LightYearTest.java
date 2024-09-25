package io.ljunggren.unit.converter.length.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.ljunggren.unit.converter.TestUnit;
import io.ljunggren.unit.converter.length.Length;

public class LightYearTest implements TestUnit {

    private Length length = new LightYear();

    @Test
    public void toBaseUnitTest() {
        assertEquals(3.104E+16, length.toBaseUnit().apply(1.0), 0);
        assertEquals(0, length.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, length.fromBaseUnit().apply(3.104E+16), 0);
        assertEquals(0, length.fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(length.system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(length.label());
    }
    
}
