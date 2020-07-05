package sda.enums;

public enum Planets {
    MERCURY("Smallest", "Mercury", 2),
    VENUS("Earth sized", "Venus", 1),
    EARTH("Perfect", "Earth", 0),
    MARS("Small to Average", "Mars", 1),
    JUPITER("Giant", "Jupiter", 2),
    SATURN("Huge", "Saturn", 3),
    URANUS("BigBlue", "Uranus", 4),
    NEPTUNE("BigCold", "Neptune", 5);

    String size;
    String name;
    int distanceFromEarth;

    Planets(String size, String name, int distanceFromEarth) {
        this.size = size;
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;
    }

    int distanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return size + " " + name;
    }
}
