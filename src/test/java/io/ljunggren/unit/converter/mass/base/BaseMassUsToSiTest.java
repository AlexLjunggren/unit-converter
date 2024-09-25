package io.ljunggren.unit.converter.mass.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.mass.unit.si.Kilogram;
import io.ljunggren.unit.converter.mass.unit.us.Pound;

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
