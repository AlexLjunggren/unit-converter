package com.ljunggren.unitConversion.length.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.length.units.si.Meter;
import com.ljunggren.unitConversion.length.units.us.Foot;
import com.ljunggren.unitConversion.length.units.us.Inch;

public class BaseLengthSiToUsTest {
    
    private BaseChain baseChain = new BaseLengthSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Meter(), new Inch()).apply(1.0);
        assertEquals(39.37, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Foot(), new Inch()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
