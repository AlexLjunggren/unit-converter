package com.ljunggren.unitConversion.speed.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.speed.units.si.MeterPerSecond;
import com.ljunggren.unitConversion.speed.units.us.FootPerSecond;

public class BaseSpeedSiToUsTest {
    
    private BaseChain baseChain = new BaseSpeedSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new MeterPerSecond(), new FootPerSecond()).apply(1.0);
        assertEquals(3.28084, baseUnit, 0);
    }

    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new MeterPerSecond(), new MeterPerSecond()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
