package com.ljunggren.unitConversion.weight.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.weight.unit.si.Ounce;
import com.ljunggren.unitConversion.weight.unit.us.Pound;

public class BaseWeightSiToUsTest {
    
    private BaseChain baseChain = new BaseWeightSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Ounce(), new Pound()).apply(16.0);
        assertEquals(1, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Ounce(), new Ounce()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
