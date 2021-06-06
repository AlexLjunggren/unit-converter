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

## Area ##

```java
new AreaConverter().fromSquareFeet().toSquareMeters().convert(1.0);
```

Units (US)
- Square Feet

Units (SI)
-Square Meters

## Volume ##

```java
new VolumeConverter().fromGallons().toLiters().convert(1.0);

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

## Force ##

```java
new ForceConverter().fromNewtons().toPoundForce().convert(1,0);
```

Units (US)
- Pounds (force)

Units (SI)
- Newtons
