package io.ljunggren.unitConversion.temperature;

import io.ljunggren.unitConversion.Converter;
import io.ljunggren.unitConversion.base.BaseNoChange;
import io.ljunggren.unitConversion.temperature.base.BaseTemperatureSiToUs;
import io.ljunggren.unitConversion.temperature.base.BaseTemperatureUsToSi;
import io.ljunggren.unitConversion.temperature.unit.si.Celsius;
import io.ljunggren.unitConversion.temperature.unit.si.Kelvin;
import io.ljunggren.unitConversion.temperature.unit.us.Fahrenheit;

public class TemperatureConverter extends Converter {

    public TemperatureConverter() {
        super(new BaseTemperatureUsToSi()
                .nextChain(new BaseTemperatureSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public TemperatureConverter fromCelsius() {
        return setFrom(new Celsius());
    }
    public TemperatureConverter toCelsius() {
        return setTo(new Celsius());
    }
    
    public TemperatureConverter fromFahrenheit() {
        return setFrom(new Fahrenheit());
    }
    public TemperatureConverter toFahrenheit() {
        return setTo(new Fahrenheit());
    }
    
    public TemperatureConverter fromKelvin() {
        return setFrom(new Kelvin());
    }
    public TemperatureConverter toKelvin() {
        return setTo(new Kelvin());
    }

}
