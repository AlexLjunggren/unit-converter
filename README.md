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

## Length ##

```java
new LengthConverter().fromFeet().toMeters();
```

Units (US)
- Inches
- Feet
- Yards
- Miles

Units (SI)
- Millimeters
- Centimeters
- Decimeters
- Meters
- Kilometers

## Area ##

```java
new AreaConverter().fromSquareFeet().toSquareMeters();
```

Units (US)
- Square Feet
- Acres

Units (SI)
- Square Meters

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

## Speed ##

```java
new SpeedConverter90.fromMilesPerHour().toSpeedOfLight();
```

Units (US)
- Feet per second
- Miles per hour

Units (SI)
- Meters per second
- Kilometers per hour
- Speed of light

## Force ##

```java
new ForceConverter().fromNewtons().toPoundForce();
```

Units (US)
- Pounds (force)

Units (SI)
- Newtons
