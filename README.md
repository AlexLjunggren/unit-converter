## Unit Converter ##

Instantiate

```java
Converter converter = new LengthConverter().fromFeet().toMeters();
```

Convert

```java
converter.convert(3.5);
```

Get unit label

```java
converter.label();
```

## Area ##

```java
new AreaConverter().fromSquareFeet().toSquareMeters();
```

Units (US)
- Square Feet
- Acres

Units (SI)
- Square Meters

## Force ##

```java
new ForceConverter().fromNewtons().toPoundForce();
```

Units (US)
- Pounds (force)

Units (SI)
- Newtons

## Length ##

```java
new LengthConverter().fromFeet().toMeters();
```

Units (US)
- Inches
- Feet
- Yards
- Miles
- Light Years
- Parsecs

Units (SI)
- Millimeters
- Centimeters
- Decimeters
- Meters
- Kilometers

## Mass ##

```java
new MassConverter().fromGrams().toPounds();
```

Units (US)
- Ounces
- Pounds
- Stones

Units (SI)
- Grams
- Kilograms

## Speed ##

```java
new SpeedConverter().fromMilesPerHour().toSpeedOfLight();
```

Units (US)
- Feet per second
- Miles per hour
- Knots

Units (SI)
- Meters per second
- Kilometers per hour
- Speed of light

## Temperature ##

```java
new TemperatureConverter().fromCelsius().toFahrenheit();
```

Units (US)
- Fahrenheit

Units (SI)
- Celsius
- Kelvin

## Volume ##

```java
new VolumeConverter().fromGallons().toLiters();

```

Units (US)
- Teaspoons
- Tablespoons
- Fluid Ounces
- Cups
- Pints
- Quarts
- Gallons

Units (SI)
- Milliliters
- Liters
- Cubic Centimeters
- Cubic Meters

