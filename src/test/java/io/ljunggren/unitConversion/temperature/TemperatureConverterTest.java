package io.ljunggren.unitConversion.temperature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import io.ljunggren.unitConversion.Converter;

public class TemperatureConverterTest {
    
    @Test
    public void convertNoChangeTest() {
        Converter converter = new TemperatureConverter().fromCelsius().toCelsius();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }    

    @Test
    public void convertFromCelsiusTest() {
        Converter converter = new TemperatureConverter().fromCelsius().toFahrenheit();
        assertEquals(32, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToCelsiusTest() {
        Converter converter = new TemperatureConverter().fromFahrenheit().toCelsius();
        assertEquals(0, converter.convert(32.0), 0);
        assertNull(converter.convert(null));
    }

    @Test
    public void convertFromFahrenheitTest() {
        Converter converter = new TemperatureConverter().fromFahrenheit().toCelsius();
        assertEquals(0, converter.convert(32.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToFahrenheitTest() {
        Converter converter = new TemperatureConverter().fromCelsius().toFahrenheit();
        assertEquals(32, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromKelvinTest() {
        Converter converter = new TemperatureConverter().fromKelvin().toFahrenheit();
        assertEquals(-279.67,converter.convert(100.0), 2);
        assertNull(converter.convert(null));
    }
    @Test
    public void convertToKelvinTest() {
        Converter converter = new TemperatureConverter().fromCelsius().toKelvin();
        assertEquals(373.15, converter.convert(100.0), 0);
        assertNull(converter.convert(null));
    }

}
