package io.ljunggren.unit.converter;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import io.ljunggren.unit.converter.Converter;
import io.ljunggren.unit.converter.area.AreaConverter;

public class ConverterTest {

    @Test
    public void nullLablelTest() {
        Converter converter = new Converter(null) {};   
        assertNull(converter.label());
    }
    
    @Test
    public void nullFromTest() {
        Converter converter = new AreaConverter().toAcres();
        assertNull(converter.convert(0.0));
    }
    
    @Test
    public void nullToTest() {
        Converter converter = new AreaConverter().fromAcres();
        assertNull(converter.convert(0.0));
    }

}
