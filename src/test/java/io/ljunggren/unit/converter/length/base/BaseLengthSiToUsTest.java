package io.ljunggren.unit.converter.length.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.length.unit.si.Meter;
import io.ljunggren.unit.converter.length.unit.us.Foot;
import io.ljunggren.unit.converter.length.unit.us.Inch;

public class BaseLengthSiToUsTest {
    
    private BaseChain baseChain = new BaseLengthSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Meter(), new Inch()).apply(1.0);
        assertEquals(3.28084, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Foot(), new Inch()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
