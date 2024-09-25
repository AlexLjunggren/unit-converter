package io.ljunggren.unit.converter.volume.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ljunggren.unit.converter.base.BaseChain;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.volume.unit.si.Liter;
import io.ljunggren.unit.converter.volume.unit.us.FluidOunce;

public class BaseVolumeUsToSiTest {

    private BaseChain baseChain =  new BaseVolumeUsToSi()
            .nextChain(new BaseNoChange());

    @Test
    public void baseUnitTest() {
        double baseUnit = baseChain.baseUnit(new FluidOunce(), new Liter()).apply(33.8140226);
        assertEquals(1, baseUnit, 0);
    }

    @Test
    public void baseUnitNotTriggeredTest() {
        double baseUnit = baseChain.baseUnit(new FluidOunce(), new FluidOunce()).apply(1.0);
        assertEquals(1, baseUnit, 0);
    }

}
