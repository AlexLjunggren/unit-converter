package com.ljunggren.unitConversion.speed.unit.us;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUnit;
import com.ljunggren.unitConversion.speed.Speed;
import com.ljunggren.unitConversion.speed.unit.us.MilePerHour;

public class MilePerHourTest implements TestUnit {

    private Speed speed = new MilePerHour();

    @Test
    public void toBaseUnitTest() {
        assertEquals(1.4666666666, speed.toBaseUnit().apply(1.0), 0.0000000001);
        assertEquals(0, speed.toBaseUnit().apply(0.0), 0);
    }
    
    @Test
    public void fromBaseUnitTest() {
        assertEquals(1, speed.fromBaseUnit().apply(1.4666666666), 0.0000000001);
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
