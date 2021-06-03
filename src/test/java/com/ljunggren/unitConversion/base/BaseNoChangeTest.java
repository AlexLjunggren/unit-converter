package com.ljunggren.unitConversion.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ljunggren.unitConversion.length.units.si.Meter;

public class BaseNoChangeTest {

    private BaseChain baseChain = new BaseNoChange();

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Meter(), new Meter()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }
    
}
