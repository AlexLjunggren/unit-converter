package com.ljunggren.unitConversion.area.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ljunggren.unitConversion.area.unit.si.SquareMeter;
import com.ljunggren.unitConversion.area.unit.us.SquareFoot;
import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;

public class BaseAreaUsToSiTest {
    
    private BaseChain baseChain = new BaseAreaUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new SquareFoot(), new SquareMeter()).apply(1.0);
        assertEquals(0.0929030341, baseUnit, 0.000000001);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new SquareFoot(), new SquareFoot()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
