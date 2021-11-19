package com.ljunggren.unitConversion.volume.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.volume.unit.si.Liter;
import com.ljunggren.unitConversion.volume.unit.us.FluidOunce;

public class BaseVolumeSiToUsTest {
    
    private BaseChain baseChain =  new BaseVolumeSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Liter(), new FluidOunce()).apply(1.0);
        assertEquals(33.8140226, baseUnit, 0);
    }

    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Liter(), new Liter()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
