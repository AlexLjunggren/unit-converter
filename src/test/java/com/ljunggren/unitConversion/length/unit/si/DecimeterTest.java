package com.ljunggren.unitConversion.length.unit.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.length.Length;
import com.ljunggren.unitConversion.length.unit.si.Decimeter;

public class DecimeterTest implements TestUnit {
    
    private Length length = new Decimeter();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, length.toBaseUnit().apply(10.0), 0);
        assertEquals(0, length.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(10, length.fromBaseUnit().apply(1.0), 0);
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
