package com.ljunggren.unitConversion.weight.unit.si;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.weight.Weight;

public class OunceTest implements TestUnit {
    
    private Weight weight = new Ounce();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1, weight.toBaseUnit().apply(1.0), 0);
        assertEquals(0, weight.toBaseUnit().apply(0.0), 0);
    }

    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, weight.fromBaseUnit().apply(1.0), 0);
        assertEquals(0, weight.fromBaseUnit().apply(0.0), 0);
    }

    @Test
    public void systemTest() {
        assertNotNull(weight.system());
    }

    @Test
    public void labelTest() {
        assertNotNull(weight.label());
    }

}
