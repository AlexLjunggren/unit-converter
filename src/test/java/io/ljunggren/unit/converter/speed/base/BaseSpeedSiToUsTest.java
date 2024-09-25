package io.ljunggren.unit.converter.speed.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.speed.base.BaseSpeedSiToUs;
import io.ljunggren.unit.converter.speed.unit.si.MeterPerSecond;
import io.ljunggren.unit.converter.speed.unit.us.FootPerSecond;

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
