## Unit Converter ##

Convert units

```java
Converter converter = new LengthConverter().fromFeet().toMeters();
double value = converter.convert(3.5);
```

Get unit label

```java
converter.label();
```

## Length ##

```java
new LengthConverter().fromFeet().toMeters().convert(1.0);
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

## Volume ##

```java
new VolumeConverter().fromGallons().toLiters().convert(1.0);

```

Units (US)
- Teaspoons
- Tablespoons
- Fluid Ounces
- Pint
- Quarts
- Gallons

Units (SI)
- Milliliters
- Liters
- Cubic Meters

## Force ##

```java
new ForceConverter().fromNewtons().toPoundForce().convert(1,0);
```

Units (US)
- Pounds (force)

Units (SI)
- Newtons
