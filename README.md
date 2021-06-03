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
double value = converter.convert(3.5);
```

Units (US)
- Inches
- Feet
- Yards
- Miles

Units (SI)
- Millimeters
- Centimeters
- Meters