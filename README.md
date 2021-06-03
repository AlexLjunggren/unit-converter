## Unit Converter ##

Convert units

```java
new LengthConverter().fromFeet().toMeters().convert(3.5);
```

Get unit label

```java
converter.label();
```

## Length ##

```java
Converter converter = new LengthConverter().fromFeet().toMeters();
double value = converter.convert(1);
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

## Force ##

```java
Converter converter = new ForceConverter().fromNewtons().toPoundForce();
double value = converter.convert(1);
```

Units (US)
- Pounds (force)

Units (SI)
- Newtons
