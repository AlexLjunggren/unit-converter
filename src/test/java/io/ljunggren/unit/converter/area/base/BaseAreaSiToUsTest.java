package io.ljunggren.unit.converter.area.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.area.unit.si.SquareMeter;
import io.ljunggren.unit.converter.area.unit.us.SquareFoot;
import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;

public class BaseAreaSiToUsTest {
    
    private BaseChain baseChain = new BaseAreaSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new SquareMeter(), new SquareFoot()).apply(0.0929030341);
        assertEquals(1, baseUnit, 0.000000001);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new SquareMeter(), new SquareMeter()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
