package com.ljunggren.unitConversion.length.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.length.units.si.Meter;
import com.ljunggren.unitConversion.length.units.us.Foot;
import com.ljunggren.unitConversion.length.units.us.Inch;

public class BaseLengthUsToSiTest {

    private BaseChain baseChain = new BaseLengthUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Inch(), new Meter()).apply(39.37);
        assertEquals(1, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Inch(), new Foot()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
