package com.ljunggren.unitConversion.area.units.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.area.Area;

public class AcreTest implements TestUnit {
    
    private Area area = new Acre();

    @Test
    public void toBaseUnitTest() {
        assertEquals(43560, area.toBaseUnit().apply(1.0), 0);
        assertEquals(0, area.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, area.fromBaseUnit().apply(43560.0), 0);
        assertEquals(0, area.fromBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void systemTest() {
        assertNotNull(area.system());
    }
    
    @Test
    public void labelTest() {
        assertNotNull(area.label());
    }
    
}
