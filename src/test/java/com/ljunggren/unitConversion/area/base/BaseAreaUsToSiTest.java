package com.ljunggren.unitConversion.area.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ljunggren.unitConversion.area.units.si.SquareMeter;
import com.ljunggren.unitConversion.area.units.us.SquareFoot;
import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;

public class BaseAreaUsToSiTest {
    
    private BaseChain baseChain = new BaseAreaUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new SquareFoot(), new SquareMeter()).apply(1.0);
        assertEquals(0.0929030341, baseUnit, 10);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new SquareFoot(), new SquareFoot()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
