package io.ljunggren.unit.converter.temperature.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.temperature.base.BaseTemperatureSiToUs;
import io.ljunggren.unit.converter.temperature.unit.si.Celsius;
import io.ljunggren.unit.converter.temperature.unit.us.Fahrenheit;

public class BaseTemperatureSiToUsTest {
    
    private BaseChain baseChain = new BaseTemperatureSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Celsius(), new Fahrenheit()).apply(0.0);
        assertEquals(32.0, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Celsius(), new Celsius()).apply(32.0);
        assertEquals(32.0, baseUnit, 0);
    }

}
