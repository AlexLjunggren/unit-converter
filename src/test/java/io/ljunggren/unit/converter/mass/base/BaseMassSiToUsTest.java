
package io.ljunggren.unit.converter.mass.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.mass.unit.si.Kilogram;
import io.ljunggren.unit.converter.mass.unit.us.Pound;

public class BaseMassSiToUsTest {
    
    private BaseChain baseChain = new BaseMassSiToUs()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new Kilogram(), new Pound()).apply(1.0);
        assertEquals(2.20462, baseUnit, 5);
    }
    
    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new Kilogram(), new Kilogram()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
