package com.ljunggren.unitConversion.weight.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ljunggren.unitConversion.base.BaseChain;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.weight.unit.si.Ounce;
import com.ljunggren.unitConversion.weight.unit.us.Pound;

public class BaseWeightUsToSiTest {
    
    private BaseChain baseChain = new BaseWeightUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Pound(), new Ounce()).apply(1.0);
        assertEquals(16.0, baseUnit, 0);
    }
    
    @Test
    public void baseUnitNoChangeTest() {
        double baseUnit = baseChain.baseUnit(new Pound(), new Pound()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
