package io.ljunggren.unit.converter.force.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.force.unit.si.Newton;
import io.ljunggren.unit.converter.force.unit.us.PoundForce;

public class BaseForceSiToUsTest {
    
    private BaseChain baseChain = new BaseForceSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Newton(), new PoundForce()).apply(1.0);
        assertEquals(0.2248089431, baseUnit, 0.000000001);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new PoundForce(), new Newton()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
