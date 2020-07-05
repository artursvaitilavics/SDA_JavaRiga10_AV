# Enums Practice Task 1. - units conversion

1. Create enumerator with as much as possible different length units.
1. In enumerator define a method that converts value to any other measurement units.
```
public double convert(double value, LengthUnit convertToUnit) {
...
}
```

For example:
```
double cm = LengthUnit.METER(1, LengthUnit.CENTIMITER);     // cm = 100
```


# Enums Practice Task 2. 

Write a program:
1. Create `DayOfWeek` enumerator
1. Ask user to enter a number in a range 1 - 7 including
1. Ask user to enter a name of constant (e.g. `MONDAY`)
1. Print day of week for the entered number (use `DayOfWeek.values()`)
1. Print day of week for the entered name. use `DayOfWeek.valueOf()`
1. Print `You entered same day`, if two previous points have same day


# Enums Practice Task 3.

Use previously created planets enum.
Write a program where:
1. Ask user to enter name of a planet (any case). E.g use can enter `Earth`, `earth`, `eArTh` - all should work
2. Print all information about planet - Name, Relative size, Distance from earth
3. Ask user to enter another planet name
4. Print distance between these 2 planets, but don't print 0 if it is the same planet.
5. Use switch to print:
   1. `terrastrial planet` for Mercury, Venus, Earth, Mars
   2. `gas giant` for Jupiter and Saturn
   3. `ice giant` for Uranus and Neptune
