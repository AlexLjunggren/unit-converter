package io.ljunggren.unit.converter.temperature.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.temperature.unit.si.Celsius;
import io.ljunggren.unit.converter.temperature.unit.us.Fahrenheit;

public class BaseTemperatureUsToSiTest {
    
    private BaseChain baseChain = new BaseTemperatureUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Fahrenheit(), new Celsius()).apply(32.0);
        assertEquals(0.0, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Fahrenheit(), new Fahrenheit()).apply(0.0);
        assertEquals(0.0, baseUnit, 0);
    }

}
