package io.ljunggren.unit.converter.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.length.unit.si.Meter;

public class BaseNoChangeTest {

    private BaseChain baseChain = new BaseNoChange();

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Meter(), new Meter()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }
    
}
