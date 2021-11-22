package com.ljunggren.unitConversion.temperature.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.temperature.unit.si.Celsius;
import com.ljunggren.unitConversion.temperature.unit.us.Fahrenheit;

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
