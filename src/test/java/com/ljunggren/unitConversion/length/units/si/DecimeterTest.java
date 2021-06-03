package com.ljunggren.unitConversion.length.units.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DecimeterTest {

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, new Decimeter().toBaseUnit().apply(10.0), 0);
        assertEquals(0, new Decimeter().toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(10, new Decimeter().fromBaseUnit().apply(1.0), 0);
        assertEquals(0, new Decimeter().fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(new Decimeter().system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(new Decimeter().label());
    }
    
}
