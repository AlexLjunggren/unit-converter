package io.ljunggren.unitConversion.mass.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unitConversion.base.BaseChain;
import io.ljunggren.unitConversion.base.BaseNoChange;
import io.ljunggren.unitConversion.mass.unit.si.Kilogram;
import io.ljunggren.unitConversion.mass.unit.us.Pound;

public class BaseMassUsToSiTest {
    
    private BaseChain baseChain = new BaseMassUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Pound(), new Kilogram()).apply(1.0);
        assertEquals(0.453592, baseUnit, 6);
    }
    
    @Test
    public void baseUnitNoChangeTest() {
        double baseUnit = baseChain.baseUnit(new Pound(), new Pound()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
