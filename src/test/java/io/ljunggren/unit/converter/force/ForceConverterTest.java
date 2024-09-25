package io.ljunggren.unit.converter.force;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import io.ljunggren.unit.converter.Converter;
import io.ljunggren.unit.converter.force.ForceConverter;

public class ForceConverterTest {

    @Test
    public void converterNoChangeTest() {
        Converter converter = new ForceConverter().fromNewtons().toNewtons();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromPoundForceTest() {
        Converter converter = new ForceConverter().fromPoundForce().toNewtons();
        assertEquals(4.4482216153, converter.convert(1.0), 0.000000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToPoundForceTest() {
        Converter converter = new ForceConverter().fromNewtons().toPoundForce();
        assertEquals(0.2248089431, converter.convert(1.0), 0.000000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }

    @Test
    public void convertFromNewtonsTest() {
        Converter converter = new ForceConverter().fromNewtons().toPoundForce();
        assertEquals(0.2248089431, converter.convert(1.0), 0.000000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToNewtonsTest() {
        Converter converter = new ForceConverter().fromPoundForce().toNewtons();
        assertEquals(4.4482216153, converter.convert(1.0), 0.000000001);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }

    @Test
    public void labelTest() {
        Converter converter = new ForceConverter().fromPoundForce().toNewtons();
        assertEquals("N", converter.label());
    }
    
}
