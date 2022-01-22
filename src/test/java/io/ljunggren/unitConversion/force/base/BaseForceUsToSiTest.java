package io.ljunggren.unitConversion.force.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unitConversion.base.BaseChain;
import io.ljunggren.unitConversion.base.BaseNoChange;
import io.ljunggren.unitConversion.force.unit.si.Newton;
import io.ljunggren.unitConversion.force.unit.us.PoundForce;

public class BaseForceUsToSiTest {
    
    private BaseChain baseChain = new BaseForceUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new PoundForce(), new Newton()).apply(1.0);
        assertEquals(4.4482216153, baseUnit, 0.000000001);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Newton(), new PoundForce()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
