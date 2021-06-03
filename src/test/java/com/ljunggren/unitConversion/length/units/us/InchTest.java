package com.ljunggren.unitConversion.length.units.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class InchTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, new Inch().toBaseUnit().apply(1.0), 0);
        assertEquals(0, new Inch().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, new Inch().fromBaseUnit().apply(1.0), 0);
        assertEquals(0, new Inch().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Inch().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Inch().label());
    }
    
}
