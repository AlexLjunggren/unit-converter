package com.ljunggren.unitConversion.speed.unit.si;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.speed.Speed;
import com.ljunggren.unitConversion.speed.unit.si.SpeedOfLight;

public class SpeedOfLightTest implements TestUnit {

    private Speed speed = new SpeedOfLight();

    @Test
    public void toBaseUnitTest() {
        assertEquals(2.998e8, speed.toBaseUnit().apply(1.0), 0);
        assertEquals(0, speed.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, speed.fromBaseUnit().apply(2.998e8), 0);
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