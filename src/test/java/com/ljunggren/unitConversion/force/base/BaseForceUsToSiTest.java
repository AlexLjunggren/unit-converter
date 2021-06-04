package com.ljunggren.unitConversion.force.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.TestUtils;
import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.force.units.si.Newton;
import com.ljunggren.unitConversion.force.units.us.PoundForce;

public class BaseForceUsToSiTest {
    
    private BaseChain baseChain = new BaseForceUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new PoundForce(), new Newton()).apply(1.0);
        assertEquals(4.4482216153, TestUtils.round(baseUnit, 10), 0);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Newton(), new PoundForce()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}