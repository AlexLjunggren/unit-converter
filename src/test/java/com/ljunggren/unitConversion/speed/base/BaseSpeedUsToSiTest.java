package com.ljunggren.unitConversion.speed.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.speed.unit.si.MeterPerSecond;
import com.ljunggren.unitConversion.speed.unit.us.FootPerSecond;

public class BaseSpeedUsToSiTest {

    private BaseChain baseChain = new BaseSpeedUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new FootPerSecond(), new MeterPerSecond()).apply(3.28084);
        assertEquals(1, baseUnit, 0);
    }

    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new FootPerSecond(), new FootPerSecond()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
