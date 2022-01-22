package io.ljunggren.unitConversion.temperature.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unitConversion.base.BaseChain;
import io.ljunggren.unitConversion.base.BaseNoChange;
import io.ljunggren.unitConversion.temperature.unit.si.Celsius;
import io.ljunggren.unitConversion.temperature.unit.us.Fahrenheit;

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
