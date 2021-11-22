package com.ljunggren.unitConversion.temperature.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.temperature.unit.si.Celsius;
import com.ljunggren.unitConversion.temperature.unit.us.Fahrenheit;

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
