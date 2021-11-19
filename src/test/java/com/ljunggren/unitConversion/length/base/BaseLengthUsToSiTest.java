package com.ljunggren.unitConversion.length.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.length.unit.si.Meter;
import com.ljunggren.unitConversion.length.unit.us.Foot;
import com.ljunggren.unitConversion.length.unit.us.Inch;

public class BaseLengthUsToSiTest {

    private BaseChain baseChain = new BaseLengthUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Inch(), new Meter()).apply(3.28084);
        assertEquals(1, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Inch(), new Foot()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
