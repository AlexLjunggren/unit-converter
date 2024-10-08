package io.ljunggren.unit.converter.volume;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import io.ljunggren.unit.converter.Converter;

public class VolumeConverterTest {

    @Test
    public void convertNoChangeTest() {
        Converter converter = new VolumeConverter().fromGallons().toGallons();
        assertEquals(1, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }

    @Test
    public void convertFromTeaspoonsTest() {
        Converter converter = new VolumeConverter().fromTeaspoons().toFluidOunces();
        assertEquals(1, converter.convert(6.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToTeaSpoonsTest() {
        Converter converter = new VolumeConverter().fromFluidOunces().toTeaspoons();
        assertEquals(6, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromTablespoonsTest() {
        Converter converter = new VolumeConverter().fromTablespoons().toFluidOunces();
        assertEquals(1, converter.convert(2.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToTablespoonsTest() {
        Converter converter = new VolumeConverter().fromFluidOunces().toTablespoons();
        assertEquals(2, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromFluidOuncesTest() {
        Converter converter = new VolumeConverter().fromFluidOunces().toGallons();
        assertEquals(1, converter.convert(128.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToFluidOuncesTest() {
        Converter converter = new VolumeConverter().fromGallons().toFluidOunces();
        assertEquals(128, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromCupsTest() {
        Converter converter = new VolumeConverter().fromCups().toFluidOunces();
        assertEquals(8, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToCupsTest() {
        Converter converter = new VolumeConverter().fromFluidOunces().toCups();
        assertEquals(1, converter.convert(8.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromPintsTest() {
        Converter converter = new VolumeConverter().fromPints().toFluidOunces();
        assertEquals(16, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToPintsTest() {
        Converter converter = new VolumeConverter().fromFluidOunces().toPints();
        assertEquals(1, converter.convert(16.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromQuartsTest() {
        Converter converter = new VolumeConverter().fromQuarts().toFluidOunces();
        assertEquals(32, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToQuartsTest() {
        Converter converter = new VolumeConverter().fromFluidOunces().toQuarts();
        assertEquals(1, converter.convert(32.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromGallonsTest() {
        Converter converter = new VolumeConverter().fromGallons().toFluidOunces();
        assertEquals(128, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToGallonsTest() {
        Converter converter = new VolumeConverter().fromFluidOunces().toGallons();
        assertEquals(1, converter.convert(128.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromMilliliters() {
        Converter converter = new VolumeConverter().fromMilliliters().toLiters();
        assertEquals(1, converter.convert(1000.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToMilliliters() {
        Converter converter = new VolumeConverter().fromLiters().toMilliliters();
        assertEquals(1000, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromLiters() {
        Converter converter = new VolumeConverter().fromLiters().toCubicMeters();
        assertEquals(1, converter.convert(1000.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToLiters() {
        Converter converter = new VolumeConverter().fromCubicMeters().toLiters();
        assertEquals(1000, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromCubicCentimeters() {
        Converter converter = new VolumeConverter().fromCubicCentimeters().toLiters();
        assertEquals(1, converter.convert(1000.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToCubicCentimeters() {
        Converter converter = new VolumeConverter().fromLiters().toCubicCentimeters();
        assertEquals(1000, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertFromCubicMeters() {
        Converter converter = new VolumeConverter().fromCubicMeters().toLiters();
        assertEquals(1000, converter.convert(1.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void convertToCubicMeters() {
        Converter converter = new VolumeConverter().fromLiters().toCubicMeters();
        assertEquals(1, converter.convert(1000.0), 0);
        assertEquals(0, converter.convert(0.0), 0);
        assertNull(converter.convert(null));
    }
    
    @Test
    public void labelTest() {
        Converter converter = new VolumeConverter().fromGallons().toFluidOunces();
        assertEquals("oz", converter.label());
    }

}
