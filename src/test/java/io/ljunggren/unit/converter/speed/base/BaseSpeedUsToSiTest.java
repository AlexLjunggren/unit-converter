package io.ljunggren.unit.converter.speed.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.speed.base.BaseSpeedUsToSi;
import io.ljunggren.unit.converter.speed.unit.si.MeterPerSecond;
import io.ljunggren.unit.converter.speed.unit.us.FootPerSecond;

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
